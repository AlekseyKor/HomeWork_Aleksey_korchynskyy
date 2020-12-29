package hometask10;

import java.util.ArrayList;
import java.util.Collection;

public class NoDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<>();

        obj1.add(1);
        obj1.add(9);
        obj1.add(2);
        obj1.add(5);
        obj1.add(4);
        obj1.add(2);
        obj1.add(9);

        System.out.println(obj1);
        System.out.println(noDuplicates(obj1));
    }

    public static Collection noDuplicates(Collection o){

        ArrayList<Integer> tempFirst = new ArrayList<>(o);
        ArrayList<Integer> tempSecond = new ArrayList<>();

        for (int i = 0; i < tempFirst.size(); i++) {
            if (!tempSecond.contains(tempFirst.get(i))){
                tempSecond.add(tempFirst.get(i));
            }
        }
        return tempSecond;
    }
}
