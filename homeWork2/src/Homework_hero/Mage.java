package Homework_hero;

import java.util.Random;

public class Mage extends Hero implements Mortal {

    Random r=new Random();
    public Mage() {
        super();
    }

    @Override
    public void takedDamageFromEnemy() {
        int damage = r.nextInt(1,15);
        this.setHealth(this.getHealth()-damage);
        System.out.println(this.getClass().getSimpleName() + " taked " + damage + " damage");
        this.isAlive();
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takedDamageFromHero();
    }

    @Override
    public void isAlive() {
        if (this.getHealth()<0) this.setLive(false);
    }
}
