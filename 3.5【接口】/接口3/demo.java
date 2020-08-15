//接口间存在多继承！
public class demo
{
	public static void main(String[] args)
	{
		dd xin = dd.show();
		xin.maii();
		xin.hh();
	}
}

interface a   //接口1
{
	public static final int x = 1;
}

interface bb  //接口2
{
	public abstract void maii();
}
interface b extends a,bb   //接口3继承 至 接口1和2
{
	public abstract void hh();
}

class dd implements b   //类dd实现接口3
{
	//单例
	private dd(){}
	private static dd hh = new dd();
	public static dd show()
	{
		return hh;
	}
	
	int[] ss = {99,87,65};
	/*
	创建数组的三种方式回顾：
	int[] ss = new int[6];     创建一个空间为6的空数组。
	int[] ss = {元素1,元素2,元素3,元素4};    创建数组的简略写法    
	int[] ss = new int[]{1,2,3,4};      数组创建的标准方法。
	*/
	public void maii()
	{
		for(int x = 1;x<ss.length;x+=1)
		{
			System.out.println(ss[x]);
		}
	}
	public void hh()
	{
		System.out.println("\nHello World!");
	}
}

/*
少数极端缺心眼式写法警告：
interface a
{
	public abstract int show();
}
interface b extends a
{
	public abstract boolean show();
}
*/