public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alvenio","Semarang");
//        person1.name = "Alvenio";
//        person1.address = "Semarang";
        //Yang sudah di final variable tidak bisa di ubah" data fieldnya
//        person1.country = "Indonesia";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("Sinta");

        person2.sayHello("Budi");

        Person person3;
        person3 = new Person();
        person3.name = "Joko";

        //Apabila belum di declare untuk field nama, makan akan keluar null ketika di print
//        person3.name="Susanti"; // Maka harus di declarasikan dahulu
        person3.sayHello("Budi");

//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
    }
}