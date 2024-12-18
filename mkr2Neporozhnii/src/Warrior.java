public class Warrior extends Character {
    public Warrior() {
        super("Воїн: Марк Крубер", 150, 20);
    }

    @Override
    public void attack() {
        System.out.println(name + " атакує мечем з потужністю " + attackPower);
    }
}