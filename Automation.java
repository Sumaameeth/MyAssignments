package Week3.Day1;

public class Automation extends MultipleLangauge {


	public void java() {
		System.out.println("java lang");
	}

	public void Salenium() {
		System.out.println("Salenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("rubylang");
		
	}

	public static void main(String[] args) {
		Automation au=new Automation();
		au.java();
		au.Salenium();
		au.ruby();
		au.python();
		
	}

}
