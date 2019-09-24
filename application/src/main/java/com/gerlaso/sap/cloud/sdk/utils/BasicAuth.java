package com.gerlaso.sap.cloud.sdk.utils;

import java.util.Base64;

public class BasicAuth {

	public static String encode( String user, String password ) {
		
		String text = user+":"+password;
		
		String encoded = new String(Base64.getEncoder().encode(text.getBytes()));
		
		return "Basic "+encoded;
	}
}
