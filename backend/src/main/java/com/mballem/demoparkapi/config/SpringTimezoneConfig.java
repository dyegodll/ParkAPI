package com.mballem.demoparkapi.config;

import java.util.TimeZone;

import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

//classe para configuração do TimeZone do país para data e hora correspondente

@Configuration
public class SpringTimezoneConfig {

	@PostConstruct //define a execução do método após a inicialização dos construtores do Spring
	public void timezoneConfig() {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo")); //String-ID TimeZone do Brasil
	}
	
}
