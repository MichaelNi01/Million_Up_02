package Million.Million_Up_Ropa.Utilidades;

import java.util.Random;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class Utilidad extends PageObject {

	public String correo_aleatorio () {
		char [] chars = "12345".toCharArray();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < chars.length; i++) {
			buffer.append(chars[random.nextInt(chars.length)]);
		}
		System.out.println(buffer.toString());
		return buffer.toString();
	}
}
