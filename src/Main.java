import util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(50));

        ArrayList.ListIterator it = numbers.listIterator();
        while (it.hasNext()) {
            int value = (int) it.next();
            System.out.println("value = " + value);
        }
    }


}
