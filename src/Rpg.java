
public class Rpg {

	public static void main(String[] args) {
		RpgCharacter hero = new RpgCharacter("勇者", 10, 5, 3);
		RpgCharacter slime = new RpgCharacter("スライム", 5, 2, 2);
		
		hero.attack(slime);
		slime.attack(hero);
	}

}
