package hometask8;


public interface InterfaceCollection<S> {

    boolean add(S o);

    boolean add(int index, S o);

    boolean delete(S o);

    boolean delete(int index);

    Object get(int index);

    boolean contain(S o);

    boolean equals(Collection8 o);

    boolean clear();

    int size();

    void resize( int newLength);
}
