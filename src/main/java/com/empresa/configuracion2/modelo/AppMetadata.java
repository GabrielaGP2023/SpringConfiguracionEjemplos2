package com.empresa.configuracion2.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class AppMetadata {
    @Value("${app.author:Autor desconocido}")
    private String autor;
    @Value("${app.year:Año desconocido}")
    private String year;
}
