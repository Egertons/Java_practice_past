class demo 
{
	public static void main(String[] args)
	{
		int x = 77;
		for(int s = 7;s<=10;--s)
		{
			s += 2;
			System.out.println("s="+s);
		}
		System.out.println("x="+x);
		System.out.println("Hello World~");
	}
}

class zll
{
	public static void main(String[] args)
	{
		int s = 77;
		while (s<=99)
		{
			System.out.println("s="+s);
			s+=3;
		}
	}
}

class kkk
{
	public static void main(String[] args)
	{
		int x = 88;
		do 
		{
			x+=9;
			System.out.println("x="+x);
		}
		while(x<=100);
	}
}

class ggg
{
	public static void main(String[] args)
	{
		for(int s = 88;s <= 99; s = (s <= 99)? ++s: --s) //for 函数里套用三元运算符~
		{
			System.out.println("s="+s);
		}
		System.out.println("Good Luck~");
	}
}