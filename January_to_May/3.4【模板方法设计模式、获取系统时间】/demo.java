/*
练习：
需求：获取一段程序运行的时间
原理：获取程序开始和结束的时间，并相减。

1.获取本机时间：System.currentTimeMillis();

当代码完成优化后，就可以解决这类问题。
那么这种方式，我们称之为：模板方法设计模式。

什么是模板方法呢？
在定义功能时，功能的一部分是确定的，但有一部分是不确定的，而确定的部分在使用不确定部分的代码。
那么，这时就将不确定部分的代码暴露出去，由该类的子类完成。

*/
public class demo
{
	public static void main(String[] args)
	{
		subTime first = new subTime();
		first.getTime();
	}
}

abstract class getTime   //模板方法设计模式（典型）
{
	final public void getTime()
	{
		long start = System.currentTimeMillis();  //记录程序开始的系统时间（毫秒级）
		
		runcode();    //中间的程序部分（仅为示例）
		
		long end = System.currentTimeMillis();  //记录程序结束的系统时间（毫秒级）
		System.out.println("毫秒值相差="+(end - start));
	}
	
	abstract public void runcode();    //单独将一段代码中不确定是否需要修改的部分提取出来封装为一个新的函数，随后再在本类原函数中调用。
	//注意：这一部分不一定是抽象的，有一些案例中可能会出现默认的实现方式，但！支持复写后续改动，则依然适用于模板方法设计模式。
}


class subTime extends getTime
{
	public void runcode()       //只需重写其中一个函数即可。
	{
		for(int x = 0;x!=8000;x+=1)  
		{
			System.out.print(x);
		}
	}
}