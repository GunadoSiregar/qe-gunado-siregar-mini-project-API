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



class info {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.info.001
	// GET user Info with valid HTTP Method and valid API URL
	@Given("User Set method to GET I1")
	def setValidI1() {
		println ("Set method GET")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/info I1")
	def setValidURLI1() {
		println ("Visit https://alta-shop.herokuapp.com/api/auth/info")
		response = WS.sendRequest(findTestObject('Authentication/TC Info/info.001'))
	}

	@And("User click button test Request I1")
	def clickButtonI1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK I1")
	def verifystatusCodeI1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// TC.info.002
	// GET user info with valid HTTP Method and invalid API URL
	@Given("User Set method to GET I2")
	def setValidI2() {
		println ("Set method GET")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/info I2")
	def setValidURLI2() {
		println ("Call to https://alta-shop.herokuapp.com/api/auth/inf")
		response = WS.sendRequest(findTestObject('Authentication/TC Info/info.002'))
	}

	@And("User click button test Request I2")
	def clickButtonI2() {
		println ("User click button test Request I2")
	}

	@Then("Show the verify result 400 not found I2")
	def verifystatusCodeI2() {
		println ("Show the verify result 400 not found")
		WS.verifyResponseStatusCode(400, GlobalVariable.statusCode400)
	}
}