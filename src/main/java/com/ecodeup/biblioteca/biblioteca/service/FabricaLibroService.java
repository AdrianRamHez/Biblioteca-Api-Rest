package com.ecodeup.biblioteca.biblioteca.service;

import com.ecodeup.biblioteca.biblioteca.dto.LibroDTO;
import com.ecodeup.biblioteca.biblioteca.model.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaLibroService {

    public Libro crearLibro(LibroDTO libroDTO){
        return new Libro(libroDTO);
    }

    public LibroDTO crearLibro(Libro libro){
        return new LibroDTO(libro);
    }

    public List<LibroDTO> crearLibroDTO(List<Libro> libros){
        List<LibroDTO> libroTDOS = new ArrayList<>();
        libros.stream().forEach(
                libro -> {
                    libroTDOS.add(new LibroDTO(libro));
                }
        );
        return libroTDOS;
    }
}
