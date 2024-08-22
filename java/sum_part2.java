import p1.sum_package;
class sum_part2
{
	public static void main(String args[])
	{
		sum_package obj = new sum_package();
		int a =obj.get_data();
		int b= obj.get_data();
		int c = a+b;
		System.out.println("sum is = "+c);
	}
}