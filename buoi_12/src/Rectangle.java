public class Rectangle {

	public int width;
	public int height;
	
	public Rectangle() {
	}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
	
	public double perimeter() {
		return (this.width + this.height) * 2;
	}
	
	public double area() {
		return this.width * this.height;
	}
	
	public String getInfo() {
		return String.format("Width = %d, Height = %d => C = %f, S = %f", this.width, this.height, this.perimeter(), this.area());
	}

}