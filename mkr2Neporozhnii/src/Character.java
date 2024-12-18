public abstract class Character extends Observable {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = 0;
        this.y = 0;
    }

    public abstract void attack();

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        notifyObservers(name + " перемістився до координат: (" + x + ", " + y + ")");
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public double distanceTo(Character other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

}
