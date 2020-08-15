/*
接口可以被类多实现。
		一个类可以同时实现多个接口。
		
		Java 不支持“多继承”，但是曲线救国的支持了“多实现”
				Java不支持多继承的原因主要在于：“菱形继承关系”会导致父类继承过来的方法会重复，JVM在理解时就会有所歧义。
				而在Java的多实现中，因为接口中全是抽象方法，根本就没有方法执行体，也就是说，即使在多实现过程中出现了方法的重复，
						但因为这俩接口根本就没有可执行方法体，所以也就不存在执行上的歧义。反正都得复写。
		
*/
public class demo
{
	public static void main(String[] arguments)
	{
		dd hh = new dd();
		hh.show();
		hh.ww();
		hh.ghg();
	}
}


interface hh 
{
	public static final int x = 67;
	public abstract void show();
}
//接口与接口之间还有  继承  关系
interface ww extends hh
{
	public abstract void ww();
}

class hhh
{
	public void ghg()
	{
		int i = 8;
		System.out.println(i);
	}
}

class dd extends hhh implements hh,ww    //Java的多实现——必须同时复写两个接口中的抽象方法才能实例化该类的对象。
//一个类在继承一个类的同时还能够多实现！  真NB 
{
	private int i = 88;
	public void show()
	{
		System.out.println(i+x);
	}
	public void ww()
	{
		System.out.println("i+x="+(i+x));
	}
}