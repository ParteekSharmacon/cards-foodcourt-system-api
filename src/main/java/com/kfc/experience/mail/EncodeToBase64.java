package com.kfc.experience.mail;

import javax.xml.bind.DatatypeConverter; 
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;


public class EncodeToBase64 /*implements Callable*/ {
	/*public Object onCall(MuleEventContext eventContext) throws Exception {
		
		byte[] messagePayload = eventContext.getMessage().getPayloadAsBytes();
		//byte[] messagePayload = eventContext.getMessage().getPayloadAsBytes();
		String encodedValue = DatatypeConverter.printBase64Binary(messagePayload);
		System.out.println("encodedValue: " + encodedValue);

		return encodedValue;
	}*/
	
	 public String encode(String json) throws NoSuchAlgorithmException , UnsupportedEncodingException  {
     	
	        byte[] bytes = json.getBytes();

	            String base64Encoded = DatatypeConverter.printBase64Binary(bytes);
	            System.out.println("Encoded Json:\n");
	            System.out.println(base64Encoded + "\n");            
	            
	           /* MessageDigest digest = MessageDigest.getInstance("SHA-256");
	    		byte[] hash = digest.digest(json.getBytes(StandardCharsets.UTF_8));
	    		return bytesToHex(hash); // make it printable
	*/    		
	            return base64Encoded;
	          
	        	
	        }
}