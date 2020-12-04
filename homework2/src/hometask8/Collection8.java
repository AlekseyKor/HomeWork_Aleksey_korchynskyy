package hometask8;

import java.util.Arrays;

public class Collection8<S> implements InterfaceCollection<S> {

    private final int DEFAULT_SIZE = 10;
    private final int CUT_RATE = 2;

    private Object[] array = new Object[DEFAULT_SIZE];

    private int pointer = 0;




    @Override
    public boolean add(S o) {
        if (pointer == array.length-1){
            resize((array.length*3) / 2 + 1);
        }
        array[pointer++] = o;
        return true;
    }

    @Override
    public boolean add(int index, S o) {

        if (pointer == array.length-1){
            resize((array.length*3) / 2 + 1);
        }
        final int s = size();
        System.arraycopy(array, index, array, index + 1, s - index);
        array[index] = o;
        pointer++;

        return true;
    }

    @Override
    public boolean delete(S o) {

        for (int i = 0; i < pointer; i++) {
            if (array[i] == o){
                delete(i);
            }
        }

        return true;
    }

    @Override
    public boolean delete(int index){

        for (int i = index;i < pointer; i++){
            array[i] = array[i+1];
        }
        array[pointer] = null;
        pointer--;
        if (array.length > DEFAULT_SIZE && pointer < array.length / CUT_RATE){
            resize(array.length/2);
        }

        return true;
    }

    @Override
    public Object get(int index) {
        if (index <= pointer && index >= 0){
            return  array[index];
        }else return  "You are trying to get wrong index!";
    }

    @Override
    public boolean contain(S o) {
        for (int i = 0; i < pointer; i++) {
            if(array[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection8 o) {
        if (this.pointer == o.pointer){

            for (int i = 0; i < pointer; i++) {
                if (this.array[i] == o.array[i]) return true;
            }
        }

        return false;
    }



    @Override
    public boolean clear() {

        final Object[] es = array;
        for (int to = size(), i = pointer = 0; i < to; i++)
            es[i] = null;

        return true;
    }

    @Override
    public int size() {
        return pointer;
    }


    @Override
    public void resize(int newLength) {
        array = Arrays.copyOf(array, newLength);
    }
}
