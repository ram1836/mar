package RAM.RAM.step;

import com.automacent.fwk.annotations.Pages;
import com.automacent.fwk.annotations.Step;
import com.automacent.fwk.core.WebTestSteps;
import RAM.RAM.page.GoogleSearchPage;

public class GoogleSearchSteps extends WebTestSteps {
	@Pages
	private GoogleSearchPage googleSearchPage;

	@Step
	public void performGoogleSearch(String keyword) {
		googleSearchPage.enterSearchKeyword(keyword);
		googleSearchPage.clickGoogleSearchButton();
	}

}