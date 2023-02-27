package pages;

import org.openqa.selenium.*;

public class PageSsoLogin {
	WebDriver driver;
	By pgSsoLoginUser = By.name("UserName");
	By pgSsologinPassword = By.xpath("/html/body/div[2]/form/div[3]/div/div/table/tbody/tr[5]/td/div/div[2]/input");
	By pgSsoClicIniciar = By.name("ButtonLogin");
	
		public PageSsoLogin(WebDriver driver) {
			this.driver = driver;	
		}
		
		public void PageSsoSetUser(String usr) {
			driver.findElement(pgSsoLoginUser).clear();
			driver.findElement(pgSsoLoginUser).sendKeys(usr);
			driver.findElement(pgSsoClicIniciar).click();
		}
		
		public void PageSsoSetPasswrd(String psswrd) {
			driver.findElement(pgSsologinPassword).clear();
			driver.findElement(pgSsologinPassword).sendKeys(psswrd);
		}
		
		public void PageSsocliconIniciar() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(pgSsoClicIniciar).click();
		}
		
	 public void PageSSoMainFunction(String correo,String contra) {
		 this.PageSsoSetUser(correo);
		 this.PageSsoSetPasswrd(contra);
		 this.PageSsocliconIniciar();
	 }

	public void PageSSoMainFunction1(String correo, String contra) {
		// TODO Auto-generated method stub
		
	}

	public String PageSsoGetTitle1() {
		// TODO Auto-generated method stub
		return null;
	}
}
