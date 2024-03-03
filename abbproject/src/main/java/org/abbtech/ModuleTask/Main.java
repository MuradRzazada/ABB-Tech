package org.abbtech.ModuleTask;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidDataException, FileIOException, InvalidDataException.FileIOException {
        InventoryManager inventoryManager = new InventoryManager();
        try {
            inventoryManager.addItem(new InventoryItem(1, "item1", 5, 102.5));
            inventoryManager.addItem(new InventoryItem(2, "item2", 2, 201));
            inventoryManager.addItem(new InventoryItem(3, "item3", 3, 185));
            inventoryManager.addItem(new InventoryItem(4, "item4", 4, 89.5));
            inventoryManager.addItem(new InventoryItem(5, "item5", 9, 845));
            inventoryManager.addItem(new InventoryItem(6, "item6", 5, 145));
            System.out.println("All items: ");
            List<InventoryItem> items = inventoryManager.readInventoryItems();
            for (InventoryItem inventoryItem : items) {
                System.out.println(inventoryItem);
                InventoryItem itemToUpdate = inventoryManager.findItem(2);
                itemToUpdate.setQuantity(20);
                inventoryManager.updateItem(itemToUpdate);

                System.out.println("Updated item:");
                System.out.println(inventoryManager.findItem(2));

                inventoryManager.deleteItem(1);

                System.out.println("Remaining items:");
                items = inventoryManager.readInventoryItems();
                for (InventoryItem item : items) {
                    System.out.println(items);
                }
            }
        } catch (FileIOException | InvalidDataException | ItemNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

