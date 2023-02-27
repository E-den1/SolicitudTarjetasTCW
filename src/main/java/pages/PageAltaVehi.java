package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PageAltaVehi {
	WebDriver driver;
	By tcMenGestDatos = By.partialLinkText("Gestión de datos");
	By tcMenVehi = By.partialLinkText("Vehículo");
	By tcBtnNuevo = By.xpath("/html/body/form/div[3]/div/div[4]/div[3]/input[1]");
	By tcTIdentificador = By.xpath ("/html/body/form/div[3]/div/div[4]/div[4]/div[1]/div[2]/div/div/select[1]");
	By tcIdentificador = By.xpath("/html/body/form/div[3]/div/div[4]/div[4]/div[1]/div[2]/div/div/input[7]");
	By tcNoPlaca = By.xpath("/html/body/form/div[3]/div/div[4]/div[4]/div[1]/div[2]/div/div/input[13]");
	By tcGPS = By.xpath("/html/body/form/div[3]/div/div[4]/div[4]/div[1]/div[2]/div/div/div[3]/input[1]");
	By tcCentrCsts = By.xpath("/html/body/form/div[3]/div/div[4]/div[4]/div[2]/div[1]/div");
	By divLoading = By.xpath("//div[@id='wrapperLoading']");
	/*Variables de Centros de Costos*/
	By tcSelectCntrCsts = By.xpath("/html/body/form/div[3]/div/div[4]/div[4]/div[2]/div[2]/div/div/span[1]/span/input");
	By dropListCntrCstos = By.xpath("//input[@name=\"ctl00$contenido$editarVehiculo$cpCentroCostos$CentroCostosPorcentual$drpCostCenter_input\"]");
	By lnkCtroCostos = By.xpath("//*[@id='ctl00_contenido_editarVehiculo_cpCentroCostos_CentroCostosPorcentual_lnkCostCenter']");
	By listaCostos = By.xpath ("//div[@class=\"tcPanelIconArrowUp\"]");
	/*Variables de Grupos*/
	By tcGrupo = By.xpath("//input[@name=\"ctl00$contenido$editarVehiculo$cpGenerales$Tipo\"]");
	By tcGrupoTarj = By.xpath("//input[@name=\"ctl00$contenido$editarVehiculo$cpGenerales$Tipo\"]");
	By lnkGpo = By.xpath("(//div[@class=\"tcPanelIconArrowUp\"])[3]");
	By dropListGpo = By.xpath ("//*[@id=\"autocompleteGrupoTarjeta\"]");
	By listaGrupo = By.xpath("//ul[@id='autocompleteGrupoTarjeta_listbox']/li");
	By tcBtnSelecTarj = By.xpath("//div[@id='ctl00_contenido_editarVehiculo_cpSolicitarTarjeta_Tarjeta_pnlCardOrder']/span/label");
	By tcTipoTecn = By.id("drpTypeTechnology");
	By tcDirecEntr = By.xpath("//div[@id='divVirtualCard']/select");
	By tcBtnSimular = By.name ("ctl00$contenido$editarVehiculo$cpSolicitarTarjeta$Tarjeta$btnSimulate");
	By tcBtnAceptar = By.xpath("/html[@class='k-webkit k-webkit96']/body[1]/div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-dialog-buttons ui-draggable ui-resizable']/div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div[@class='ui-dialog-buttonset']/button[@class='ui-button ui-corner-all ui-widget']");
	/*Variables Ficha Técnica*/
	By tcFichTecn = By.xpath ("/html/body/form/div[3]/div/div[4]/div[4]/div[6]/div[1]/div");
	By tcFichTecnSist = By.xpath("/html/body/form/div[3]/div/div[4]/div[4]/div[6]/div[2]/div/div/div[1]/span[3]/label");
	By tcTipoVehi = By.xpath("//select[@id='drpTipoVehiculo2']");
	By tcMarca = By.xpath ("/html/body/form/div[3]/div/div[4]/div[4]/div[6]/div[2]/div/div/div[2]/fieldset/select[2]");
    By tcModelo = By.xpath("//select[@id='drpModelo2']");
	/*Variables Rendimiento del Motor*/
    By tcRendMotor = By.xpath("//div[@id='ctl00_contenido_editarVehiculo_cpRendimientoMotor_Header']/div");
    By tcDHorometro = By.id("ctl00_contenido_editarVehiculo_cpRendimientoMotor_RendimientoMotor_txtHorometro");
    By tcBtnGuardar = By.xpath ("//div[@id='tcMainPanel']/div[6]/input");
	
    
	    public PageAltaVehi (WebDriver driver) {
		 this.driver=driver;
	    }
	 
	 	public void PageAltaVehiPrincipal() {
	 		driver.findElement(tcMenGestDatos).click();
	 		try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		driver.findElement(tcMenVehi).click();
	 	}
	 	
	 	public void divLoadingNoVisible() {
	 		@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 30);
	 		wait.until(ExpectedConditions.invisibilityOfElementLocated(divLoading));
	 	}
	 	
	 	public void PageAltaVehiPrincipal1ClicBuscar() {
	 		driver.findElement(tcBtnNuevo).click();
	 	}
	 	
	 	/*Selecciona tipo de Identificador*/ 
	 	 /* 3. IDENTIFICACION
	 	  * 4. PLACA
	 	  * 5. CHASIS
	 	  */
	 	public void PageAltaVehiPrincipal1Nuevo(String tidentificador) {
	 		Select  object1 = new Select(driver.findElement(tcTIdentificador));
	 		object1.selectByValue(tidentificador);
	 	}
	 	
	 
	 	/*Envía identificador*/
	 	public void PageAltaVehiPrincipal2InfoGeneral(String identificador) {
	 		driver.findElement(tcIdentificador).clear();
			driver.findElement(tcIdentificador).sendKeys(identificador);
			System.out.println (identificador);
			}
	 	
	 	/*Envía No. placa*/
	 	public void PageAltaVehiPrincipal21InfoGeneral(String placa) {
	 		driver.findElement(tcNoPlaca).clear();
			driver.findElement(tcNoPlaca).sendKeys(placa);
			System.out.println (placa);
	 	}
	 	
		/*Envía No. GPS*/
	 	public void PageAltaVehiPrincipal22GPS(String GPS) {
	 		driver.findElement(tcGPS).clear();
			driver.findElement(tcGPS).sendKeys(GPS);
			System.out.println (GPS);
	 	}
	 	
	 	
	 	/*Selecciona panel centro de costos*/
	 	public void PageAltaVehiPrincipal3CtroCsts() {
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        WebElement tcCentrCstsMnuDespl = driver.findElement(tcCentrCsts);
	        js.executeScript("arguments[0].click();", tcCentrCstsMnuDespl );
	 		//driver.findElement(tcCentrCsts).click();
	        divLoadingNoVisible();
	 	}
	 
	 	/*Selecciona centro de costos*/
	 	public void PageAltaVehiPrincipal3EnviaCtroCsts(String centro){
	 		try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		Actions action = new Actions(driver);
	 		WebElement weLnk = driver.findElement(lnkCtroCostos);
	 		action.moveToElement(weLnk).build().perform();
	 		driver.findElement(dropListCntrCstos).sendKeys(centro);
	 		System.out.println(centro);
	 		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
	 		driver.findElement(listaCostos).click();
	    	}

	 	    /*Selecciona panel grupo de tarjetas*/
		    public void PageAltaVehiPrincipal4GruposTarjetas() {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
	 		WebElement tcGrupoMnuDespl = driver.findElement(tcGrupo);
	 		js.executeScript("arguments[0].click();", tcGrupoMnuDespl );
	 		divLoadingNoVisible();
	 	    }
	 	
		    /*Selecciona grupo de tarjetas*/
		    public void PageAltaVehiPrincipal41GruposTarjetas(String grupo) {
				try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Actions action = new Actions(driver);
	 		WebElement weLnk = driver.findElement(lnkGpo);
	 		action.moveToElement(weLnk).build().perform();
	 		driver.findElement(dropListGpo).sendKeys(grupo);
	 		System.out.println(grupo);
	 		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		driver.findElement(listaGrupo).click();
		
		    }
		
		    /*Clic en botón Solicitar Tarjeta*/
		    public void PageAltaVehiPrincipal42SolicitarTarj() {
	 		driver.findElement(tcBtnSelecTarj).click();
	     	}
		    
		    /*Selecciona tipo de tecnología*/
		    /* 1. Tarjeta Física
		     * 4. Tarjeta Virtual
		     */
	 	    public void PageAltaVehiPrincipa43TipoTecn(String tecnologia) {
	 		Select  object3 = new Select(driver.findElement(tcTipoTecn));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Actions action = new Actions(driver);
	 		WebElement weLnk = driver.findElement(tcTipoTecn);
	 		action.moveToElement(weLnk).build().perform();
	 		object3.selectByValue(tecnologia);
	 		System.out.println (tecnologia);
	 	    }
	 	    
	 	    /*Selecciona dirección de entrega*/
	 	    /* 28821 CLIENTE_R3_FASE1_02*/
	        public void PageAltaVehiPrincipal44DirecEntrega(String direccion) {
	 		Select  object4 = new Select(driver.findElement(tcDirecEntr));
	 		object4.selectByValue(direccion);
	 		System.out.println (direccion);
	 	    }
	        
	        /*Clic en botón Simular*/
	        public void PageAltaVehiPrincipal45ClicSimular() {
	 		driver.findElement(tcBtnSimular).click();
	        }
	 	
	        /*Muestra similuación de tarjetas y clic en aceptar*/
	        
	 	    public void PageAltaVehiPrincipal46ClicAceptar() {
	 	    	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 	    	Actions action = new Actions(driver);
		 		WebElement weLnk = driver.findElement(tcBtnAceptar);
		 		action.moveToElement(weLnk).build().perform();
	 		driver.findElement(tcBtnAceptar).click();
	 	    }
	 	    
	 	    /*Selecciona Ficha Técnica*/
	 		public void PageAltaVehiPrincipal5FichaTecnica() {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
            WebElement tcFichaMnuDespl = driver.findElement(tcFichTecn);
            js.executeScript("arguments[0].click();", tcFichaMnuDespl );
	 	    }
	 	
	 		/*Selecciona opción Ficha Técnica del Sistema*/
	 	    public void PageAltaVehiPrincipal51FichaTecnicaSist() {
	 		driver.findElement(tcFichTecnSist).click();
	 	    }
	 	
	 	    /*Selecciona Tipo Vehículo*/
	     	public void PageAltaVehiPrincipal52TipoVehi(String vehi) {
	 		Select  object5 = new Select (driver.findElement(tcTipoVehi));
	 		object5.selectByValue(vehi);
	 		System.out.println (vehi);
	 	    }
	 	
	     	/*Selecciona Marca*/
		    public void PageAltaVehiPrincipal52Marca(String marca) {
	 		Select  object5 = new Select(driver.findElement(tcMarca));
	 		object5.selectByValue(marca);
	 		System.out.println (marca);
	 	    }
		
		    /*Selecciona Modelo*/
		    public void PageAltaVehiPrincipal53Modelo(String modelo) {
	 		Select  object6 = new Select(driver.findElement(tcModelo));
	 		object6.selectByValue(modelo);
	 		System.out.println (modelo);
	     	}
		
		    /*Selecciona panel Rendiemiento del Motor*/
		    public void PageAltaVehiPrincipal6RendimientoMotor() {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
            WebElement tcRendMtr = driver.findElement(tcRendMotor);
            js.executeScript("arguments[0].click();", tcRendMtr);
	     	}
		
		    /*Envia no. Horometro*/
		    public void PageAltaVehiPrincipal61Horometro(String horometro) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(tcDHorometro).clear();
			driver.findElement(tcDHorometro).sendKeys(horometro);
			System.out.println (horometro);
	 		//driver.findElement(tcFichTecn).click();
	 	    }
		
		    /*Clic en botón Guardar*/
	 	    public void PageAltaVehiPrincipal7Guardar() {
	 		driver.findElement(tcBtnGuardar).click();
	 	    }
	 	   
		
	 	
	 	
	 	    public void PageSSoAtNvMainFunction(String v1,String v2, String v3,String v4,String v5, String v6, String v7, String v8, String v9, String v10, String v11, String v12) {
			this.PageAltaVehiPrincipal();
			this.PageAltaVehiPrincipal1ClicBuscar();
			this.PageAltaVehiPrincipal1Nuevo(v1);
			this.divLoadingNoVisible();
			this.PageAltaVehiPrincipal2InfoGeneral(v2);
			this.PageAltaVehiPrincipal21InfoGeneral(v3);
			this.PageAltaVehiPrincipal22GPS(v4); 
			this.PageAltaVehiPrincipal3CtroCsts();
			this.PageAltaVehiPrincipal3EnviaCtroCsts (v5);
			this.PageAltaVehiPrincipal4GruposTarjetas();
			this.PageAltaVehiPrincipal41GruposTarjetas(v6);	
			this.PageAltaVehiPrincipal42SolicitarTarj();
			this.PageAltaVehiPrincipa43TipoTecn(v7);
			this.PageAltaVehiPrincipal44DirecEntrega(v8);
			this.PageAltaVehiPrincipal45ClicSimular();
			this.PageAltaVehiPrincipal46ClicAceptar();
			this.PageAltaVehiPrincipal5FichaTecnica();
			this.PageAltaVehiPrincipal51FichaTecnicaSist();
			this.PageAltaVehiPrincipal52TipoVehi (v9);
			PageAltaVehiPrincipal52Marca(v10);
			this.PageAltaVehiPrincipal53Modelo(v11);
			this.PageAltaVehiPrincipal6RendimientoMotor();
			this.PageAltaVehiPrincipal61Horometro(v12);
			this.PageAltaVehiPrincipal7Guardar();			
		}
	 	
	 	
	 	
}	
		