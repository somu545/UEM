// Demonstrate variable-length arguments.
class VarArgs {
// vaTest() now uses a vararg.
 void vaTest(int ... v) {
System.out.print("Number of args: " + v.length +
" Contents: ");
for(int x : v)
System.out.print(x + " ");
System.out.println();
}
public static void main(String args[])
{
// Notice how vaTest() can be called with a
// variable number of arguments.
VarArgs obj=new VarArgs();
obj.vaTest(10); // 1 arg
obj.vaTest(1, 2, 3); // 3 args
obj.vaTest(); // no args
}
}