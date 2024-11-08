import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.wsdl.Fault as Fault
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

WebUI.click(findTestObject('Admin/Customer/Button_Customer'))

String CurrentState = WebUI.getText(findTestObject('Admin/Customer/Check_state_account'))

String UnState = 'Bị khóa'

if (CurrentState == 'Hoạt động') {
    UnState = 'Bị khóa'

    WebUI.click(findTestObject('Admin/Customer/Button_lock_account'))

    if (WebUI.waitForAlert(5)) {
        WebUI.comment('Have a alert')

        WebUI.acceptAlert( // Đóng alert nếu có
            )

        WebUI.verifyElementText(findTestObject('Admin/Customer/Check_state_account'), UnState)

        WebUI.verifyElementText(findTestObject('Admin/General/Check_alert_general_toprightScreen'), 'Cập nhật trạng thái thành công.')
    } else {
        WebUI.comment('No alert appeared.')

        WebUI.verifyElementText(findTestObject('Admin/Customer/Check_state_account'), CurrentState)
    }
    // Đóng alert nếu có
} else {
    UnState = 'Hoạt động'

    WebUI.click(findTestObject('Admin/Customer/Button_unlock_acount'))

    if (WebUI.waitForAlert(5)) {
        WebUI.comment('Have a alert')

        WebUI.acceptAlert()

        WebUI.verifyElementText(findTestObject('Admin/Customer/Check_state_account'), UnState)

        WebUI.verifyElementText(findTestObject('Admin/General/Check_alert_general_toprightScreen'), 'Cập nhật trạng thái thành công.')
    } else {
        WebUI.comment('No alert appeared.')

        WebUI.verifyElementText(findTestObject('Admin/Customer/Check_state_account'), CurrentState)
    }
}

