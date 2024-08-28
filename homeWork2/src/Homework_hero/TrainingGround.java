package Homework_hero;

public class TrainingGround {
    public static void main(String[] args) {
        Hero mage = new Mage();
        Enemy zombie = new Zombie();
        TrainingGround.battle(mage,zombie);

    }

    public static void battle(Hero hero,Enemy enemy){
        while (hero.getLive() && enemy.getLive()){
            hero.attackEnemy(enemy);
            if (!enemy.getLive()) {
                System.out.println(enemy.getClass().getSimpleName()+" was died");
                break;
            }
            enemy.attackHero(hero);
            if (!hero.getLive()){
                System.out.println(hero.getClass().getSimpleName()+ " was died");
            }
        }
    }
}
