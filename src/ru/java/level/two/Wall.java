package ru.java.level.two;

public class Wall implements Barriers{
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public String checking(Players players) {
        players.jumpString();
        players.setSuccess(players.getMaxHeight() >= height);
        if (players.success()){
            System.out.println(players.getName() + "перепрыгнул стену:" + height + "м");
            return players.getName() + "перепрыгнул стену" + height + "м";
        }
        else{
            System.out.println(players.getName() + "не смог перепрыгнуть стену");
            return players.getName() + "не смог перепрыгнуть стену";
        }
    }
}
