class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
class rectangle_cons_overload
{
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle();
		System.out.println(obj.getLength());
		System.out.println(obj.getBreadth());
	}
}