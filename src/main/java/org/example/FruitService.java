package org.example;

import static spark.Spark.*;
import static spark.Spark.post;

public class FruitService {
    public static void main(String[] args) {

        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        staticFiles.location("/public");
        FruitsDataBase.Inicializador();

        secure("certificados/ecikeystore.p12", "123456", null, null);
        port(getPort());


        get("/fruits", (req,res) -> {
            res.type("application/json");
            return FruitsDataBase.getFrutasJSON();
        });




    }




    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
