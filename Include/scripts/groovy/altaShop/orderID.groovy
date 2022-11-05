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



class orderID {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.orderID.001
	// User want to see order by ID using valid HTTP Method request
	@Given("User Set method to GET O1")
	def setValidO1() {
		println ("Set method GET")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/orders/1 O1")
	def setValidURLO1() {
		println ("Visit https://alta-shop.herokuapp.com/api/orders/1")
		response = WS.sendRequest(findTestObject('Orders/TC Get Order By ID/orderID.001'))
	}

	@And("User click button test Request O1")
	def clickButtonO1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK O1")
	def verifystatusCodeO1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// TC.orderID.002
	// User want to see order by ID using invalid HTTP Method request
	@Given("User Set method to POST O2")
	def setValidO2() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/orders/1 O2")
	def setValidURLO2() {
		println ("Visit https://alta-shop.herokuapp.com/api/orders/1")
		response = WS.sendRequest(findTestObject('Orders/TC Get Order By ID/orderID.002'))
	}

	@And("User click button test Request O2")
	def clickButtonO2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method not Allowed O1")
	def verifystatusCodeO2() {
		println ("Show the verify result 405 Method not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}