package tests;

import org.openqa.selenium.WebElement;
import pages.BasePage;
import utilities.LogUtility;
import utilities.SoftAssertion;

public class BaseTest {

	SoftAssertion softAssertion;
	BasePage basePage;

	public BaseTest(BasePage basePage) {
		softAssertion = new SoftAssertion();
		this.basePage = basePage;
	}

	public void assertAll() {
		softAssertion.assertAll();
	}

	public void verifyElementIsDisplayed(WebElement element) {
		String nameOfElement = basePage.getElementName();

		softAssertion.assertTrue(exceptionHandler(element), String.format("%s is displayed", nameOfElement));
	}

	public void verifyElementIsNotDisplayed(WebElement element) {
		String nameOfElement = basePage.getElementName();

		softAssertion.assertFalse(exceptionHandler(element), String.format("%s is NOT displayed", nameOfElement));
	}

	public void verifyElementIsNotDisplayed(int elementCount) {
		String nameOfElement = basePage.getElementName();

		softAssertion.assertEquals(elementCount, 0, String.format("%s is NOT displayed", nameOfElement));
	}

	public void verifyButtonIsDisplayed(WebElement element) {
		String nameOfTheElement = basePage.getElementName();

		String pattern = " button";

		if (nameOfTheElement.contains(pattern)) {
			nameOfTheElement = nameOfTheElement.replace(pattern, "");
		}

		softAssertion.assertTrue(exceptionHandler(element), String.format("%s button is displayed", nameOfTheElement));
	}

	public void verifyTextIsTheSame(String actualTextInElement, String expectedTextInElement) {
		softAssertion.assertEquals(actualTextInElement, expectedTextInElement, String.format("\"%s\" text is displayed", expectedTextInElement));
	}

	public void verifyIfTextIsMarkedAsImportant(WebElement textLabeledAsStrong) {

		String nameOfElement = basePage.getElementName();

		softAssertion.assertTrue(textLabeledAsStrong.isDisplayed(), String.format("\"%s\" text labeled as strong.", nameOfElement));
	}

	private boolean exceptionHandler(WebElement element) {

		boolean defaultValue = false;

		if (element == null) {

			LogUtility.logError("Unable to locate element therefore element is not displayed.");

		} else {

			defaultValue = element.isDisplayed();
		}

		return defaultValue;
	}
}