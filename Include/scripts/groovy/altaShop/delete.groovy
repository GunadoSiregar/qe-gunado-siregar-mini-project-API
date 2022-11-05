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



class delete {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.delete.001
	// User want to see index using valid HTTP Method request
	@Given("User Set method to DELETE E1")
	def setValidE1() {
		println ("Set method DEKETE")
	}

	@When("https://alta-shop.herokuapp.com/api/products/1 E1")
	def setValidURLE1() {
		println ("Visit https://alta-shop.herokuapp.com/api/products/1")
		response = WS.sendRequest(findTestObject('Products/TC Delete Products/delete.001'))
	}

	@And("User click button test Request E1")
	def clickButtonE1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK E1")
	def verifystatusCodeE1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// TC.delete.002
	// User want to see index using valid HTTP Method request
	@Given("User Set method to POST E2")
	def setValidE2() {
		println ("Set method POST")
	}

	@When("https://alta-shop.herokuapp.com/api/products/1 E2")
	def setValidURLE2() {
		println ("Visit https://alta-shop.herokuapp.com/api/products/1")
		response = WS.sendRequest(findTestObject('Products/TC Delete Products/delete.002'))
	}

	@And("User click button test Request E2")
	def clickButtonE2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method not Allowed E2")
	def verifystatusCodeE2() {
		println ("Show the verify result 405 Method not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
}