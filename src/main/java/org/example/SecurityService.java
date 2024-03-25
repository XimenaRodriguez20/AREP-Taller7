package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import static spark.Spark.*;

public class SecurityService {
    public static void main(String[] args) {

        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        staticFiles.location("/public");
        UsersDataBase.Inicializador();

        secure("certificados/ecikeystore.p12", "123456", null, null);
        port(getPort());

        post("/login", (req,res) -> {
            String usuario = req.queryParams("user");
            String password = req.queryParams("password");
            System.out.println("usuario: " + usuario + ", " +password);

            Boolean validacion = UsersDataBase.validate(usuario, password);
            System.out.println("boolean" + validacion);
            return  (validacion) ? SecurityURLReader.conexionSegura("https://localhost:4000/frutas.html"):"Datos incorrectos";
        });


    }


    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}