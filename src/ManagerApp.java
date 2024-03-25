public class ManagerApp {
    public static void main(String[] args) {
//        Manager manager = new Manager();
//        manager.name = "Joko";
//        manager.sayHello("Budi");
//
//        VicePresident vp = new VicePresident();
//        vp.name = "Sinta";
//        vp.sayHello("Budi");

        //====================================================

        Manager manager = new Manager("Joko");
        manager.sayHello("Budi");

        VicePresident vp = new VicePresident("Sinta");
        vp.sayHello("Budi");
    }
}
