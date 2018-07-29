import warrior.Dolzhanskii;
import warrior.RollingDie;
import warrior.Venceslav;
import warrior.Warrior;

public class Main {

    public static void main(String[] args) {

        RollingDie die = new RollingDie(10);
        Warrior dolzhanskii = new Dolzhanskii("warrior.Dolzhanskii", 100, 30, 10, die);
        Warrior venceslav = new Venceslav("warrior.Venceslav", 100, 30, 10, die);
        Arena arena = new Arena(dolzhanskii, venceslav, die);
        arena.fight();

    }

}
