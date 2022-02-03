package ru.java.level.two;

public class Main {

    public static void main(String[] args) {
        Players catPapich = new Cat("Папич", 5, 10);
        Players humanMax = new Human("Макс", 2, 30);
        Players robotApple = new Robot("Яблоко", 10, 100);

        Players [] players = {catPapich, humanMax, robotApple};

        Barriers wall = new Wall(5);

        Barriers track = new Track(15);

        Barriers [] barriers = {wall, track};

        for (int i = 0; i < barriers.length; i++) {
            for (Players players1 : players){
                if (players1.success()){
                    barriers[i].checking(players1);
                }
            }
        }
    }
}
