package ru.java.level.two;

public class Track implements Barriers{
    private int range;

    public Track(int range){
        this.range = range;
    }

    @Override
    public String checking(Players players) {
        players.runString();
        players.setSuccess(players.getMaxRange() >= range);
        if (players.success()){
            System.out.println(players.getName() + "пробегает дистанцию в размере" + range + "км");
            return players.getName() + "пробегает дистанцию в размере" + range + "км";
        }else{
            System.out.println(players.getName() + "не смог пробежать дистанцию");
            return players.getName() + "не смог пробежать дистанцию";
        }
    }
}
