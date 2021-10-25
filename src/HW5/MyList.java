package HW5;

import java.util.ArrayList;

public class MyList<T extends Number> {

    ArrayList<T> list = new ArrayList<T>();

    public void add(T data) {
        list.add(data);
    }

    public T largest() {
        T largest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).doubleValue() > largest.doubleValue()) {
                largest = list.get(i);
            }
        }
        return largest;
    }

    public T smallest() {
        T smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).doubleValue() < smallest.doubleValue()) {
                smallest = list.get(i);
            }
        }
        return smallest;
    }

    @Override
    public String toString() {
        return "" + list;
    }
}

