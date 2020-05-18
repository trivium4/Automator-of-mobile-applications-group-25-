import com.sun.org.glassfish.gmbal.Description;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class Ex3 extends CoreTestCase {

    @Test
    public void testCancelSearchEx3() {
        String search_line = "Test";

        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(search_line);
        int amount_of_search_results = SearchPageObject.getAmountOfFoundArticles();

        assertTrue(
                "No search results found",
                amount_of_search_results > 0
        );

        SearchPageObject.clickCancelSearch();
        SearchPageObject.assertThereIsNotResultOfSearch();
    }




}
