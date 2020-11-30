package hometask7;

public class CollectionMain {
    public static void main(String[] args) {

        Collection<String> array = new Collection<>();

        array.add("Something");
        array.add("123");
        array.add("Hello!");
        array.add("I'm John.");
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");
        array.add("6");
        array.add("7");
        array.add("8");
        array.add("9");

        array.delete(4);
        array.delete(9);

        for (int i = 0; i < array.size(); i++) {
            System.out.println("[" + i + "] : " + array.get(i));
        }

    }
}
