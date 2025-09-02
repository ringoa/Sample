
public class RpgCharacter {

	public String name;
	public int hp;
	public int offense;
	public int defense;

	public RpgCharacter() {
	}

	public RpgCharacter(String name, int hp, int offense, int defense) {
		this.name = name;
		this.hp = hp;
		this.offense = offense;
		this.defense = defense;
	}

	public void attack(RpgCharacter opponent) {
		int damage = this.offense - opponent.defense;

		if(damage > 0) {
			opponent.hp = opponent.hp - damage;
			System.out.println(this.name + " は " + opponent.name + " に " + damage + " のダメージを与えた！");
        } else {
            System.out.println("ミス！ " + this.name + " は " + opponent.name + " にダメージを与えられない！");
        }
		}
}