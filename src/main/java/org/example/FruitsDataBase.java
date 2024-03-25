package org.example;

import java.util.ArrayList;

public class FruitsDataBase {

    public static ArrayList<String> frutas = new ArrayList<>();

    public static void Inicializador(){
        frutas.add("lulo");
        frutas.add("maracuya");
        frutas.add("fresa");
        frutas.add("frambuesa");
        frutas.add("ciruela");

    }

    public static ArrayList<String> getFrutas(){
        return frutas;
    }

    public static String getFrutasJSON(){
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < frutas.size(); ++i) {
            json.append("\"").append(frutas.get(i));
            if (i!=frutas.size()-1) {
                json.append( "\", ");
            } else {
                json.append("\"]");
            }
        }
        return json.toString();
    }

}
