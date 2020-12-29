package hometask10;


public class MyIterator {

    private String[] array;
    private int pointer = 0;

    public MyIterator(int size){
        array = new String[size];
    }

    public boolean add (int index, String o){
        array[index] = o;
        return true;
    }

    public int size() {
        return array.length;
    }

    public boolean hasNext(){
        if (pointer +1 != array.length){
            return true;
        }else pointer = 0;
        return false;
    }

    public String next(){
        pointer++;
        return array[pointer];
    }

    public void remove(){
        array[pointer] = null;
    }

}
