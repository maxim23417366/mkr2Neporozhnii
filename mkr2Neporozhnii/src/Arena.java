import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private final int visibilityRadius = 5;

    public void addCharacter(Character character) {
        characters.add(character);
        character.notifyObservers(character.getName() + " з'явився на арені зі здоров'ям: " + character.getHealth());
    }

    public void characterAttack(Character attacker) {
        System.out.println("На арені: " + attacker.getName() + " розпочинає атаку.");
        attacker.attack();
    }
    public void notifyVisibility(Character movingCharacter) {
        for (Character other : characters) {
            if (movingCharacter != other) {
                double distance = movingCharacter.distanceTo(other);
                if (distance <= visibilityRadius) {
                    movingCharacter.notifyObservers(
                            String.format("%s бачить %s у радіусі %.2f", movingCharacter.getName(), other.getName(), distance)
                    );
                }
            }
        }
    }
}
