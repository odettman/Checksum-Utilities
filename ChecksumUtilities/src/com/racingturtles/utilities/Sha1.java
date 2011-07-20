package com.racingturtles.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;


/**
 * Creates an sha1 hash of the file referenced on the command line
 * @author Oliver Dettman
 *
 */
public class Sha1 {

	/**
	 * @param args The file for which you want to produce the sha1 checksum
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: sha1 filename");
			System.exit(1);
		}

		String filename = args[0];
		String output = generateSha1(filename);
		System.out.println("SHA-1 Hash: " + output);

	}
	
	/**
	 * @param fileName the filename that will be hashed
	 * @return the SHA-1 hash string for the specified file
	 */
	public static String generateSha1(String fileName) {
		FileInputStream subjectFile = null;
		String md5Hash = "Not Calculated";

		try {
			subjectFile = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			md5Hash = DigestUtils.shaHex(subjectFile);
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
