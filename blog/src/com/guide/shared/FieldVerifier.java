package com.guide.shared;

public class FieldVerifier {
	public static boolean isValidPassword(String pwd) {
		return pwd.length() >= 6 && pwd.length() <= 10;
	}
}
