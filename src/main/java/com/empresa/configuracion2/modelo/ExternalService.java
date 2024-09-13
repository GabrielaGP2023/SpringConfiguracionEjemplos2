package com.empresa.configuracion2.modelo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {
    @PostConstruct
    public void initialize(){
        System.out.println( "Conexión a servicio externo establecida");
    }
    @PreDestroy
    public void shutdown(){
        System.out.println("Conexión a servicio externo cerrada");
    }
}
