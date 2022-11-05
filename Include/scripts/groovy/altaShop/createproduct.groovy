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



class createproduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.createproduct.001
	// User want to assing a product rating using valid HTTP Method request
	@Given("Given User Set method to POST P1")
	def setValidP1() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/products P1")
	def setValidURLP1() {
		println ("Visit https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/TC Create a new product/createproduct.001'))
	}

	@And("User input HTTP Body P1")
	def inputValidDataP1() {
		println ("input valid count")
	}

	@And("User click button test Request P1")
	def clickButtonP1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK P1")
	def verifystatusCodeP1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// TC.createproduct.002
	// User want to assing a product rating without data usage
	@Given("Given User Set method to POST P2")
	def setValidP2() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/products P2")
	def setValidURLP2() {
		println ("Visit https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/TC Create a new product/createproduct.002'))
	}

	@And("User input HTTP Body P2")
	def inputValidDataP2() {
		println ("input invalid count")
	}

	@And("User click button test Request P2")
	def clickButtonP2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request P2")
	def verifystatusCodeP2() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.createproduct.003
	// User want to assing a product rating using invalid HTTP Method request
	@Given("Given User Set method to GET P3")
	def setValidP3() {
		println ("Set method GET")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/products P3")
	def setValidURLP3() {
		println ("Visit https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/TC Create a new product/createproduct.003'))
	}

	@And("User input HTTP Body P3")
	def inputValidDataP3() {
		println ("input valid count")
	}

	@And("User click button test Request P3")
	def clickButtonP3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method not AllowedP3")
	def verifystatusCodeP3() {
		println ("Show the verify result 405 Method not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}