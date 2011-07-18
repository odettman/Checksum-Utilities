package com.racingturtles.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;


/**
 * Creates an md5 hash of the file referenced on the command line
 * @author Oliver Dettman
 *
 */
public class md5 {

	/**
	 * @param args The file for which you want to produce the md5 checksum
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: md5 filename");
			System.exit(1);
		}

		String filename = args[0];
		String output = generateMd5(filename);
		System.out.println("MD5 Hash: " + output);

	}
	
	/**
	 * @param fileName the filename that will be hashed
	 * @return the md5 hash string for the specified file
	 */
	private static String generateMd5(String fileName) {
		FileInputStream subjectFile = null;
		String md5Hash = "Not Calculated";

		try {
			subjectFile = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			md5Hash = DigestUtils.md5Hex(subjectFile);
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			subjectFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return md5Hash;
	}
}
