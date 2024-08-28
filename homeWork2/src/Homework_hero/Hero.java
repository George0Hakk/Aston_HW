package Homework_hero;

import java.util.Random;

public abstract class Hero {
    Random r= new Random();
    private int max_attack = 20;
    private int min_attack = 5;

    private int damage = r.nextInt(max_attack,min_attack);
    private String name;
    private int health;
    private boolean live = true;

    public Hero() {
        this.name = "William";
        this.health = 250;
    }

    public abstract void takedDamageFromEnemy();
    public abstract void attackEnemy(Enemy enemy);
    public int getMax_attack() {
        return max_attack;
    }

    public int getMin_attack() {
        return min_attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean getLive() {
        return live;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setMax_attack(int max_attack) {
        this.max_attack = max_attack;
    }

    public void setMin_attack(int min_attack) {
        this.min_attack = min_attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
