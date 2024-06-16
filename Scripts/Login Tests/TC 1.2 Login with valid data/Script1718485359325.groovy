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

//Open browser
WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/")
WebUI.maximizeWindow()
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'),1)
WebUI.takeScreenshot('D:\\login05.png')
//Click menu button
WebUI.click(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))
//Click login button
WebUI.click(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/a_Login'))
WebUI.takeScreenshot('D:\\login06.png')
//Set username and password
WebUI.setText(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/input_Username_username'), "John Doe")
WebUI.setText(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/input_Password_password'), "ThisIsNotAPassword")
WebUI.takeScreenshot('D:\\login07.png')
//Click login button
WebUI.click(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/button_Login'))
WebUI.takeFullPageScreenshot('D:\\login08.png')




