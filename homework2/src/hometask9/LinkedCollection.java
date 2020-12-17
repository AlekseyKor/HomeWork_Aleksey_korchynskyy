package hometask9;


import java.util.Collection;

public class LinkedCollection<L> implements CustomCollection<L>{

    public LinkedCollection(){
        this.first = new Node<L>(null, (L) first, first);
        this.last = first;
    }

    private int size = 0;

    transient Node<L> first;
    transient Node<L> last;



    @Override
    public boolean add(String str) {
        final Node<L> l = last;
        final Node<L> newNode = new Node<L>(l, (L)str, null);
        last = newNode;
        if (l == null){
            first = newNode;
        }else{
            l.next = newNode;
        }
        size++;

        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            add(strArr[i]);
        }
        return true;
    }

    @Override
    public boolean addAll(LinkedCollection<L> strColl) {
        for (int i = 0; i < strColl.size; i++) {
            add(strColl.get(i));
        }
        return true;
    }

    @Override
    public boolean delete(int index) {

        if (index >= size) return false;
        Node<L> current = first;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }

        return deleteNode(current);
    }

    @Override
    public boolean delete(String str) {
        Node<L> current = first.next;
        for (int i = 0; i < size; i++) {
            if (current.item == str){
                return deleteNode(current);
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String get(int index) {
        Node<L> getItem = first.next;
        if (index <= size && index >= 0){

            for (int i = 0; i < index; i++) {
                getItem = getItem.next;
            }
            return (String) getItem.item;

        }else return "You are trying to get the wrong index!";

    }

    @Override
    public boolean contains(String str) {

        Node<L> current = first.next;

        for (int i = 0; i < size; i++) {
            if (current.item == str) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean clear() {

        for (Node<L> x = first; x != null;) {
            Node<L> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;

        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return true;
    }

    @Override
    public boolean compare(LinkedCollection<L> coll) {

        if (size != coll.size()) {
            return false;
        }
        if (this == coll) {
            return true;
        }
        LinkedCollection<?> that = (LinkedCollection<?>) coll;
        for (int i = 0; i < size; i++) {
            if (!this.get(i).equals(that.get(i))) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String res = "[";
        Node current = first.next;
        for (int i = 0; i < size(); i++) {
            if (i < size() - 1) {
                res += current.item + ", ";
            } else res += current.item;
            current = current.next;
        }
        res += "]";
        return res;
    }

    private boolean deleteNode(Node<L> node){
        if (node.next == first) last = node.prev;
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = null;
        node.prev = null;
        size--;
        return true;
    }
}
