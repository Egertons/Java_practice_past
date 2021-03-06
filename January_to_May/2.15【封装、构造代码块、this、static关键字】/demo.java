/*

封装练习

private  私有权限修饰符，用于修饰类中的成员(成员变量、成员函数)
				私有只在本类中有效。
				
之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断
等语句。
对访问的数据进行操作，提高代码的可执行度（健壮性）。
				
注意：私有只是封装的一种表现形式。
*/
class Persion
/*
假如该类中没有定义构造函数，JVM会自动给该类加入一个空参数
*/
//类似于这样
{
	Persion(){};
	private int age;   //需要注意的是每一个成员变量通常都
	                   //对应两种访问方式---设置、获取。
	public  void setAge(int a)
	{
		//通常设置部分需要写一个筛选项
		if(a>=0  &&  a<130)
		{
			age = a;
			Talk();
		}
		else
			System.out.println("数据不符合区间");
		
	}
	public int getAge()
	{
		return age;
	}
	void Talk()
	{
		System.out.println("age="+age);
	}
}


public class demo
{
	public static void main(String[] args)
	{
		Persion zl = new Persion();
		//zl.setAge(20);
		//System.out.println(zl.getAge());
	
		//gouzao www = new gouzao();
		ren wo = new ren("张霖",20);
		wo.setAge(26);
		wo.print();
		 
	}
}

class gouzao
{
	gouzao()   //这就是构造函数   就写个类名就行了，用于初始化对象
	//只要新建立一个对象，该类中的构造函数就被执行一次
	{
		System.out.println("\n构造函数初始化运行");
	}
}

class ren
{
	private String  name;   //前面的private不写默认为公有方法public
	private int  age;
	
	//构造代码块
	/*
	首先构造代码块没名字
	作用：给对象进行初始化，
	对象一建立就运行，而且优先于构造函数执行
	和构造函数的区别:
	构造代码块是给所有对象统一初始化，执行的是各对象的共性初始化内容
	构造函数是给对应的对象初始化。
	*/
	{
		System.out.println("构造代码块执行中");
	}
	
	ren()   //利用函数的重载特性进行对象的初始化操作。
	{
		System.out.println("A: name= "+name+"    age="+age);
		working();
	}
	ren(String b)
	{
		name = b;
		System.out.println("B: name= "+name+"    age="+age);
		working();
	}
	ren(String c,int h)
	{
		name = c;
		age = h;
		System.out.println("C: name= "+name+"    age="+age);
		working();
	}
	public void working()
	{
		System.out.println("Working");
	}
	public void setName(String jj)
	{
		name = jj;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int hh)
	{
		if(hh>=0 && hh<130)
		{
			age = hh;
		}
		else
		{
			System.out.println("error");
		}
	}
	public int getAge()
	{
		return age;
	}
	public void print()
	{
		System.out.println("\n  "+name+"   "+age);
	}
}
/**
构造函数在类中可以有很多，可能只有一个是共有的，
剩下的全是私有的，利用构造函数间的相互this语句引用来完成
对象的初始化操作。
*/

//一般函数是不能调用构造函数的，其中原因之一是this语句只能用于构造函数。  //调用构造函数必须用this。

//this语句只能写在构造函数的第一行！

//构造函数间用this语句调用时要避免写出死循环。