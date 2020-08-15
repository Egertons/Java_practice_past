/*
主要练习比较数组大小值。
*/
public class demo
{
	public static void min(int[] a) //函数最小值
	{
		int y = a[0];
		for(int x = 1;x<a.length;++x)
		{
			y = (y < a[x])?y:a[x];
		}
		System.out.println("\n函数最小值是"+y);
	}
	public static void max(int[] b)  //函数最大值
	{
		int h = b[0];
		for(int x = 1;x<b.length;x+=1)
		{
			h = (h>b[x])?h:b[x];
		}
		System.out.println("\n函数最大值是"+h);
	}
	public static void main(String[] args)  //主函数
	{
		int[] ash={55,33,4,11,-99,555,4,3,0,9999999};
		min(ash);
		max(ash);
	}
}