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

WebUI.openBrowser('https://aeme-concierge-desk.testmaya.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/input_American Express Concierge_form-control'), 
    'arunkumars')

WebUI.setEncryptedText(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/input_American Express Concierge_form-control_1'), 
    'tARHaqa60ju//MddRPCCFA==')

WebUI.verifyElementVisible(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/a_Sign In'))

WebUI.click(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/a_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/h2_Search'), 'Search')

WebUI.verifyElementText(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/label_Client ID'), 'Client ID')

WebUI.click(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/label_Client ID'))

WebUI.setText(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/input_PNR_form-control'), '10001956')

WebUI.getAttribute(findTestObject('AMEX_HomePage/Page_Amex/input_PNR_form-control'), 'value')

WebUI.click(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/a_Search'))

WebUI.click(findTestObject('Object Repository/AMEX_HomePage/Page_Amex/a_Hi, Arunkumars'))

