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



class neworder {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC.neworder.001
	// User want to create a new order using valid HTTP Method request
	@Given("Given User Set method to POST N1")
	def setValidN1() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/orders N1")
	def setValidURLN1() {
		println ("https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/TC Create a new order/neworder.001'))
	}

	@And("User input HTTP Body N1")
	def inputValidDataN1() {
		println ("input valid product id and Valid quantity")
	}

	@And("User click button test Request N1")
	def clickButtonN1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK N1")
	def verifystatusCodeN1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// TC.neworder.002
	// User want to create a new order using invalid HTTP Method request
	@Given("Given User Set method to GET N2")
	def setValidN2() {
		println ("Set method GET")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/orders N2")
	def setValidURLN2() {
		println ("https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/TC Create a new order/neworder.002'))
	}

	@And("User input HTTP Body N2")
	def inputValidDataN2() {
		println ("input valid product id and Valid quantity")
	}

	@And("User click button test Request N2")
	def clickButtonN2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method not Allowed N1")
	def verifystatusCodeN2() {
		println ("Show the verify result 405 Method not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}