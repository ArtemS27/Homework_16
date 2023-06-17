package ru.netology.competition;

public class Player {
    private int id;
    private String name;
    private int strength;

    public Player(int id, String name, int strength) {
        setId(id);
        setName(name);
        setStrength(strength);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}
