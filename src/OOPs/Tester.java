package OOPs;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen();
		p1.setColor("Blue");
		System.out.println(p1.color);
		p1.setTip(5);
		System.out.println(p1.tip);
		p1.setColor("Yellow");
		System.out.println(p1.color);
	}

}

class Pen{
	String color;
	int tip;
	
	void setColor(String newColor) {
		color = newColor;
	}
	
	void setTip(int newTip) {
		tip = newTip;
	}
}
