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



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC.login.001
	// User login with valid input
	@Given("Given User Set method to POST L1")
	def setValidL1() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L1")
	def setValidURLL1() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.001'))
	}

	@And("User input HTTP Body L1")
	def inputValidDataL1() {
		println ("input valid Email and Valid Password")
	}

	@And("User click button test Request L1")
	def clickButtonL1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK L1")
	def verifystatusCodeL1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// TC.login.002
	// User login by blank Email field
	@Given("Given User Set method to POST L2")
	def setValidL2() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L2")
	def setValidURLL2() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.002'))
	}

	@And("User input HTTP Body L2")
	def inputValidDataL2() {
		println ("input valid Password and blank Email")
	}

	@And("User click button test Request L2")
	def clickButtonL2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L2")
	def verifystatusCodeL2() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.login.003
	// User login by blank Password field
	@Given("Given User Set method to POST L3")
	def setValidL3() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L3")
	def setValidURLL3() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.003'))
	}

	@And("User input HTTP Body L3")
	def inputValidDataL3() {
		println ("input valid Email and blank Password")
	}

	@And("User click button test Request L3")
	def clickButtonL3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L3")
	def verifystatusCodeL3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.login.004
	// User login by blank Email and Password field
	@Given("Given User Set method to POST L4")
	def setValidL4() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L4")
	def setValidURLL4() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.004'))
	}

	@And("User input HTTP Body L4")
	def inputValidDataL4() {
		println ("input blank Email and blank Password")
	}

	@And("User click button test Request L4")
	def clickButtonL4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L4")
	def verifystatusCodeL4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.login.005
	// User login using invalid Email
	@Given("Given User Set method to POST L5")
	def setValidL5() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L5")
	def setValidURLL5() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.005'))
	}

	@And("User input HTTP Body L5")
	def inputValidDataL5() {
		println ("input invalid Email and valid Password")
	}

	@And("User click button test Request L5")
	def clickButtonL5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L5")
	def verifystatusCodeL5() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.login.006
	// User login using invalid Password
	@Given("Given User Set method to POST L6")
	def setValidL6() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L6")
	def setValidURLL6() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.006'))
	}

	@And("User input HTTP Body L6")
	def inputValidDataL6() {
		println ("input valid Email and invalid Password")
	}

	@And("User click button test Request L6")
	def clickButtonL6() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L6")
	def verifystatusCodeL6() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.login.007
	// User login using invalid Email and invalid Password
	@Given("Given User Set method to POST L7")
	def setValidL7() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L7")
	def setValidURLL7() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.007'))
	}

	@And("User input HTTP Body L7")
	def inputValidDataL7() {
		println ("input invalid Email and invalid Password")
	}

	@And("User click button test Request L7")
	def clickButtonL7() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L7")
	def verifystatusCodeL7() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.login.008
	// User login using unregistered Email
	@Given("Given User Set method to POST L8")
	def setValidL8() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L8")
	def setValidURLL8() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.008'))
	}

	@And("User input HTTP Body L8")
	def inputValidDataL8() {
		println ("input unregistered Email and valid Password")
	}

	@And("User click button test Request L8")
	def clickButtonL8() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L8")
	def verifystatusCodeL8() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.login.009
	// User login using invalid request method
	@Given("Given User Set method to GET L9")
	def setValidL9() {
		println ("Set method GET")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/login L9")
	def setValidURLL9() {
		println ("https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/TC Login/login.009'))
	}

	@And("User input HTTP Body L9")
	def inputValidDataL9() {
		println ("input valid Email and valid Password")
	}

	@And("User click button test Request L9")
	def clickButtonL9() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method not Allowed L9")
	def verifystatusCodeL9() {
		println ("Show the verify result 405 Method not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}