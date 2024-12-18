public class Archer extends Character {
    public Archer() {
        super("Лучниця: Сестра шипа Кериліан", 100, 30);
    }

    @Override
    public void attack() {
        System.out.println(name + " стріляє з лука з потужністю " + attackPower);
    }
}