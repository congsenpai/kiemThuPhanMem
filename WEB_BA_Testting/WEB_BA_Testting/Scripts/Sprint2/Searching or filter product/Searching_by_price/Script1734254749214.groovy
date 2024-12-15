import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://127.0.0.1:8000')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Client/Cart/abutton_store'))

WebUI.setText(findTestObject('Client/Cart/input_min_price'), '100000')

WebUI.setText(findTestObject('Client/Cart/input_max_price'), '1000000')

WebUI.click(findTestObject('Client/Cart/button_filter_by_price'))

String actualText = WebUI.getText(findTestObject('Client/Cart/result_by_fillter'))

// Loại bỏ ký tự không mong muốn như 'đ' và ',' để chuyển sang số
String cleanText = actualText.replace(',', '').replace('đ', '').trim()

try {
    // Chuyển đổi chuỗi thành số
    int actualPrice = Integer.parseInt(cleanText)

    // Giá trị min và max
    int minPrice = 100000

    int maxPrice = 1000000

    // So sánh xem giá trị có nằm trong khoảng không
    if ((actualPrice >= minPrice) && (actualPrice <= maxPrice)) {
        KeywordUtil.markPassed(((((('Giá trị ' + actualPrice) + ' thuộc khoảng [') + minPrice) + ', ') + maxPrice) + ']')
    } else {
        KeywordUtil.markFailed(((((('Giá trị ' + actualPrice) + ' không thuộc khoảng [') + minPrice) + ', ') + maxPrice) + 
            ']')
    }
}
catch (NumberFormatException e) {
    KeywordUtil.markFailed((('Không thể chuyển đổi giá trị \'' + actualText) + '\' sang số. Lỗi: ') + e.message)
} 

WebUI.closeBrowser()

