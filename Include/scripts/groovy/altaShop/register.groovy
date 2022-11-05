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



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.register.001
	// User register with valid input
	@Given("Given User Set method to POST R1")
	def setValidR1() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R1")
	def setValidURLR1() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.001'))
	}

	@And("User input HTTP Body R1")
	def inputValidDataR1() {
		println ("input valid Nama Lengkap, valid Email and Valid Password")
	}

	@And("User click button test Request R1")
	def clickButtonR1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK R1")
	def verifystatusCodeR1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// TC.register.002
	// User register a new account by blank the Nama lengkap field
	@Given("Given User Set method to POST R2")
	def setValidR2() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R2")
	def setValidURLR2() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.002'))
	}

	@And("User input HTTP Body R2")
	def inputValidDataR2() {
		println ("input blank Nama Lengkap, valid Email and Valid Password")
	}

	@And("User click button test Request R2")
	def clickButtonR2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R2")
	def verifystatusCodeR2() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.003
	// User register a new account by blank the Email field
	@Given("Given User Set method to POST R3")
	def setValidR3() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R3")
	def setValidURLR3() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.003'))
	}

	@And("User input HTTP Body R3")
	def inputValidDataR3() {
		println ("input valid Nama Lengkap, blank Email and Valid Password")
	}

	@And("User click button test Request R3")
	def clickButtonR3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R3")
	def verifystatusCodeR3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.004
	// User register a new account by blank the Password field
	@Given("Given User Set method to POST R4")
	def setValidR4() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R4")
	def setValidURLR4() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.004'))
	}

	@And("User input HTTP Body R4")
	def inputValidDataR4() {
		println ("input valid Nama Lengkap, valid Email and blank Password")
	}

	@And("User click button test Request R4")
	def clickButtonR4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R4")
	def verifystatusCodeR4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.005
	// User register a new account by blank Nama Lengkap and Email field
	@Given("Given User Set method to POST R5")
	def setValidR5() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R5")
	def setValidURLR5() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.005'))
	}

	@And("User input HTTP Body R5")
	def inputValidDataR5() {
		println ("input blank Nama Lengkap, blank Email and valid Password")
	}

	@And("User click button test Request R5")
	def clickButtonR5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R5")
	def verifystatusCodeR5() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.006
	// User register a new account by blank Nama Lengkap and Password field
	@Given("Given User Set method to POST R6")
	def setValidR6() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R6")
	def setValidURLR6() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.006'))
	}

	@And("User input HTTP Body R6")
	def inputValidDataR6() {
		println ("input blank Nama Lengkap, valid Email and blank Password")
	}

	@And("User click button test Request R6")
	def clickButtonR6() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R6")
	def verifystatusCodeR6() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.007
	// User register a new account by blank Email and Password field
	@Given("Given User Set method to POST R7")
	def setValidR7() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R7")
	def setValidURLR7() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.007'))
	}

	@And("User input HTTP Body R7")
	def inputValidDataR7() {
		println ("input valid Nama Lengkap, blank Email and blank Password")
	}

	@And("User click button test Request R7")
	def clickButtonR7() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R7")
	def verifystatusCodeR7() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.008
	// User register a new account with invalid Nama Lengkap
	@Given("Given User Set method to POST R8")
	def setValidR8() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R8")
	def setValidURLR8() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.008'))
	}

	@And("User input HTTP Body R8")
	def inputValidDataR8() {
		println ("input invalid Nama Lengkap, valid Email and valid Password")
	}

	@And("User click button test Request R8")
	def clickButtonR8() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R8")
	def verifystatusCodeR8() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.009
	// User register a new account with invalid Email
	@Given("Given User Set method to POST R9")
	def setValidR9() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R9")
	def setValidURLR9() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.009'))
	}

	@And("User input HTTP Body R9")
	def inputValidDataR9() {
		println ("input valid Nama Lengkap, invalid Email and valid Password")
	}

	@And("User click button test Request R9")
	def clickButtonR9() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R9")
	def verifystatusCodeR9() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.010
	// User register a new account with invalid Password
	@Given("Given User Set method to POST R10")
	def setValidR10() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R10")
	def setValidURLR10() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.010'))
	}

	@And("User input HTTP Body R10")
	def inputValidDataR10() {
		println ("input valid Nama Lengkap, valid Email and invalid Password")
	}

	@And("User click button test Request R10")
	def clickButtonR10() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R10")
	def verifystatusCodeR10() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.011
	// User register a new account with invalid Nama lengkap and invalid Email
	@Given("Given User Set method to POST R11")
	def setValidR11() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R11")
	def setValidURLR11() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.011'))
	}

	@And("User input HTTP Body R11")
	def inputValidDataR11() {
		println ("input invalid Nama Lengkap, invalid Email and valid Password")
	}

	@And("User click button test Request R11")
	def clickButtonR11() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R11")
	def verifystatusCodeR11() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.012
	// User register a new account with invalid Nama lengkap and invalid Password
	@Given("Given User Set method to POST R12")
	def setValidR12() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R12")
	def setValidURLR12() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.012'))
	}

	@And("User input HTTP Body R12")
	def inputValidDataR12() {
		println ("input invalid Nama Lengkap, valid Email and invalid Password")
	}

	@And("User click button test Request R12")
	def clickButtonR12() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R12")
	def verifystatusCodeR12() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.013
	// User register a new account with invalid Email and invalid password
	@Given("Given User Set method to POST R13")
	def setValidR13() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R13")
	def setValidURLR13() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.013'))
	}

	@And("User input HTTP Body R13")
	def inputValidDataR13() {
		println ("input valid Nama Lengkap, invalid Email and invalid Password")
	}

	@And("User click button test Request R13")
	def clickButtonR13() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R13")
	def verifystatusCodeR13() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.014
	// User register a new account using Email that already registered
	@Given("Given User Set method to POST R14")
	def setValidR14() {
		println ("Set method POST")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R14")
	def setValidURLR14() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.014'))
	}

	@And("User input HTTP Body R14")
	def inputValidDataR14() {
		println ("input valid Nama Lengkap, registered Email and valid Password")
	}

	@And("User click button test Request R14")
	def clickButtonR14() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request R14")
	def verifystatusCodeR14() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.register.015
	// User register a new account using invalid request method
	@Given("Given User Set method to GET R15")
	def setValidR15() {
		println ("Set method GETT")
	}

	@When("User Set URL https://alta-shop.herokuapp.com/api/auth/register R15")
	def setValidURLR15() {
		println ("https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/TC Register/register.015'))
	}

	@And("User input HTTP Body R15")
	def inputValidDataR15() {
		println ("input valid Nama Lengkap, valid Email and valid Password")
	}

	@And("User click button test Request R15")
	def clickButtonR15() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method not Allowed R15")
	def verifystatusCodeR15() {
		println ("Show the verify result 405 Method not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}