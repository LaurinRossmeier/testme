
public class Card {
	private int value;
	private int color;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public Card(int value, int color) {
		super();
		this.value = value;
		this.color = color;
	}
	public void print(){
		System.out.println("Value:" + this.value + " Color: " + this.color);
	}
}

