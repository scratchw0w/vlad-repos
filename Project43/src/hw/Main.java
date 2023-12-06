package hw;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //hw.Task 1
//        String zeroDefaultValue = returnValue("").orElse("Nothing");
//        Object zeroDefaultValue = Optional.ofNullable(null).orElse("Nothing");
//        System.out.println(zeroDefaultValue);

        //hw.Task 2
//        String value = null;
//        getValue(Optional.ofNullable(value));
        //hw.Task 3
//        Bank bank = new Bank();
//        Account account1 = new Account(1234, "account 1");
//        Account account2 = new Account(2000, "account 2");
//        Account account3 = new Account(15000, "account 3");
//        bank.addAccount(account1);
//        bank.addAccount(account2);
//        bank.addAccount(account3);
//
//        bank.showInfo();
//        System.out.println("-------------------");
//        bank.transferMoney(account1, account2, 12);
//        bank.showInfo();
        //hw.Task 4
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task("Do programming", "High");
        Task task2 = new Task("Do english", "High");
        Task task3 = new Task("Study django", "Medium");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        taskManager.showInfo();
        taskManager.setTaskAsCompleted(task1);
        taskManager.showInfo();
        taskManager.setAllTasksAsCompleted();
        taskManager.showInfo();


        Week weekday = Week.SUNDAY;
        switch (weekday){
            case FRIDAY -> System.out.println("friday");
        }
    }

    private static void getValue(Optional<String> optional) {
        if (optional.isEmpty()) {
            System.err.println("Does not contain value");
        } else {
            System.err.println("Contains value");
        }
    }

//    private static Optional<String> returnValue(String value){
//        if (value.equals("") || value.equals(" ") || value.equals("0")) {
//            return Optional.empty();
//        } else {
//            return Optional.of("Contains value");
//        }
//    }
}
