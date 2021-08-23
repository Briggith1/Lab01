package com.tecsup.lab1.exampleMaven;

public class miaplicacion {
	public static void main(String[]args) {
		//TODO auto-generated method stub
		final String str ="Hola!";
		
		miaplicacion appObject = new
miaplicacion();
		System.out.println("La cadena invertida de \"" + str + "\" es \""+ appObject.reverseString(str) + "\"");
	}
	
	public String reverseString(String src) {
		return new StringBuilder(src).reverse().toString();
	}
	
}
