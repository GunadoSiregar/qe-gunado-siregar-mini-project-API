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



class createcom {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.createcom.001
	// User want to create a comment for product using valid HTTP Method request
	@Given("Given User Set method to POST B1")
	def setValidB1() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/products/13/comments B1")
	def setValidURLB1() {
		println ("Visit https://alta-shop.herokuapp.com/api/products/13/comments")
		response = WS.sendRequest(findTestObject('Products/TC create comment for product/createcom.001'))
	}

	@And("User input HTTP Body B1")
	def inputValidDataB1() {
		println ("input valid count")
	}

	@And("User click button test Request B1")
	def clickButtonB1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK B1")
	def verifystatusCodeB1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCodB200)
	}


	// TC.createcom.002
	// User want to create a comment for product using invalid HTTP Method request
	@Given("Given User Set method to GET B2")
	def setValidB2() {
		println ("Set method GET")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/products/13/comments B2")
	def setValidURLB2() {
		println ("Visit https://alta-shop.herokuapp.com/api/products/13/comments")
		response = WS.sendRequest(findTestObject('Products/TC create comment for product/createcom.001'))
	}

	@And("User input HTTP Body B2")
	def inputValidDataB2() {
		println ("input valid count")
	}

	@And("User click button test Request B2")
	def clickButtonB2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method not Allowed B2")
	def verifystatusCodeB2() {
		println ("Show the verify result 405 Method not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}