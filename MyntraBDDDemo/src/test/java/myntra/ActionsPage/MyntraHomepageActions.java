package myntra.ActionsPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.ElementsPage.MyntraHomepageElements;
import myntra.utilities.DriverSetup;

public class MyntraHomepageActions {
	MyntraHomepageActions  MyntraHomepageActions;
	
public 	 MyntraHomepageActions() {
	 MyntraHomepageActions = new  MyntraHomepageActions();
	 PageFactory.initElements(DriverSetup.chromeDriver, MyntraHomepageActions);
	
}
public void getMyntraHomepage() throws InterruptedException {
	DriverSetup.chromeDriver.get("");
	DriverSetup.chromeDriver.manage().window().maximize();
	DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	DriverSetup.chromeDriver.close();
	Thread.sleep(2000);
}	
public void searchBox() {
	MyntraHomepageActions.searchBox();
}
public void selectImg() {
	MyntraHomepageActions.selectImg();
}	
public void destktopuserTitle() {
	MyntraHomepageActions.destktopuserTitle();
}
}
