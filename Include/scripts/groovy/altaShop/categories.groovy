package altaShop
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class categories {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.categories.001
	// User want see all categories using valid HTTP Method request
	@Given("User Set method to GET F1")
	def setValidF1() {
		println ("Set method GET")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/categories F1")
	def setValidURLF1() {
		println ("https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('Products Category/TC Get all categories/categories.001'))
	}

	@And("User click button test Request F1")
	def clickButtonF1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK F1")
	def verifystatusCodeF1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// TC.categories.002
	// User want see all categories using invalid HTTP Method request
	@Given("User Set method to POST F2")
	def setValidF2() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/categories F2")
	def setValidURLF2() {
		println ("https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('Products Category/TC Get all categories/categories.002'))
	}

	@And("User click button test Request F2")
	def clickButtonF2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method not Allowed F2")
	def verifystatusCodeF2() {
		println ("Show the verify result 405 Method not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}