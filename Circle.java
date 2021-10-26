
public class Circle {
	private int radius;
	private Point center;
	
	public Circle(int rad,Point cent) {
		this.radius=rad;
		this.center=cent;
	}
	public String toString() {
		return "rad="+this.radius+this.center.toString();
	}
	public Object getPoint() {
		// TODO Auto-generated method stub
		return this.center;
	}
}
