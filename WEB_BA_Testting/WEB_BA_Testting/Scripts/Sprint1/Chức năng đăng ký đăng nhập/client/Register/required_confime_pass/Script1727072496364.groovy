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

WebUI.openBrowser('http://127.0.0.1:8000/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Client/Register_client/register_field'))

WebUI.setText(findTestObject('Client/Register_client/input_name_register'), '')

WebUI.setText(findTestObject('Client/Register_client/input_email_register'), '')

WebUI.setEncryptedText(findTestObject('Client/Register_client/input_password_register'), '')

WebUI.setEncryptedText(findTestObject('Client/Register_client/input_confim_password_register'), '')

WebUI.click(findTestObject('Client/Register_client/Button_register'))

WebUI.verifyElementText(findTestObject('Client/Register_client/Require_name_register_alert'), 'Họ tên không được để trống.')

WebUI.verifyElementText(findTestObject('Client/Register_client/Required_email_register_alert'), 'Địa chỉ email không được để trống.')

WebUI.verifyElementText(findTestObject('Client/Register_client/Required_pass_register_alert'), 'Mật khẩu không được để trống.')

WebUI.closeBrowser()

