package model;

import java.io.Serializable;

public enum Category implements Serializable {
    ALL("Все товары"),
    VIDEOCARD("Видеокарты"),
    CPU("Процессоры"),
    MOTHERBOARD("Материнские платы"),
    MEMORY("Память"),
    HDD("Жесткие диски"),
    POWER("Блоки питания"),
    SOUNDCARD("Звуковые карты");

    Category(String name) {
        this.name = name;
    }

    public static Category byName(String name) {
        for (Category category : Category.values()) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    private String name;
}