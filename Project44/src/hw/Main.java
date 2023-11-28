package hw;

public class Main {
    public static void main(String[] args) {
//        //Task 1
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
//
//        university.showAllStudents();
//        System.out.println();
//        university.sortByAverageMark();
//        System.out.println();
//        university.sortByAge();
        //Task 2
        Product laptop = new Product("Acer", 1254673, 1, 25000);
        Product iphone = new Product("15 pro", 78520, 2, 7500);
        Product motherboard = new Product("ATX", 1125468, 3, 1200);
        Product cpu = new Product("Intel", 7841256, 4, 1500);
        Inventory inventory = new Inventory();
        Store store = new Store();

        laptop.showInfo();
        iphone.showInfo();
        motherboard.showInfo();
        cpu.showInfo();
        System.out.println();

        inventory.addProductToInventory(laptop);
        inventory.addProductToInventory(cpu);
        inventory.showAllInventory();
        System.out.println();
        inventory.sortByPrice();
        System.out.println();
        laptop.isSold();
        inventory.showSoldGoods();
    }
}
