package hometask10;

public class MyIteratorMain {
    public static void main(String[] args) {

        MyIterator iter = new MyIterator(5);

        iter.add(0, "1");
        iter.add(1, "2");
        iter.add(2, "3");
        iter.add(3, "4");
        iter.add(4, "5");

        System.out.println(iter.hasNext());
        System.out.println(iter.next());

        System.out.println(iter.hasNext());
        System.out.println(iter.next());

        System.out.println(iter.hasNext());
        System.out.println(iter.next());

        System.out.println(iter.hasNext());
        System.out.println(iter.next());

        System.out.println(iter.hasNext());

        System.out.println("=====================");


        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        iter.remove();
        System.out.println(iter.next());

        System.out.println(iter.hasNext());

        System.out.println("=====================");
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());


    }
}
