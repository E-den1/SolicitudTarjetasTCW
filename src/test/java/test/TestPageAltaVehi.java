package test;
import pages.PageSsoLogin;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

import pages.PageSolCtrtds;
import pages.PageAltaVehi;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestPageAltaVehi {
	WebDriver driver;
	PageSsoLogin objSsoLogin;
	PageSolCtrtds objSolCtrtds;
	PageAltaVehi objtcAltVeh;
	String dpath="C://Prueba/chromedriver.exe";
	String SsoUrl="http://emx-mo-websites-q-01.azurewebsites.net/MX/EdenredSSO/Account/LogOn";
	String CsvPath ="C://Prueba/altav.txt";
	FileReader file;
	CSVReader reader;
	String Valor[];
	//(4,202PBA,202PBA,CC-REGRES01 - CC-REGRES01,SALDO,1,28821,1,8,12,6)
	String tcTIdentificador=null;
	String tcIdentificador=null;
	String tcNoPlaca=null;
	String tcGPS=null;
	String tcSelectCntrCsts=null;
	String tcGrupo=null;
	String tcTipoTecn=null;
	String tcDirecEntr=null;	
	String tcTipoVehi=null;
	String tcMarca=null;
	String tcModelo=null;
	String tcDHorometro=null;
	
	@BeforeTest
	public void Inicializar() {
		System.setProperty("webdriver.chrome.driver", dpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(SsoUrl);
	}
	
	@Test(priority =0)
	public void Test() throws CsvValidationException, IOException {
		objSsoLogin = new PageSsoLogin(driver);
		objSolCtrtds = new PageSolCtrtds(driver);	
		objtcAltVeh = new PageAltaVehi(driver);
		objSsoLogin.PageSSoMainFunction("clientebimbo@mailinator.com", "QWerty101&");
		objSolCtrtds.PageSolCtrtdsMainFunction();
		file = new FileReader(CsvPath);
		reader = new CSVReader(file);
		while((Valor = reader.readNext())  != null){
			tcTIdentificador = Valor[0];
			tcIdentificador =Valor[1];
			tcNoPlaca =Valor[2];
			tcGPS =Valor[3];
			tcSelectCntrCsts =Valor[4];
			tcGrupo =Valor[5];
			tcTipoTecn =Valor[6];
		    tcDirecEntr =Valor[7];
			tcTipoVehi =Valor[8];
			tcMarca =Valor[9];
			tcModelo =Valor[10];
			tcDHorometro =Valor[11];		
			objtcAltVeh.PageSSoAtNvMainFunction(tcTIdentificador, tcIdentificador, tcNoPlaca, tcGPS, tcSelectCntrCsts, tcGrupo, 
					tcTipoTecn, tcDirecEntr,tcTipoVehi,tcMarca,tcModelo,tcDHorometro);
		
		}
		
}}