package pages;
import org.openqa.selenium.*;

public class PageSolCtrtds {
	
	WebDriver driver;
	By pgSolCtrtds = By.id("imgPrd1");
	
		public PageSolCtrtds(WebDriver driver) {
			this.driver = driver;
		}
		
		public void PageSolCtrtdsClicBocc() {
			driver.findElement(pgSolCtrtds).click();
		}
		
	public void PageSolCtrtdsMainFunction() {
		this.PageSolCtrtdsClicBocc();
	}
}
