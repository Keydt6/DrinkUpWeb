/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.List;
import java.util.ArrayList;

public class Datos {

    private static final List datosArt = new ArrayList();
    

    public Datos() {
        cargarArt();
    }

    public void cargarArt() {
        Marca mar = new Marca();
        mar.setId_mar("00001");
        mar.setNombre("Casique");
        mar.setDescrip("Ron de Venezuela");
        mar.setEstatus(true);

        Categoria cat = new Categoria();
        cat.setId_cat(1);
        cat.setTipo_cat(2);
        cat.setDescrip("articulos que son ron");
        cat.setNombre("Ron");
        cat.setEstatus(true);

        Articulo art = new Articulo();
        art.setId_art("0001");
        art.setDescrip("Ron Añejo");
        art.setNombre("Casique");
        art.setPrecio(3500000);
        art.setStock(23);
        art.setEstatus(true);
        art.setTamanno(1);
        art.setCategoria(cat);
        art.setMarca(mar);
        datosArt.add(art);

        art = new Articulo();
        art.setId_art("0002");
        art.setDescrip("whisky");
        art.setNombre("La Roca");
        art.setPrecio(4500000);
        art.setStock(15);
        art.setEstatus(true);
        art.setTamanno(1);
        art.setCategoria(cat);
        art.setMarca(mar);
        datosArt.add(art);

        art = new Articulo();
        art.setId_art("0003");
        art.setDescrip("Sandria Caroreña");
        art.setNombre("La Caroreña");
        art.setPrecio(1000000);
        art.setStock(31);
        art.setEstatus(true);
        art.setTamanno(2);
        art.setCategoria(cat);
        art.setMarca(mar);
        datosArt.add(art);

        art = new Articulo();
        art.setId_art("0004");
        art.setDescrip("Licor de Ron");
        art.setNombre("Canciller");
        art.setPrecio(3100000);
        art.setStock(27);
        art.setEstatus(true);
        art.setTamanno(2);
        art.setCategoria(cat);
        art.setMarca(mar);
        datosArt.add(art);

        art = new Articulo();
        art.setId_art("0005");
        art.setDescrip("Ron Añejo");
        art.setNombre("Cinco Estrellas");
        art.setPrecio(3000000);
        art.setStock(20);
        art.setEstatus(true);
        art.setTamanno(1);
        art.setCategoria(cat);
        art.setMarca(mar);
        datosArt.add(art);
    }

    public List getDatosArt(){
        cargarArt();
        return datosArt;
    }
}
