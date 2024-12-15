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

WebUI.openBrowser('http://127.0.0.1:8000')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Client/Check_out/a_store'))

WebUI.click(findTestObject('Client/Check_out/icheck detail'))

WebUI.click(findTestObject('Client/Check_out/button_add cart'))

WebUI.click(findTestObject('Client/Check_out/Page_Biolife - Organic Food/Cart'))

WebUI.click(findTestObject('Client/Check_out/a_Check_out'))

WebUI.waitForPageLoad(6)

WebUI.setText(findTestObject('Client/Check_out/input_name'), 'giabao')

WebUI.setText(findTestObject('Client/Check_out/Page_Biolife - Organic Food/input__email'), 'giabao088@gmail.com')

WebUI.setText(findTestObject('Client/Check_out/input_phone'), '0888379199')

WebUI.setText(findTestObject('Client/Check_out/input_address'), 'Thái Bình')

WebUI.setText(findTestObject('Client/Check_out/input_note'), 'không có')

WebUI.click(findTestObject('Client/Check_out/span_using_cash'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Client/Check_out/button_get_order'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Client/Check_out/Page_Biolife - Organic Food/check_success'), 'Đặt hàng thành công')

WebUI.closeBrowser()

