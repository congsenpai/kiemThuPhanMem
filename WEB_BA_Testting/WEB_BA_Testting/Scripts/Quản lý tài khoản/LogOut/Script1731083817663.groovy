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

// Mở trình duyệt và truy cập trang đăng nhập
WebUI.openBrowser('http://127.0.0.1:8000/admin/login')

WebUI.maximizeWindow()

// Nhập email và mật khẩu
WebUI.setText(findTestObject('Admin/Login/input_Email_email'), 'bao@gmail.com')
WebUI.setEncryptedText(findTestObject('Admin/Login/input_Password_password'), 'aeHFOx8jV/A=')

// Nhấn nút Đăng nhập
WebUI.click(findTestObject('Admin/Login/button_login'))

// Xác minh thông báo chào mừng
WebUI.verifyElementText(findTestObject('Admin/General/Check_alert_general_toprightScreen'), 'Xin chào Admin, chào mừng quay trở lại.')

// Đăng xuất
WebUI.click(findTestObject('Admin/PassWord/aButton_logout'))

// Kiểm tra URL hiện tại sau khi đăng xuất
String currentUrl = WebUI.getUrl()
String expectedUrl = 'http://127.0.0.1:8000/admin/login'

// Xác minh URL sau khi đăng xuất
WebUI.verifyMatch(currentUrl, expectedUrl, false)
//Tham số false chỉ định rằng phương thức này không phân biệt chữ hoa và chữ thường khi so sánh