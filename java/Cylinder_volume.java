class cylinder
{
	private int height;
	private int radius;
	
	public int getradius(){
	return radius;
	}
	public void setradius(int radius){
	this.radius=radius;
	}
	public int getheight(){
	return height;
	}
	public void setheight(int height){
	this.height=height;
	}
	public double surface(){
	return 2* Math.PI* radius* height + 2* Math.PI* radius* radius; 
	}
	public double volume(){
	return Math.PI* radius* radius* height;
	}
}
class Cylinder_volume
{
	public static void main(String args[])
	{
		cylinder obj = new cylinder();
		obj.setradius(9);
		System.out.println(obj.getradius());
		obj.setheight(12);
		System.out.println(obj.getheight());
		System.out.println("Surface is: "+obj.surface());
		System.out.println("Volumeis: "+obj.volume());
	}
}

		