package com.company;

public class Fighter {
    String name;
    Float health;
    Float damage;


    public Fighter(String name, Float health, Float damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack(Fighter opponent){
        opponent.setHealth(opponent.getHealth() -damage );
        System.out.println("ATTACKING OPPONENT " +opponent.getName()+ " hp left to opponent: " + opponent.getHealth());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHealth() {
        return health;
    }

    public void setHealth(Float health) {
        this.health = health;
    }





}
