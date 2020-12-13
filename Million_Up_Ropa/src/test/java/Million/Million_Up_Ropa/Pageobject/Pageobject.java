package Million.Million_Up_Ropa.Pageobject;

import static org.junit.Assert.assertTrue;

import org.jruby.ext.ffi.StructByValue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Million.Million_Up_Ropa.Utilidades.Utilidad;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://automationpractice.com/index.php")

public class Pageobject extends PageObject {
	
	Utilidad Util;

	String Sign_in = "//a[contains(text(),'Sign in')]";
	String Email_create = "//input[@id='email_create']";
	String Masculino = "//input[@id='id_gender1']";
	String Nombre = "//input[@id='customer_firstname']";
	String Apellido = "//input[@id='customer_lastname']";
	String Email = "//input[@id='email']";
	String Password = "//input[@id='passwd']";
	String Dia = "//select[@id='days']";
	String Mes = "//select[@id='months']";
	String Año = "//select[@id='years']";
	String Noticias = "//input[@id='newsletter']";
	String Ofertas = "//input[@id='optin']";
	String Compañia = "//input[@id='company']";
	String Direccion1 = "//input[@id='address1']";
	String Direccion2 = "//input[@id='address2']";
	String Ciudad = "//input[@id='city']";
	String Estado = "//select[@id='id_state']";
	String Postal = "//input[@id='postcode']";
	String Pais = "//select[@id='id_country']";
	String Informacion = "//textarea[@id='other']";
	String Hphone = "//input[@id='phone']";
	String Mphone = "//input[@id='phone_mobile']";
	String Alias = "//input[@id='alias']";
	String Register = "//button[@id='submitAccount']";
	String Cuenta = "//h1[contains(text(),'My account')]";
	String Login = "//button[@id='SubmitLogin']";
	String Buscar = "//input[@id='search_query_top']";
	String Carro = "//span[contains(text(),'Add to cart')]";
	String Procede_pago_titulo = "Proceed to checkout";
	String Politicas_compra = "//input[@id='cgv']";
	String Pago_tarjeta_titulo = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]";
	String Procede_pago_name = "processAddress";
	String Procede_pago_name_shipping = "processCarrier";
	String Confirmar_orden = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]";
	String Orden_confirmada = "//strong[contains(text(),'Your order on My Store is complete.')]";
	String correo = "prueba";
	String contacto_ltxt = "Contact us";
	String id_contac = "//select[@id='id_contact']"; //valor 2
	String id_order = "//input[@id='id_order']";
	String id_message = "//textarea[@id='message']";
	String Submit_issue = "//button[@id='submitMessage']";
	String Succesfuly_issue = "//p[contains(text(),'Your message has been successfully sent to our tea')]";
	
	
	
	public void seleccionar_signin ( ) {
		find(By.xpath(Sign_in)).click();
	}
	
	public void ingresar_correo (String arg1) throws InterruptedException {
		correo = correo + Util.correo_aleatorio()+ arg1;
		System.out.println(correo);
		find(By.xpath(Email_create)).sendKeys(correo);
		find(By.xpath(Email_create)).submit();
		Thread.sleep(1000);
	}
	
	public void llenar_formulario (String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws InterruptedException {
		find(By.xpath(Nombre)).sendKeys(arg1);
		find(By.xpath(Apellido)).sendKeys(arg2);
		find(By.xpath(Email)).clear();
		find(By.xpath(Email)).sendKeys(correo);
		find(By.xpath(Password)).sendKeys(arg4);
		find(By.xpath(Dia)).selectByValue("10");
		find(By.xpath(Mes)).selectByValue("10");
		find(By.xpath(Año)).selectByValue("1993");
		find(By.xpath(Noticias)).click();
		find(By.xpath(Ofertas)).click();
		find(By.xpath(Compañia)).sendKeys(arg5);
		find(By.xpath(Direccion1)).sendKeys(arg6);
		find(By.xpath(Direccion2)).sendKeys(arg7);
		find(By.xpath(Ciudad)).sendKeys(arg8);
		find(By.xpath(Estado)).selectByValue("2");
		find(By.xpath(Postal)).sendKeys("12345");
		find(By.xpath(Pais)).selectByValue("21");
		find(By.xpath(Informacion)).sendKeys(arg9);
		find(By.xpath(Hphone)).sendKeys(arg10);
		find(By.xpath(Mphone)).sendKeys(arg11);
		find(By.xpath(Alias)).clear();
		find(By.xpath(Alias)).sendKeys(arg12);
		find(By.xpath(Alias)).sendKeys(arg12);
		find(By.xpath(Register)).click();
		
	}
	
	public void verificar_cuenta () {
		boolean Acount = find(By.xpath(Cuenta)).isVisible();
		assertTrue(Acount);;
	}
	
	public void ingresar_credenciales_hacer_login (String arg1, String arg2) {
		find(By.xpath(Email)).sendKeys(arg1);
		find(By.xpath(Password)).sendKeys(arg2);
		find(By.xpath(Login)).click();
	}
	
	public void realizar_busqueda (String arg1) {
		find(By.xpath(Buscar)).sendKeys(arg1);
		find(By.xpath(Buscar)).submit();
		
	}
	
	public void seleccionar_producto (String arg1) {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();

		while (find(By.linkText(arg1)).isVisible()==false) {
			js.executeScript("window.scrollBy(0,350)", "");
		}
		find(By.linkText(arg1)).click();
		
	}
	
	public void agregar_carro_proceder_pago () {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		while (find(By.xpath(Carro)).isVisible()==false) {
			js.executeScript("window.scrollBy(0,350)", "");
		}
		find(By.xpath(Carro)).click();
		find(By.linkText(Procede_pago_titulo)).click();
	}
	
	public void pestaña_summary () {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	
			while (find(By.linkText(Procede_pago_titulo)).isVisible()==false) {
				js.executeScript("window.scrollBy(0,350)", "");
			}
			find(By.linkText(Procede_pago_titulo)).click();
			
	}
	
	public void pestaña_address () {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		while (find(By.name(Procede_pago_name)).isVisible()==false) {
			js.executeScript("window.scrollBy(0,350)", "");
		}
		find(By.name(Procede_pago_name)).click();
		
	}
	
	public void pestaña_shipping () {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		find(By.xpath(Politicas_compra)).click();
		js.executeScript("window.scrollBy(0,350)", "");
		find(By.name(Procede_pago_name_shipping)).click();

	}
	
	public void pestaña_payment () {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
		
		while (find(By.xpath(Pago_tarjeta_titulo)).isVisible()==false) {
			js.executeScript("window.scrollBy(0,350)", "");
		}
		find(By.xpath(Pago_tarjeta_titulo)).click();
		
		while (find(By.xpath(Confirmar_orden)).isVisible()==false) {
			js.executeScript("window.scrollBy(0,350)", "");
		}
		find(By.xpath(Confirmar_orden)).click();
	}
	
	public void orden_confirmada () throws InterruptedException {
		
		boolean Orden = find(By.xpath(Orden_confirmada)).isVisible();
		assertTrue(Orden);
	}
	
	public void contact_us () {
		find(By.linkText(contacto_ltxt)).click();
		
	}
	
	public void diligenciar_formulario_contact_us (String arg1, String arg2, String arg3) {
		find(By.xpath(id_contac)).selectByValue("2");
		find(By.xpath(Email)).sendKeys(arg1);
		find(By.xpath(id_order)).sendKeys(arg2);
		find(By.xpath(id_message)).sendKeys(arg3);
		find(By.xpath(Submit_issue)).click();
		
	}
	
	public void verificar_reporte_issue ( ) {
		
		boolean Issue = find(By.xpath(Succesfuly_issue)).isVisible();
		assertTrue(Issue);
		
	}
}
