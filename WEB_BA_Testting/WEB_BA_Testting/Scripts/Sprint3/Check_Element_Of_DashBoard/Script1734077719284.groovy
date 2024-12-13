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

WebUI.click(findTestObject('Admin/Login/button_login'))

WebUI.verifyElementText(findTestObject('Admin/Dashboard/DashBoardElement/Doanh so ban hang'), 'Doanh số bán hàng')

WebUI.verifyElementText(findTestObject('Admin/Dashboard/DashBoardElement/Don hang gan day'), 'Đơn hàng gần đây')

WebUI.verifyElementText(findTestObject('Admin/Dashboard/DashBoardElement/San pham ban chay'), 'Sản phẩm bán chạy')

WebUI.verifyElementText(findTestObject('Admin/Dashboard/DashBoardElement/Tong doanh thu'), 'Tổng doanh thu')

WebUI.verifyElementText(findTestObject('Admin/Dashboard/DashBoardElement/Tong don hang'), 'Tổng đơn hàng')

WebUI.verifyElementText(findTestObject('Admin/Dashboard/DashBoardElement/Tong san pham'), 'Tổng sản phẩm')

WebUI.closeBrowser()

