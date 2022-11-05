import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CucumberKW.runFeatureFile('Include/features/Authentication/info.feature')

CucumberKW.runFeatureFile('Include/features/Authentication/login.feature')

CucumberKW.runFeatureFile('Include/features/Authentication/register.feature')

CucumberKW.runFeatureFile('Include/features/Hello/index.feature')

CucumberKW.runFeatureFile('Include/features/Orders/allorders.feature')

CucumberKW.runFeatureFile('Include/features/Orders/neworder.feature')

CucumberKW.runFeatureFile('Include/features/Orders/orderID.feature')

CucumberKW.runFeatureFile('Include/features/Products/assign.feature')

CucumberKW.runFeatureFile('Include/features/Products/comment.feature')

CucumberKW.runFeatureFile('Include/features/Products/createcom.feature')

CucumberKW.runFeatureFile('Include/features/Products/createproduct.feature')

CucumberKW.runFeatureFile('Include/features/Products/delete.feature')

CucumberKW.runFeatureFile('Include/features/Products/IDproduct.feature')

CucumberKW.runFeatureFile('Include/features/Products/products.feature')

CucumberKW.runFeatureFile('Include/features/Products/rating.feature')

CucumberKW.runFeatureFile('Include/features/Products Category/categories.feature')

CucumberKW.runFeatureFile('Include/features/Products Category/categoryID.feature')

CucumberKW.runFeatureFile('Include/features/Products Category/create.feature')

