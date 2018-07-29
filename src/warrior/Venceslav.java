package warrior;

public class Venceslav extends Warrior {

    public Venceslav(String name, int health, int damage, int defense, RollingDie die) {
        super(name, health, damage, defense, die);
    }

    @Override
    public String toString() {
        return getName();
    }
}
