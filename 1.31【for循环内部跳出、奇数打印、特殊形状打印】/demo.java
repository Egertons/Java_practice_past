class demo
{
	public static void main(String[] args)
	{
		System.out.println("\nHello World!");
		q:for(int x = 10;x < 20;++x)
		{
			for(int y = 5;y==7;++y)
			{
				System.out.println("Hello ZL!");
				if(x==15)
				
					break q;     //当双重for嵌套时，可以将外侧的for循环命名，并可在内侧for循环中指定当满足某些条件语句时跳出外部循环。
				
			}
		}
	}
}
class lianxi
{
	public static void main(String[] args)
	{
			int u = 7;
			int h = 0;
			h=8+u;
		for(int x = 6;x != 10;++x)
		{
			
			for(int y = u; y<=h ; y+=1)
			{
				if(y%2==1)
				{
					System.out.print("\t"+y+"是奇数"+"\t");
				}
				else
				{
					continue;
				}
			}
			System.out.println();
			h+=10;
			u+=10;
		}
	}
}


/**
实现效果:
----*
---**
--***
-****
*****
*/
class cd
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 2;
		for(int g = 1;g!=6;++g)
		{
			for(int l=1;l!=x;++l)
			{
				System.out.print(" ");
			}
			for(int b=1;b!=y;++b)
			{
				System.out.print("*"+" ");
			}
			--x;
			++y;
			System.out.println();
		}
		
	}
}