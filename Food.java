package ru.timokhina.lesson13;

public enum  Food {
    APPLE ("apple"),
    CARROT ("carrot"),
    PORRIGE("porrige");

    private String food;
    Food(String food)    {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}
