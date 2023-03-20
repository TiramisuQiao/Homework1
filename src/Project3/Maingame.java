package Project3;

public class Maingame {
	public static void main(String[] args) {
		Charater ch = new Charater();
		ch.buildNewcharacter("Tiramisu",185f,70f);
		ch.injure(1.5f);
		ch.injure(0.5f);
		ch.heal(0.5f);
		ch.heal(0.01f);
		ch.change(10f);
		System.out.println(ch.tochString());
	}
}
