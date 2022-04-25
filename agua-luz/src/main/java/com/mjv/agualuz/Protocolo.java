package com.mjv.agualuz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Protocolo {
	
	public String gerarProtocolo() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddss");
		return dtf.format(LocalDateTime.now());
	}

}
