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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil


WebUI.openBrowser('http://127.0.0.1:8000/admin/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Admin/Login/input_Email_email'), 'bao@gmail.com')

WebUI.setEncryptedText(findTestObject('Admin/Login/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Admin/Login/button_ng nhp'))

WebUI.verifyElementText(findTestObject('Admin/Login/Checking_button'), 'Xin chào Admin, chào mừng quay trở lại.')


WebUI.click(findTestObject('Admin/Quản lý thương hiệu/Button_brand'))

WebUI.click(findTestObject('Admin/Quản lý thương hiệu/Button_create_in'))

WebUI.setText(findTestObject('Admin/Quản lý thương hiệu/input_brands_name'), 'TH TrueMilk')

WebUI.click(findTestObject('Admin/Quản lý thương hiệu/button_Save'))

String checkCreateUrl = 'http://127.0.0.1:8000/admin/brand/create'

String checkUpdateUrl = 'http://127.0.0.1:8000/admin/brand/update'


String currentUrl = WebUI.getUrl()
boolean create = currentUrl.contains(checkCreateUrl)

if (create) {
    // Hiển thị thông báo alert bằng JavaScript
    WebUI.comment("Required Value or Data Existed")
} else {
    // Hiển thị thông báo lỗi bằng alert
    WebUI.comment("Error: The URL does not contain the expected value.")
}




	



