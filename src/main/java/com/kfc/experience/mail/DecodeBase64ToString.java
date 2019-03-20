package com.kfc.experience.mail;

import javax.xml.bind.DatatypeConverter;

public class DecodeBase64ToString  {
	
	public String decode(String json) {
	/*byte[] bytes = json.getBytes();

    String base64Encoded = DatatypeConverter.printBase64Binary(bytes);*/
    
	byte[] base64Decoded = DatatypeConverter.parseBase64Binary(json);
    System.out.println("Decoded Json:\n");
    System.out.println(new String(base64Decoded));
    
    String decode =  new String(base64Decoded);
    
    return decode ;
}
}
