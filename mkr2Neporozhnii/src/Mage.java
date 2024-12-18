public class Mage extends Character {
    public Mage() {
        super("Маг: Сієна Фуегонаса", 120, 40);
    }

    @Override
    public void attack() {
        System.out.println(name + " атакує магією з потужністю " + attackPower);
    }
}