package com.ecodeup.biblioteca.biblioteca.dto;

import com.ecodeup.biblioteca.biblioteca.model.Autor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class AutorDTO {
    private Integer id;
    private String nombres;
    private String apellidos;
    private String telefonos;
    private List<LibroDTO> librosDTO;

    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nombres = autor.getNombres();
        this.apellidos = autor.getApellidos();
        this.telefonos = autor.getTelefonos();

        this.librosDTO = new ArrayList<>();
        autor.getLibros().forEach(
                libro -> librosDTO.add(new LibroDTO(libro))
        );
    }
}
