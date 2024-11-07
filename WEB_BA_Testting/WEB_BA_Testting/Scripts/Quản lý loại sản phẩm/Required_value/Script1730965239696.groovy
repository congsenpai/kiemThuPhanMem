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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Admin/Quản lý loại sản phẩm/Chức Năng Tìm Kiếm/Button_Danh mục'))

WebUI.click(findTestObject('Admin/Quản lý loại sản phẩm/Sửa/button_update_out'))

WebUI.setText(findTestObject('Admin/Quản lý loại sản phẩm/Sửa/input_update_name'), '')

WebUI.click(findTestObject('Admin/Quản lý loại sản phẩm/Sửa/button_update_in'))

String actualTitle = WebUI.getUrl()

WebUI.comment('url' + actualTitle)

// Kiểm tra nếu actualTitle chứa expectedTitle
String expectedTitle = 'http://127.0.0.1:8000/admin/category/edit'

boolean isContained = actualTitle.contains(expectedTitle)

if (isContained) {
        // Hiển thị thông báo alert bằng JavaScript
        WebUI.executeJavaScript("alert('Required Value');", null)
    } else {
        // Hiển thị thông báo lỗi bằng alert
        WebUI.executeJavaScript("alert('Error: The URL does not contain the expected value.');", null)
    }

