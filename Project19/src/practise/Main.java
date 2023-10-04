package practise;

public class Main {
    public static void main(String[] args) {
        String hello = "hello!";
        String engHello = "hello!";
        String engHello2 = new String("hello!");
        System.out.println(hello.equals(engHello));
        System.out.println(hello.equals(engHello2));
        System.out.println(hello == engHello2);
        System.out.println(hello == engHello);
        System.out.println(hello.substring(1, 5));
        String input = "Value, another value, another another value, ...";
        String[] array = input.split(", ");
        System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int a = 10;
        String strA = String.valueOf(a);
        System.out.println(strA + 1);
        int aBack = Integer.parseInt(strA);
        System.out.println(aBack + 1);
        boolean res = Character.isDigit('0');
        System.out.println(res);
//        Integer b = new Integer(null);
//        b.intValue();
    }
}
