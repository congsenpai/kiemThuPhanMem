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

WebUI.click(findTestObject('Register/register_field'))

WebUI.setText(findTestObject('Register/input_name_register'), 'group1')

WebUI.setText(findTestObject('Register/input_email_register'), 'laptrinhmobilecntc@gmail.com')

WebUI.setEncryptedText(findTestObject('Register/input_password_register'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Register/input_confim_password_register'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Register/Button_register'))

WebUI.verifyElementText(findTestObject('null'), 'Mật khẩu nhập lại không khớp.')

WebUI.closeBrowser()

