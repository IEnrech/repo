public class Circulo{
	private float x; 
	private float y;
	
	public Circulo(float xx, float yy)  {
		this.x = xx;
		this.y = yy;
	}
	public Circulo(){
		this.x = 10.0;
		this.y = 10.0;
	}
	public Circulo(Circulo c){
		this.x = c.x;
		this.y = c.y;
	}
	
	public String toString() {
		return ("X: "+this.x+"\nY: "+this.y);
	}
	
	public boolean Equals(Circulo c){
		return if(this.x == c.x && this.y == c.y);
	}
} 