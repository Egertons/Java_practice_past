public class demo
{
	public static void main(String[] args)
	{
		int[] x = new int[4];                        //数组的第一种定义方法
		System.out.println(x[0]);
		x[1]=77;
		System.out.println(x[1]);
	}
}
class ddd
{
	public static void main(String[] args)
	{
		int[] at = new int[]{0,99,999,999,74};       //数组的第二种定义方法
		at[0] = 77;
		System.out.println("at数组="+at[2]);
	}
}

class ty
{
	public static void main(String[] args)
	{
		int[] ty ={2,6,7,88,66,9};                   //数组的第三种定义方法
		for(int x = 0;x<ty.length;++x)
		{
			System.out.println("数组ty第"+x+"个="+ty[x]);
		}
		//System.out.println(Arrays.toString(ty));    有待调试
 	}
}