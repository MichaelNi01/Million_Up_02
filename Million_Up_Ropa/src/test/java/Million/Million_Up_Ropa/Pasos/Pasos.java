package Million.Million_Up_Ropa.Pasos;

import Million.Million_Up_Ropa.Pageobject.Pageobject;

public class Pasos {
Pageobject Pageo;
	
	public void abrir_navegador () {
		Pageo.open();
	}
	
	public void seleccionar_signin () {
		Pageo.seleccionar_signin();
	}
	
	public void ingresar_correo_seleccionar_create (String arg1) throws InterruptedException {
		Pageo.ingresar_correo(arg1);
	}
	
	public void llenar_formulario (String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws InterruptedException {
		Pageo.llenar_formulario(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}
	
	public void verificar_cuenta () {
		Pageo.verificar_cuenta();
	}
	
	public void ingresar_credenciales_hacer_login (String arg1, String arg2) {
		Pageo.ingresar_credenciales_hacer_login(arg1, arg2);
	}
	
	public void realizar_busqueda (String arg1) {
		Pageo.realizar_busqueda(arg1);
	}
	
	public void seleccionar_producto (String arg1) {
		Pageo.seleccionar_producto(arg1);
	}
	
	public void agregar_carro_proceder_pago () {
		Pageo.agregar_carro_proceder_pago();
	}
	
	public void completar_proceso_orden () {
		Pageo.pestaña_summary();
		Pageo.pestaña_address();
		Pageo.pestaña_shipping();
		Pageo.pestaña_payment();
	}
	
	public void confirmar_orden () throws InterruptedException {
		Pageo.orden_confirmada();
	}
	
	public void contact_us () {
		Pageo.contact_us();
	}
	
	public void diligenciar_formulario_issue (String arg1, String arg2, String arg3) {
		Pageo.diligenciar_formulario_contact_us(arg1, arg2, arg3);
	}
	
	public void verificar_reporte_issue () {
		Pageo.verificar_reporte_issue();
	}


}
