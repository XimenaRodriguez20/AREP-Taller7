package org.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class UsersDataBase {

    public static final HashMap<String, String> users = new HashMap<>();

    public static void Inicializador(){
        users.put("user1", hashPassword("password1"));
        users.put("user2", hashPassword("password2"));
    }

    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static Boolean validate(String usuario, String contrasena){
        System.out.println(users.get(usuario));
        System.out.println(hashPassword(contrasena));
        if (users.containsKey(usuario)) {
            if (users.get(usuario).equals(hashPassword(contrasena))) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }
}
