import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/EVS7.1_OR/Page_EVA 7.0  Home/a_Company List'))

WebUI.setText(findTestObject('Object Repository/EVS7.1_OR/Page_EVA 7.0/input_Name Other Acronym_ctl00'), 'national democratic institute')

WebUI.click(findTestObject('EVS7.1_OR/Page_EVA 7.0/btnSearch'))

WebUI.click(findTestObject('EVS7.1_OR/Page_EVA 7.0/li_Delete_fa fa-search'))

WebUI.click(findTestObject('EVS7.1_OR/Page_EVA 7.0/btnCompanyProfile'))

WebUI.click(findTestObject('EVS7.1_OR/Page_EVA 7.0/btnGenerate'))

WebUI.verifyElementAttributeValue(findTestObject('EVS7.1_OR/Page_EVA 7.0/input__ctl00ContentPlaceHolder'), 'class', 'form-control Req ReqC invalid', 
    0)

WebUI.setText(findTestObject('Object Repository/EVS7.1_OR/Page_EVA 7.0/input__ctl00ContentPlaceHolder'), 'jo-123456')

WebUI.setText(findTestObject('EVS7.1_OR/Page_EVA 7.0/input__ctl00ContentPlaceHolder_1'), 'test')

WebUI.click(findTestObject('EVS7.1_OR/Page_EVA 7.0/btnGenerate'))

WebUI.waitForElementVisible(findTestObject('EVS7.1_OR/Page_EVA 7.0/div_Company Profile'), 1)

WebUI.setText(findTestObject('EVS7.1_OR/Page_EVA 7.0/input__ctl00ContentPlaceHolder'), 'jo123456')

WebUI.setText(findTestObject('EVS7.1_OR/Page_EVA 7.0/input__ctl00ContentPlaceHolder_1'), 'test')

WebUI.selectOptionByLabel(findTestObject('EVS7.1_OR/Page_EVA 7.0/ddlRelationshipToPA'), 'PA', false)

WebUI.waitForAngularLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('EVS7.1_OR/Page_EVA 7.0/btnGenerate'))

WebUI.verifyTextNotPresent('PA\'s Name', false)

WebUI.setText(findTestObject('EVS7.1_OR/Page_EVA 7.0/input__ctl00ContentPlaceHolder_1'), 'hello')

WebUI.selectOptionByLabel(findTestObject('EVS7.1_OR/Page_EVA 7.0/ddlRelationshipToPA'), 'Father', false)

WebUI.waitForAngularLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('EVS7.1_OR/Page_EVA 7.0/btnGenerate'))

WebUI.verifyElementVisible(findTestObject('Page_EVA 7.0/td_PAs Name'))

