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

WebUI.click(findTestObject('Client/Cart/sbutton menu'))

WebUI.click(findTestObject('Client/Cart/button_filter_by_category'))

// Lấy kết quả tìm kiếm
String searchCheck = 'th truemilk update'

String actualText = WebUI.getText(findTestObject('Client/Cart/result-by_search_or_categoriment_filter')).toLowerCase()

WebUI.comment(actualText)

// Kiểm tra và báo kết quả test
if (actualText.contains(searchCheck.toLowerCase())) {
    KeywordUtil.markPassed('Kết quả tìm kiếm chứa chuỗi mong muốn: ' + searchCheck)

    WebUI.closeBrowser()
} else {
    KeywordUtil.markFailed('Kết quả tìm kiếm không chứa chuỗi: ' + searchCheck)
}

WebUI.closeBrowser()

