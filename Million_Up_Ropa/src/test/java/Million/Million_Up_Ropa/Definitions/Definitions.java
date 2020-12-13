package Million.Million_Up_Ropa.Definitions;

import Million.Million_Up_Ropa.Pasos.Pasos;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Definitions {
	
	
	@Steps
	Pasos Steps;

	@Given("^Abrir navegador en la url$")
	public void abrir_navegador_en_la_url() {
	    Steps.abrir_navegador();
	}


	@When("^Seleccionar Sig in$")
	public void seleccionar_Sig_in() {
		Steps.seleccionar_signin();
	  
	}

	@When("^Ingresar \"([^\"]*)\" correo y seleccionar create$")
	public void ingresar_correo_y_seleccionar_create(String arg1) throws InterruptedException {
	    Steps.ingresar_correo_seleccionar_create(arg1);
	}

	@When("^llenar formulario  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" y seleccionar register$")
	public void llenar_formulario_y_seleccionar_register(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws InterruptedException {
	    Steps.llenar_formulario(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}


	@Then("^Verificar que se ha creado la cuenta$")
	public void verificar_que_se_ha_creado_la_cuenta() {
		Steps.verificar_cuenta();
	}
	
	@When("^Ingresar \"([^\"]*)\" \"([^\"]*)\" y hacer login$")
	public void ingresar_y_hacer_login(String arg1, String arg2) {
	    Steps.ingresar_credenciales_hacer_login(arg1, arg2);
	}


	@Then("^Verificar que se ha echo login$")
	public void verificar_que_se_ha_echo_login() {
	    Steps.verificar_cuenta();
	}
	
	@When("^Realizar la busqueda \"([^\"]*)\" y seleccionar producto$")
	public void realizar_la_busqueda_y_seleccionar_producto(String arg1) {
	    Steps.realizar_busqueda(arg1);
	    Steps.seleccionar_producto(arg1);
	}


	@When("^Agregar al carro y proceder al pado$")
	public void agregar_al_carro_y_proceder_al_pado() {
	    Steps.agregar_carro_proceder_pago();
	}

	@When("^Completar proceso de orden$")
	public void completar_proceso_de_orden() {
	    Steps.completar_proceso_orden();
	}

	@Then("^Validar orden$")
	public void validar_orden() throws InterruptedException {
		Steps.confirmar_orden();
	    
	}
	
	@When("^Seleccionar Contact us$")
	public void seleccionar_Contact_us() {
	    Steps.contact_us();
	}


	@When("^Diligenciar formulario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void diligenciar_formulario(String arg1, String arg2, String arg3) {
	    Steps.diligenciar_formulario_issue(arg1, arg2, arg3);
	}

	@Then("^Verificar que se ha reportado el issue$")
	public void verificar_que_se_ha_reportado_el_issue() {
	    Steps.verificar_reporte_issue();
	}


}
