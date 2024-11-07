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

WebUI.click(findTestObject('Admin/Quản lý sản phẩm/button_product'))

WebUI.click(findTestObject('Admin/Quản lý sản phẩm/button_create_out'))

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/input_create_name'), 'TH Truemilk')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/input_create_price'), '20000')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/input_create_product_code'), 'test')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/input_create_quantity'), '10')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/describe_text'), 'món này cũng khá ngon')

WebUI.selectOptionByIndex(findTestObject('Admin/Quản lý sản phẩm/select_create_category'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Admin/Quản lý sản phẩm/select_create_thng_hiu'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Admin/Quản lý sản phẩm/select_create_weigh'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Admin/Quản lý sản phẩm/input_create_images'), 'D:\\Web-ban-hang-thuc-pham\\storage\\app\\public\\products\\TestImage.png')

WebUI.click(findTestObject('Admin/Quản lý sản phẩm/button_Save'))

WebUI.verifyElementText(findTestObject('Admin/Quản lý sản phẩm/p_The name field is required'), 'The name has already been taken.')

