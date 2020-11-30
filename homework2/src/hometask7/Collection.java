package hometask7;


public class Collection<T> {

    // Константы
    private final int DEFAULT_SIZE = 10;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[DEFAULT_SIZE];
    private int pointer = 0;

    // Метод для добавления
    public void add(T item) {
        if (pointer == array.length-1){
            resize(array.length*2);
        }
        array[pointer++] = item;
    }

    // Метод для доставания по индексу
    public T get(int index){
        return (T) array[index];
    }

    // Метод удаления
    public void delete(int index){
        for (int i = index;i < pointer; i++){
            array[i] = array[i+1];
        }
        array[pointer] = null;
        pointer--;
        if (array.length > DEFAULT_SIZE && pointer < array.length / CUT_RATE){
            resize(array.length/2);
        }
    }

    // Метод размера массива
    public int size(){
        return pointer;
    }

    // Метод изменения размера массива
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

}
