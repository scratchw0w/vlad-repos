package hw;

import hw.shop.Inventory;
import hw.shop.Product;
import hw.shop.Store;

public class Main {
    public static void main(String[] args) {
        //Task 1
//        Student student1 = new Student("Frank", 18, 3);
//        Student student2 = new Student("Anna", 19, 4);
//        Student student3 = new Student("Kate", 20, 2);
//        Student student4 = new Student("Linda", 17, 5);
//
//        University university = new University();
//
//        university.addStudent(student1);
//        university.addStudent(student2);
//        university.addStudent(student3);
//        university.addStudent(student4);
//
//        university.showAllStudents();
//        System.out.println();
//        university.showByAverageMark(3);
//        System.out.println();
//        university.showByAge(18);
//
        //Task 2
        Product laptop = new Product("Acer", 1254673, 25000);
        Product iphone = new Product("15 pro", 78520, 7500);
        Product motherboard = new Product("ATX", 1125468, 1200);
        Product cpu = new Product("Intel", 7841256, 1500);

        Inventory inventory = new Inventory();
        inventory.addProduct(laptop, 2);
        inventory.addProduct(iphone, 1);
        inventory.addProduct(motherboard, 4);
        inventory.addProduct(cpu, 1);

        System.out.println(inventory);

        Store store = new Store(inventory);
        System.out.println(store.checkAvailability(laptop) ? "is present" : "is not present");
        store.buyProduct(laptop);
        store.buyProduct(iphone);

        System.out.println(inventory);

        store.buyProduct(iphone);
        store.buyProduct(laptop);
        store.buyProduct(cpu);
        store.buyProduct(motherboard);

        System.out.println(inventory);

        store.buyProduct(iphone);
        store.buyProduct(laptop);
        store.buyProduct(cpu);
        store.buyProduct(motherboard);

        System.out.println(inventory);
    }
}
