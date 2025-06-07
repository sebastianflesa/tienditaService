package com.tiendita.tienditaservice.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductoDTO {
    private Long id;
    private String nombre;
    private Integer valor;

}
