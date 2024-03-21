package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import static java.lang.Math.sin;
import static spark.Spark.*;

public class Security {
    public static void main(String[] args) {

        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        staticFiles.location("/public");
        secure("certificados/ecikeystore.p12", "123456", null, null);
        port(getPort());
        get("/formulario.html", (req, res) -> args );


        get("sin", (req,res) -> {
            try{
                Double numero = Double.parseDouble(req.queryParams("numero"));
                Double resultado = sin(numero);
                return resultado;
            } catch (NumberFormatException e) {
                return null;
            }
        });
    }




    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}