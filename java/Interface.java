interface Callback
{
	void callback(int param);
}

class Client implements Callback{
public void callback(int p)
{
	System.out.pritnln("callback called with"+P);
}

void nonIfacemeth()
{
	System.out.println("classes that implement " + "may also define other members,too.");
}
}

class Interface
{
	public static void main(String args[])
	{
		Client c = new Client();
		c.Callback(42);
		c.nonIfacemeth();
	}
}