public class Cuboid extends Shape implements AreaCalculable , VolumeCalculable {
    private double width;
    private double height;
    private double depth;

	public Rectangle(String name, double width, double height){
		super(name);
		this.width = width;
        this.height = height;
        this.depth = depth;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
    }

    public double getDepth(){
		return depth;
	}

	public void setDepth(double depth){
		this.depth = depth;
    }

    public double getArea(){
        return (2*width*height)+(2*height*depth)+(2*depth*width);
    }

    public double getVolume(){
        return width*height*depth;
    }
    
}