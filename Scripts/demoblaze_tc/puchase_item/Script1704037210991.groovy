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

WebUI.click(findTestObject('Object Repository/demoblaze/purchase_item/img_CATEGORIES_card-img-top img-fluid'))

WebUI.click(findTestObject('Object Repository/demoblaze/purchase_item/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/demoblaze/purchase_item/a_Cart'))

WebUI.click(findTestObject('Object Repository/demoblaze/purchase_item/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/demoblaze/purchase_item/input_Name_name'), 'miftah')

WebUI.setText(findTestObject('Object Repository/demoblaze/purchase_item/input_Country_country'), 'indonesia')

WebUI.setText(findTestObject('Object Repository/demoblaze/purchase_item/input_City_city'), 'pasuruan')

WebUI.setText(findTestObject('Object Repository/demoblaze/purchase_item/input_Credit card_card'), '99776498234567654323')

WebUI.setText(findTestObject('Object Repository/demoblaze/purchase_item/input_Month_month'), '01')

WebUI.setText(findTestObject('Object Repository/demoblaze/purchase_item/input_Year_year'), '2030')

WebUI.click(findTestObject('Object Repository/demoblaze/purchase_item/button_Purchase'))

WebUI.click(findTestObject('Object Repository/demoblaze/purchase_item/button_OK'))

WebUI.closeBrowser()

