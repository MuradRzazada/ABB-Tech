package org.abbtech.ModuleTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryManager {
    private static final String FILE_NAME = "C:\\Users\\ASUS\\OneDrive\\Masaüstü\\Inventory.txt";
    private List<InventoryItem> items;

    public InventoryManager() {
        this.items = items;
    }

    public List<InventoryItem> readInventoryItems() throws InvalidDataException.FileIOException, InvalidDataException {
        ArrayList<InventoryItem> items = new ArrayList<>();
        try {
            try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length != 4) {
                        throw new InvalidDataException("Invalid data format in inventory file");
                    }
                    int itemId = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int quantity = Integer.parseInt(parts[2]);
                    double price = Double.parseDouble(parts[3]);
                    items.add(new InventoryItem(itemId, name, quantity, price));
                }
            } catch (FileNotFoundException e) {
                throw new InvalidDataException.FileIOException("Inventory file not found");
            } catch (NumberFormatException ignored) {
            }
            return items;
        } catch (InvalidDataException | InvalidDataException.FileIOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeInventoryItems(List<InventoryItem> items) throws FileIOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (InventoryItem item : items) {
                writer.write(item.getItemId() + "," + item.getName() + "," +
                        item.getQuantity() + "," + item.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new FileIOException("Error writing to file: " + e.getMessage());
        }
    }

    public void addItem(InventoryItem item) throws FileIOException, InvalidDataException, InvalidDataException.FileIOException {
        List<InventoryItem> items = readInventoryItems();
        items.add(item);
        writeInventoryItems(items);
    }

    public InventoryItem findItem(int itemId) throws FileIOException, InvalidDataException, ItemNotFoundException, InvalidDataException.FileIOException {
        List<InventoryItem> items = readInventoryItems();
        for (InventoryItem item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
            return item;
        }
        throw new ItemNotFoundException("Item not found with ID: " + itemId);
    }

    public void updateItem(InventoryItem newItem) throws FileIOException, InvalidDataException, ItemNotFoundException, InvalidDataException.FileIOException {
        List<InventoryItem> items = readInventoryItems();
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId() == newItem.getItemId()) {
                items.set(i, newItem);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ItemNotFoundException("Item not found with ID: " + newItem.getItemId());
        }
        writeInventoryItems(items);
    }

    public void deleteItem(int itemId) throws FileIOException, InvalidDataException, ItemNotFoundException, InvalidDataException.FileIOException {
        List<InventoryItem> items = readInventoryItems();
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId() == itemId) {
                items.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ItemNotFoundException("Item not found with ID: " + itemId);
        }
        writeInventoryItems(items);
    }
}
