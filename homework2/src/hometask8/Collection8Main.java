package hometask8;

public class Collection8Main {
    public static void main(String[] args) {

        Collection8<String> coll = new Collection8<>();

        Collection8<String> coll1 = new Collection8<>();

        // 1 коллекция
        coll.add("1");
        coll.add("2");
        coll.add("3");
        coll.add("4");
        coll.add("5");

        // 2 коллекция
        coll1.add("hey");
        coll1.add("1");
        coll1.add("2");
        coll1.add("7");
        coll1.add("4");
        coll1.add("5");

        coll.add(3,"7");
        coll.add(0, "hey");

        coll.delete("3");

        //coll.clear();

        for (int i = 0; i < coll.size(); i++) {
            System.out.println("[" + i + "] : " + coll.get(i));
        }

        System.out.println("--------------------------------");

        for (int i = 0; i < coll1.size(); i++) {
            System.out.println("[" + i + "] : " + coll1.get(i));
        }

        System.out.println("--------------------------------");
        System.out.println("Equals : " + coll.equals(coll1));

        //System.out.println(coll.contain("12"));
        //System.out.println(coll.get(5));
    }
}
