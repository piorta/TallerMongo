/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.taller.mongo.modelo;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;


@Embedded
public class Telefono {
    @Property("tipo")
    private String tipo;
    @Property("telefono")
    private String telefono;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Telefono{" + "tipo=" + tipo + ", telefono=" + telefono + '}';
    }
    
    
}
