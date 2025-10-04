package oops.generics;

import java.util.Arrays;

class custoArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public custoArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int removo() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder("[");
    //     for (int i = 0; i < size; i++) {
    //         sb.append(data[i]);
    //         if (i < size - 1) {
    //             sb.append(", ");
    //         }
    //     }
    //     sb.append("]");
    //     return sb.toString();
    // }
    @Override
    public String toString() {
        return "customArrayList{"
                + "data=" + Arrays.toString(data)
                + ", size=" + size
                + '}';
    }

    public static void main(String[] args) {
        custoArrayList list = new custoArrayList();
        list.add(3);
        list.add(7);
        list.add(5);

        System.out.println(list);
    }
}
