package Linked_list;

public class Array {
    int value[];
    int count;

    public Array(int size) {
        value = new int[size];

    }

    public void insert(int dat) {

        if (value.length == count) {
            int newValue[] = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newValue[i] = value[i];
            }
            value = newValue;
        }
        value[count++] = dat;
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            value[i] = value[i + 1];
            count--;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(value[i]);
        }

    }

}
