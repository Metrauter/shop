package controller;

import model.Category;
import model.Item;
import model.ItemDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemController {
    public static List<Item> itemsByCategory(Category type) {
        ItemDAO idao = new ItemDAO();
        List<Item> items = new ArrayList<>();
        if (!type.equals(Category.ALL)) {
            for (Item item : idao.getAll()) {
                if (item.getCategory().equals(type)) {
                    items.add(item);
                }
            }
        } else {
            items.addAll(idao.getAll());
            Collections.sort(items, Comparator.comparing(Item::getName));
        }
        return items;
    }
}
