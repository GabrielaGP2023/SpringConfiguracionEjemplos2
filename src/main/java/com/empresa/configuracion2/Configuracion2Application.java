package com.empresa.configuracion2;

import com.empresa.configuracion2.modelo.AppMetadata;
import com.empresa.configuracion2.modelo.ExternalService;
import com.fuera1.modelo.ServicioSMS;
import com.fuera2.modelo.ServicioPOP3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages ={"com.fuera1.modelo",  "com.fuera2.modelo", "com.empresa.configuracion2.modelo"})
public class Configuracion2Application implements CommandLineRunner {
	@Autowired
	private ServicioSMS servicioSMS;
	@Autowired
	private ServicioPOP3 servicioPOP3;
	@Autowired
	private AppMetadata appMetadata;
//	@Autowired
//	private ExternalService externalService;

	public static void main(String[] args) {
		SpringApplication.run(Configuracion2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(appMetadata.getAutor());
		System.out.println(appMetadata.getYear());
	}
}
