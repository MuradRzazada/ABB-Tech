package org.abbtech.lesson6;

import java.util.ArrayList;
import java.util.List;

class GenericStorage<T extends Person> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }
    public void removeItem(Student id) {
        items.remove(id);

    }
    public T searchItem(int id) {
        return null;

    }
    public void displayAllItems() {
        for (int i = 0; i < items.size(); i++) {
            T item = items.get(i);
            System.out.println("Display all items: " + item);
        }
    }
}
