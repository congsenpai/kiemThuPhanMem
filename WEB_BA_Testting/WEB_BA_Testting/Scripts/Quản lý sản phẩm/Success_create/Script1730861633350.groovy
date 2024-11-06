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

WebUI.verifyElementText(findTestObject('Admin/Login/Checking_button'), 'Xin chào Admin, chào mừng quay trở lại.')

WebUI.click(findTestObject('Admin/Quản lý sản phẩm/Page_Klever Fruit - Trang qun tr/button_product'))

WebUI.click(findTestObject('Admin/Quản lý loại sản phẩm/Thêm/Button create'))

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/Page_Klever Fruit - Trang qun tr/input_create_name'), 'TH Truemilk')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/Page_Klever Fruit - Trang qun tr/input_create_price'), '20000')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/Page_Klever Fruit - Trang qun tr/input_create_product_code'), 'test')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/Page_Klever Fruit - Trang qun tr/input_create_quantity'), '10')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/Page_Klever Fruit - Trang qun tr/create_describe'), 'món này cũng khá ngon')

WebUI.setText(findTestObject('Admin/Quản lý sản phẩm/Page_Klever Fruit - Trang qun tr/create_describe'), 'món này cũng khá ngon')

WebUI.uploadFile(findTestObject('Admin/Quản lý sản phẩm/Page_Klever Fruit - Trang qun tr/input_create_images'), 'D:\\Web-ban-hang-thuc-pham\\storage\\app\\public\\products\\TestImage.png')

WebUI.click(findTestObject('Admin/Quản lý loại sản phẩm/Thêm/button_Save'))

WebUI.verifyElementText(findTestObject('Admin/Quản lý loại sản phẩm/Thêm/check_created'), 'TH Truemilk')

WebUI.closeBrowser()

