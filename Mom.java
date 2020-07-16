package ru.timokhina.lesson13;

public class Mom {

    public static void main(String[] args) throws Exception {
        Mom mom = new Mom();
        Child child = new Child();
        for (Food food : Food.values()) {
            child.eat(food);
        }
    }
}
