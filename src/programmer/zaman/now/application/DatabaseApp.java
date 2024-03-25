package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {

        connectDatabase(null, "alvenio");
        System.out.println("Sukses Login");

    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect ke Database");
        }
    }
}
