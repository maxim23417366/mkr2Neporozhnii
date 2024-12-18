public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();

        // Створюємо персонажів за допомогою Фабричного методу
        Character warrior = CharacterFactory.createCharacter("warrior");
        Character mage = CharacterFactory.createCharacter("mage");
        Character archer = CharacterFactory.createCharacter("archer");

        // Додаємо спостерігачів для персонажів
        Observer playerObserver = message -> System.out.println("[Сповіщення гравцю]: " + message);
        warrior.addObserver(playerObserver);
        mage.addObserver(playerObserver);
        archer.addObserver(playerObserver);

        // Додаємо персонажів на арену (Медіатор)
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Виконуємо дії персонажів
        warrior.move(6, 6);
        mage.move(5, 5);
        archer.move(2, 2);

        arena.notifyVisibility(warrior);
        arena.notifyVisibility(mage);
        arena.notifyVisibility(archer);

        // Атака персонажів через медіатор
        arena.characterAttack(warrior);
        arena.characterAttack(mage);
        arena.characterAttack(archer);
    }
}
