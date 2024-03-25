package programmer.zaman.now.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {

        //MANUAL CLOSE RESOURCE
//        BufferedReader reader = null;
//
//        try {
//            reader = new BufferedReader(
//                    new FileReader("AnimalApp.java")
//            );
//
//            while (true) {
//                String line = reader.readLine();
//                if (line == null) {
//                    break;
//                }
//                System.out.println(line);
//            }
//
//        } catch (Throwable throwable) {
//            System.out.println("Error membaca file " + throwable.getMessage());
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                    System.out.println("Sukses menutup Aplikasi");
//                } catch (IOException exception) {
//                    System.out.println("Error menutup resource " + exception.getMessage());
//                }
//            }
//        }

        //================================================

        //TRY WITH RESOURCE
        try (BufferedReader reader = new BufferedReader(new FileReader("AnimalApp.java"))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        }
    }
}
