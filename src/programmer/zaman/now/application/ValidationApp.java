package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException exception){
            System.out.println("Data Tidak Valid: " + exception.getMessage());
        } catch (NullPointerException exception){
            System.out.println("Data Tidak Valid: " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }


        LoginRequest loginRequest2 = new LoginRequest(null,null);

        ValidationUtil.validateRuntime(loginRequest2);

    }
}
