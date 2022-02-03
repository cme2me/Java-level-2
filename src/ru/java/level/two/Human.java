package ru.java.level.two;

public class Human implements Players{
    private String name;
    private int maxRange;
    private int maxHeight;
    private boolean success = true;

    public void human(String name, int maxRange, int maxHeight){
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRange = maxRange;
    }
    public String runString(){
        return name + "пробегает" + maxRange + "км";
    }
    public String jumpString(){
        return name + "прыгает" + maxHeight + "м";
    }
    public String getName(){
        return name;
    }
    public int getMaxRange(){
        return maxRange;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getMaxHeight(){
        return maxHeight;
    }
}

