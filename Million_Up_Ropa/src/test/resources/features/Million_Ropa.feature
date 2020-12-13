
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Registrarse en la pagina
    Given Abrir navegador en la url
    When Seleccionar Sig in
    When Ingresar <email> correo y seleccionar create
    When llenar formulario  <nombre> <apellido> <email> <pass> <company> <adress1> <adress2> <city> <infoadicional> <hphone> <mphone> <aliasadress> y seleccionar register
    Then Verificar que se ha creado la cuenta

    Examples: 
      | email    					 | nombre   | apellido   | pass       | company          | adress1           | adress2             | city       | infoadicional       | hphone      | mphone      | aliasadress |
      | "@gmail.com" | "nombre" | "apellido" | "1234Abcd" | "Million and Up" | "Calle falsa 123" | "Avenida falsa 123" | "New York" | "Prueba de ingreso" | "123456789" | "987654321" | "Home"      |
      
	@tag2
  Scenario Outline: Hacer login
    Given Abrir navegador en la url
    When Seleccionar Sig in
    When Ingresar <correo> <pass> y hacer login
    Then Verificar que se ha echo login
    
    Examples: 
    |pass      | correo |
    |"1234Abcd"|"correotest@gmail.com"|
    
  @tag3
  Scenario Outline: Realizar una compra
    Given Abrir navegador en la url
    When Seleccionar Sig in
    When Ingresar <correo> <pass> y hacer login
    When Realizar la busqueda <producto> y seleccionar producto
    When Agregar al carro y proceder al pado
    When Completar proceso de orden
    Then Validar orden
    
    Examples: 
    |pass      | correo 							| producto 							 |
    |"1234Abcd"|"correotest@gmail.com"| "Printed Summer Dress" |
    
  @tag4
  Scenario Outline: Reportar Issue
    Given Abrir navegador en la url
    When Seleccionar Contact us
    When Diligenciar formulario <correo> <orden> <mensaje>
    Then Verificar que se ha reportado el issue
    
    Examples: 
    | correo 							 | orden    | mensaje                   |
    |"correotest@gmail.com"| "abc123" | "reporte issue de prueba" |