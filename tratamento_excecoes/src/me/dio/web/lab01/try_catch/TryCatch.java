package me.dio.web.lab01.try_catch;

import java.text.NumberFormat;

public class TryCatch {

	public static void main(String[] args) {
		try {
			Number valor = Double.valueOf("a1.75"); 			//java.lang.NumberFormatException: For input string: "a1.75"
			valor = NumberFormat.getInstance().parse("a1.75"); 	//java.text.ParseException: Unparseable number: "a1.75"
			System.out.println(valor);
		} catch (Exception e) {
			System.err.println("Verifique os números informados, não foi possível atribuir a variável");
		}
	}
}