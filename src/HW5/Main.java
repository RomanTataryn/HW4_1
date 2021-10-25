package HW5;

public class Main {
    public static void main(String[] args) {

        MyList list = new MyList();
        list.add(2);
        list.add(10);
        list.add(11);
        list.add(-3);
        list.add(40);
        System.out.println("My Arraylist  " + list);
        System.out.println("Smallest values in the ArrayList  " + list.smallest());
        System.out.println("Largest values in the ArrayList  " + list.largest());


    }
}
