package Java_Classes;

class animals extends food{
	private String name;
	private double width;
	private double height;
	
	public animals(String name, double width, double height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public void Prind() {
		System.out.println("welcome");
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
