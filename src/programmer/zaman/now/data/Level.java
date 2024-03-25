package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Level", tags = {"application", "java"})

public enum Level {
    STANDART("Standart Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
