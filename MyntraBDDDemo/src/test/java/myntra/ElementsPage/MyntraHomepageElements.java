package myntra.ElementsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraHomepageElements {

	@FindBy(className="//*[@class='desktop-searchBar']")
	public WebElement Searchforproductsbandsandmore ;
	@FindBy(id="//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div/div/div/a/div/picture/img")
	public WebElement imgs;
	@FindBy(className="//*[@class=\"desktop-userTitle\"]")
	public WebElement desktopuserTitle;
	
}
