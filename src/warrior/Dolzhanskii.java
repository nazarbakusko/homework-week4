package warrior;

public class Dolzhanskii extends Warrior {

    public Dolzhanskii(String name, int health, int damage, int defense, RollingDie die) {
        super(name, health, damage, defense, die);
    }

    @Override
    public String toString() {
        return getName();
    }
}
