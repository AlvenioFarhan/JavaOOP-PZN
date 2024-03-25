public class VicePresident extends Manager {

    VicePresident(String name){
        super(name);
    }
    VicePresident(String name, String company){
        super(name,company);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }

}
