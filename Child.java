package ru.timokhina.lesson13;

public class Child {
    public Child (){
    }

    void eat(Food food) throws Exception {
        try {
            if (food == Food.PORRIGE | food == Food.CARROT) {
                throw new Exception("Не вкусно");
            } else {
                System.out.println("Съел за обе щёки.");
            }
            }
        finally {
            System.out.println("Спасибо, мама!");
            }
    }
}

