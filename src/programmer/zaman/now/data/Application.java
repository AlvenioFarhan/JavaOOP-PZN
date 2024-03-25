package programmer.zaman.now.data;

public class Application {

    public static final Integer processors;

    static {
        System.out.println("Mengakses class Application");
        processors = Runtime.getRuntime().availableProcessors();
    }
}
