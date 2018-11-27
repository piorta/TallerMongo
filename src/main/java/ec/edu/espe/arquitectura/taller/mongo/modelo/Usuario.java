/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.taller.mongo.modelo;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

@Entity(noClassnameStored = true, value = "usuario")

public class Usuario {

    @Id
    private ObjectId id;

    @Property("codigo_usuario")
    @Indexed(options = @IndexOptions(name = "idxCodUser", unique = true))
    private String codigo_usuario;

    @Property("clave")
    private String clave;

    @Property("intentosFallidos")
    private Integer intentosFallidos;

    @Property("fechaNacimiento")
    private Date fechaNacimiento;

    @Embedded("telefonos")
    private List<Telefono> telefonos;

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(String codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(Integer intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.codigo_usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.codigo_usuario, other.codigo_usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", codigo_usuario=" + codigo_usuario + ", clave=" + clave + ", intentosFallidos=" + intentosFallidos + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
