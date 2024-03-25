class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person() {
        this(null);
    }

    Person(String name) {
//        name = paramName;
        //memanggil constructor yang lain
        this(name, null);
    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", " + "My Name Is " + this.name);
    }
}
