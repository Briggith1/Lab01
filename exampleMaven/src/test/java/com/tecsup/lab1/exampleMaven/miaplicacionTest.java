package com.tecsup.lab1.exampleMaven;

import org.junit.Assert;

import org.junit.Test;

public class miaplicacionTest {
	@Test
	public void testApp() {
		miaplicacion appObject = new miaplicacion();
		Assert.assertEquals(appObject.reverseString("Hola!"), "!aloH");
	}

}
