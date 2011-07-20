package com.racingturtles.utilities.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.racingturtles.utilities.Md5;

public class Md5Test {

	@Test
	public void testGenerateMd5() {
		String md5_testfile = "fc608d066a5313245209e34d9d25068d";
		assertTrue(Md5.generateMd5("testfile.txt").equals(md5_testfile));
		//fail("Not yet implemented");
	}

}
