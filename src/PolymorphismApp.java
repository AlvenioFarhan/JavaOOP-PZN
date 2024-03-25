public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Alvenio");
        employee.sayHello("Budi");

        employee = new Manager("Alvenio");
        employee.sayHello("Budi");

        employee = new VicePresident("Alvenio");
        employee.sayHello("Budi");

        sayHello(new Employee("Joko"));
        sayHello(new Manager("Alvenio"));
        sayHello(new VicePresident("Budi"));

    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
