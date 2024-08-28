package Homework_hero;

import java.util.Random;

public class Zombie extends Enemy implements Mortal{
    Random r = new Random();
    public Zombie() {
        super();
    }

    @Override
    public void takedDamageFromHero() {
        int damage = r.nextInt(1,15);
        this.setHealth(this.getHealth()-damage);
        System.out.println(this.getClass().getSimpleName() + " taked " + damage + " damage");
        this.isAlive();

    }

    @Override
    public void attackHero(Hero hero) {
        hero.takedDamageFromEnemy();

    }

    @Override
    public void isAlive() {
        if (this.getHealth()<0) this.setLive(false);
    }
}
