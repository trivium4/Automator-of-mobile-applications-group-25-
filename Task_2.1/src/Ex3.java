public class Ex3 extends CoreTestCase {

    @Test
    public void testCancelSearchEx3() {
        String search_line = "Array";

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
