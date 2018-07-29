import warrior.RollingDie;
import warrior.Warrior;

public class Arena {

    private Warrior warrior1;
    private Warrior warrior2;
    private RollingDie die;

    public Arena(Warrior warrior1, Warrior warrior2, RollingDie die) {
        this.warrior1 = warrior1;
        this.warrior2 = warrior2;
        this.die = die;
    }

    private void render() {
        System.out.println("-------------- Arena -------------- \n");
        System.out.println("Warriors: \n");
        printWarrior(warrior1);
        System.out.println();
        printWarrior(warrior2);
        System.out.println();
    }

    private void printMessage(String message) {
        System.out.println(message);
        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            System.err.println("Unable to put the thread to sleep");
        }
    }

    public void fight() {
        // The original order
        Warrior w1 = warrior1;
        Warrior w2 = warrior2;
        System.out.println("Welcome to the Arena!");
        System.out.println("Today " + warrior1 + " will battle against " + warrior2 + "! \n");
        // swapping the warriors
        boolean warrior2Starts = (die.roll() <= die.getSidesCount() / 2);
        if (warrior2Starts) {
            w1 = warrior2;
            w2 = warrior1;
        }
        System.out.println(w1 + " goes first! \nLet the battle begin...");
        // fight loop
        while (w1.alive() && w2.alive()) {
            w1.attack(w2);
            render();
            printMessage(w1.getLastMessage()); // attack message
            printMessage(w2.getLastMessage()); // defense message
            if (w2.alive()) {
                w2.attack(w1);
                render();
                printMessage(w2.getLastMessage()); // attack message
                printMessage(w1.getLastMessage()); // defense message
            }
            System.out.println();
        }
    }

    private void printWarrior(Warrior w) {
        System.out.println(w);
        System.out.print("Health: ");
        System.out.println(w.healthBar());
    }

}
