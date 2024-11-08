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

WebUI.openBrowser('http://127.0.0.1:8000/admin/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Admin/Login/input_Email_email'), 'bao@gmail.com')

WebUI.setEncryptedText(findTestObject('Admin/Login/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Admin/Login/button_ng nhp'))

WebUI.verifyElementText(findTestObject('Admin/General/Check_alert_general_toprightScreen'), 'Xin chào Admin, chào mừng quay trở lại.')

WebUI.click(findTestObject('Admin/PassWord/Button PassSetting'))

WebUI.setEncryptedText(findTestObject('Admin/PassWord/input_old_password'), '123456')

WebUI.setEncryptedText(findTestObject('Admin/PassWord/input_new_password'), 'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Admin/PassWord/input_new_password_confirmation'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Admin/PassWord/button_Save'))

WebUI.verifyElementText(findTestObject('Admin/General/Check_alert_general_toprightScreen'), 'Thay đổi mật khẩu thành công.')

