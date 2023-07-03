import hero.*;


public class HW_1 {
    public static void main( String[] args ) {

        // Крестьянин
        Peasant peasant = new Peasant("Stive", 5, 100);
        // Разбойник
        Rogue rogue = new Rogue("Mary", 5, 150);
        // Снайпер
        Sniper sniper = new Sniper("Dave", 5, 120);
        // Колдун
        Warlock warlock = new Warlock("Ben", 5, 80);
        // Копейщик
        Spearman spearman = new Spearman("Kelly", 5, 200);
        // Арбалетчик
        Crossbowman crossbowman = new Crossbowman("Bill", 5, 110);
        // Монах
        Monk monk = new Monk("Mike", 5, 90);

        // можем использовать каждый персонаж и вызывать их методы
        System.out.println(  );
        peasant.attack(rogue);
        peasant.harvest();
        rogue.attack(spearman);
        rogue.die();
        sniper.rest(50);
        sniper.aim();
        warlock.rest(30);
        warlock.curse();
        crossbowman.attack(monk);
        crossbowman.reload();
        spearman.takeDamage(50);
        spearman.brace();
        monk.rest(20);
        monk.heal();
        monk.step();
        monk.stepUp();
        monk.stepDown();
        monk.stepLeft();
        monk.stepRight();

        System.out.println( "\n" + peasant );
        System.out.println( rogue );
        System.out.println( sniper );
        System.out.println( warlock );
        System.out.println( crossbowman );
        System.out.println( spearman );
        System.out.println( monk + "\n" );
    }
}