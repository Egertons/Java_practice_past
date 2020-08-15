/*
2.11
*/
public class demo
{
	public static void main(String[] args)
	{
		toBin(6);
		toHex(60);
		chabiao(60);
		changshi(-60);  
		toBin_2(-6);
	}
	
	/*
	十进制转二进制    可以算负数。
	*/
	public static void toBin(int b)
	{
		StringBuffer sb = new StringBuffer(); //本质是一个对象，是存储数据的容器。
		while(b>0)
		{
			sb.append(b%2);   //py中的列表添加方法。是StringBuffer 的一个特性
			b=b/2;
		}
		System.out.println(sb.reverse()); //打印的时候顺便反转。
	}
	
	/*
	十进制转十六进制    P56
	*/
	public static void toHex(int g)
	{
		StringBuffer oo = new StringBuffer();
		for(int x = 0;x<8;x+=1)
		{
			int tmp = g&15;
			if(tmp>9)
			{
				oo.append((char)(tmp-10+'A'));
			}
			else
			{
				oo.append(tmp);
			}
			g = g >>> 4;
		}
		System.out.println(oo.reverse());
	}
	
	/*
	查表法：十六进制的元素一共就有15个而且还是从0开始的故而
					可以创建一个数组先行储存这些值，再把目标数&15后
					的结果与数组内元素进行查找。（大体思路）
	*/
	public static void chabiao(int num)
	{
		StringBuffer oo = new StringBuffer();
		char[] chs ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		for(int x = 0;x<8;x+=1)
		{
			int tmp = num & 15;
			oo.append(chs[tmp]);
			num=num>>>4;
		}
		System.out.println(oo.reverse());
	}
	
	public static void changshi(int num)   //加上注释内容几乎是查表法的最终形态了。
	{
		char[] chs ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		//定义一个数组来接收数据。
		char[] n = new char[8];
		//for(int x=0;x<8;x+=1)
		int l = 0;
		while(num!=0)
		{
			int tmp = num&15;
			n[l++]=chs[tmp];   //l++  与  正常写l再写l+=1;效果一样。    指的是先赋值给l再++    当然如果写成++l就是先把l的值加1再赋值给新的l。
			num=num>>>4;
			//l+=1;
		}
		//遍历打印数组，倒着打印正好“正”着显示。
		for(int x =l-1;x>=0;--x)   //l正好是本次数值进制转换中的十六进制的有效位。此时倒序打印从l-1开始打印可以很好的避免因为char类型数组中默认空格占位的问题。
		{
			System.out.print(n[x]);   //这里写的x是一个初始值不为0的数，目的是倒序打印（显示正序）。其实还可以正常正序打印，但是在之前的char数组储存的时候倒叙储存。l初始值赋成n.length 之后再循环赋值中写成n[--l]=n[tmp];  即从开始储存的时候就是正序的，故而在打印的时候可以正常写成for(int x = l;x<n.length.x+=1)
		}
		System.out.println();
	}
	
	/*
	查表法十进制转二进制。
	*/
	public static void toBin_2(int num)
	{
		char[] chs = {'0','1'};
			//int 类型的数据每个数据有32个二进制位（每个八进制数对应4个二进制位  故而int类型的数据每个有且只有8个八进制位），long类型的数据有64个二进制位。
		char[] arr = new char[32];
			//需要定义一个操作数组的指针。（操作的是新创建的全新空数组，用这个新整值充当指针，用于联络新数组。）
		int pos = arr.length;
		while(num!=0)
		{
			int tmp = num & 1;
			arr[--pos] = chs[tmp];
			num=num >>> 1;
		}
		for(int x = pos;x<arr.length;x+=1)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}
/*
char 类型数组被定义后默认初始值为：‘\u0000’
	其中u指的是  Unicode（Java所支持的国际标准）编码表。
	所代表的是一个空位。
	
Array:可以浅显的不严谨的理解成数组的意义。
*/