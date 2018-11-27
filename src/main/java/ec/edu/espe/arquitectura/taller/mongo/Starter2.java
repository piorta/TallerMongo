/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.taller.mongo;

import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.taller.mongo.modelo.Usuario;
import java.util.List;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

public class Starter2 {

    public static void main(String args[]) {
        System.out.println("Hola taller Mongo");
        System.out.println("Conectandose a Mongo");
        Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.modelo");
        Datastore ds = morphia.createDatastore(new MongoClient(), "taller");
        System.out.println("Conexión establecida");

//Consulta
        List<Usuario> users = ds.createQuery(Usuario.class)
                .field("codigo_usuario").equal("saguaman4").asList();
        for (Usuario u : users) {
            System.out.println(u);
        }
        /*for(int i=0;i<users.size();i++)
        {
            System.out.println(users.get(i));
        }*/
    }
}
