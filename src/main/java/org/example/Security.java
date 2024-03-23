package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import static spark.Spark.*;

public class Security {
    public static void main(String[] args) {

        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        staticFiles.location("/public");
        UsersDataBase.Inicializador();

        secure("certificados/ecikeystore.p12", "123456", null, null);
        port(getPort());

        post("/login", (req,res) -> {
            String usuario = req.queryParams("user");
            String password = req.queryParams("password");
            return UsersDataBase.validate(usuario, password);
        });
    }




    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}