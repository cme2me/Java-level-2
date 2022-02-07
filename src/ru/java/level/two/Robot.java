package ru.java.level.two;

public class Robot implements Players{
    private String name;
    private int maxRange;
    private int maxHeight;
    private boolean success = true;

    public Robot(String name, int maxRange, int maxHeight){
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRange = maxRange;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String runString() {
        return name + "пробегает" + maxRange + "км";
    }

    @Override
    public String jumpString() {
        return name + "прыгает" + maxHeight + "м";
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxRange() {
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
}
