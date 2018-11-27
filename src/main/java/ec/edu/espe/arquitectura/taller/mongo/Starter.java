/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.taller.mongo;

import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.taller.mongo.modelo.Telefono;
import ec.edu.espe.arquitectura.taller.mongo.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;


public class Starter {
    public static void main(String args[])
    {
        System.out.println("Hola taller Mongo");
        System.out.println("Conectandose a Mongo");
        Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.modelo");
        Datastore ds = morphia.createDatastore(new MongoClient(), "taller");
        ds.ensureIndexes();
        System.out.println("Conexión establecida");
        /*
        Usuario usuario = new Usuario();
        usuario.setCodigo_usuario("saguaman3");
        usuario.setClave("1234");
        usuario.setIntentosFallidos(0);
        usuario.setFechaNacimiento(new Date());
        ds.save(usuario);*/
        System.out.println("Usuario Creado");
        
        List<Telefono> telefonos = new ArrayList<Telefono>();
        Telefono t1= new Telefono();
        t1.setTipo("casa");
        t1.setTelefono("2484020");
        
        Telefono t2= new Telefono();
        t2.setTipo("trabajo");
        t2.setTelefono("2366135");
        
        Telefono t3= new Telefono();
        t3.setTipo("movil");
        t3.setTelefono("0978639798");
        
        telefonos.add(t1);
        telefonos.add(t2);
        telefonos.add(t3);
        
        Usuario usuario2 = new Usuario();
        usuario2.setCodigo_usuario("saguaman4");
        usuario2.setClave("1234");
        usuario2.setIntentosFallidos(0);
        usuario2.setFechaNacimiento(new Date());
        usuario2.setTelefonos(telefonos);
        ds.save(usuario2);
        System.out.println("Usuario Creado");
        
    }
}
