package ass1;

public class Main4 {

	public static void main(String[] args) {
		Playable g=new Guitar();//upcasting
		Playable p=new Piano();
		g.play();
		p.play();

	}

}
