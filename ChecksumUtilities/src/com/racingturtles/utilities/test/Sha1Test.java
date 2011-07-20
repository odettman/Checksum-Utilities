package com.racingturtles.utilities.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.racingturtles.utilities.Sha1;

public class Sha1Test {

	@Test
	public void testGenerateMd5() {
		String sha1_testfile = "8835a0e2cc97440e3a366ef0c18e32a844604377";
		assertTrue(Sha1.generateSha1("testfile.txt").equals(sha1_testfile));
		//fail("Not yet implemented");
	}

}
