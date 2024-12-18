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

// Mở trình duyệt và đăng nhập

WebUI.openBrowser('http://127.0.0.1:8000/admin/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Admin/Login/input_Email_email'), 'bao@gmail.com')

WebUI.setEncryptedText(findTestObject('Admin/Login/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Admin/Login/button_login'))




// Load file Excel (DataTest)
TestData testData = findTestData('DataDashBoard')

int rowCount = testData.getRowNumbers( // Lấy tổng số dòng trong file Excel
    )

// Lặp qua từng dòng dữ liệu trong file Excel
for (int i = 1; i <= rowCount; i++) {
    // Lấy giá trị tháng và năm từ file Excel
    String month = testData.getValue('Month', i // Giá trị month phải là "1", "2", ...
        )

    String year = testData.getValue('Year', i)

    String expectedValue = testData.getValue('y', i // Giá trị cần kiểm tra trên giao diện
        )

    // Log thông tin đang xử lý
    WebUI.comment((('Đang chọn tháng: ' + month) + ', năm: ') + year)

    // Chọn tháng và năm trên trang web
    WebUI.selectOptionByValue(findTestObject('Admin/Dashboard/DashBoardElement/select_month'), month, false)

    String actualValue1 = '0'

    TestObject tableCell1 = findTestObject('Admin/Dashboard/DashBoardElement/tspan_check')

    TestObject tableCell3 = findTestObject('Admin/Dashboard/DashBoardElement/tspan_960000')

    // Lấy giá trị từ giao diện web
    if (tableCell1 != null) {
        actualValue1 = WebUI.getText(tableCell1)
    } else {
        actualValue1 = WebUI.getText(tableCell3)
    }
    
    // Đặt mặc định là 0
    try {
        if (WebUI.getText(tableCell1) == '0.0') {
            actualValue1 = '0'
        } else {
            actualValue1 = WebUI.getText(tableCell1)
        }
        
        WebUI.comment(actualValue1)
    }
    catch (Exception e) {
        WebUI.comment('Không thể tìm thấy ô dữ liệu, giữ giá trị mặc định là 0.')
    } 
    
    // So sánh giá trị thực tế và mong đợi
    WebUI.verifyMatch(actualValue1, expectedValue, false, FailureHandling.CONTINUE_ON_FAILURE)
}

// Đóng trình duyệt
WebUI.closeBrowser()

