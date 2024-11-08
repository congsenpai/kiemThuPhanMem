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

WebUI.click(findTestObject('Admin/Staff/Button_Staff'))

WebUI.click(findTestObject('Admin/General/Button create'))

WebUI.setText(findTestObject('Admin/Staff/input_staff_name'), 'cong')

WebUI.setText(findTestObject('Admin/Staff/input_staff_email'), 'congcoihv5@gmail.com')

WebUI.selectOptionByIndex(findTestObject('Admin/Staff/select_role'), 1)

WebUI.setEncryptedText(findTestObject('Admin/Staff/input_staff_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Admin/Staff/input_password_confirmation'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Admin/Staff/button_Save_create'))

WebUI.verifyElementText(findTestObject('Admin/General/Check_alert_general_toprightScreen'), 'Thêm nhân viên mới thành công.')

