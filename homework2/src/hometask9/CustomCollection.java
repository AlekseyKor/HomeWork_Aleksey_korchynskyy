package hometask9;

import java.util.Collection;

public interface CustomCollection<L>{

    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(LinkedCollection<L> strColl);

    boolean delete (int index);

    boolean delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compare(LinkedCollection<L> coll);

}
