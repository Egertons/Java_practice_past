/*
关键字：final    （最终）
	final可以修饰类、方法、变量。
	final修饰的类不可以被继承。
	final修饰的方法不可以被覆盖.
	final修饰的变量是一个常量。只能被赋值一次。
	
	内部类只能访问被final修饰的局部变量。
	
*/
public class demo     //目前可以修饰类的关键字有  public和final  注意private只能修饰成员（变量、函数）   static大多数情况也是修饰成员，但也可修饰内部类。
{
	public static void main(String[] args)
	{
		System.out.println("\nHello World!");
	}
	
	final void show()
	{
		System.out.println("\nWelcome To Java!");
	}
	
	public static int show1()
	{
		return 88;
	}
}

final class hhh  extends demo  //最终类
{ 
	private hhh(){};
	String name;
	final int uu = 99;   //被final修饰过后的变量变为常量  则uu在内存中一直为99
	public static final int yy = 9;   //全局常量（权限足够大）
	static int num;
	public static void main(String[] args)
	{
		System.out.println(demo.show1());
	}
}

/*
final关键字的特性：
1.被final修饰的类不可以被继承
		可以很好的保证该类的整体封装性不被破坏。
2.被final修饰的方法不可以被覆盖（重写）
		可以更加具有针对性的对类中的方法进行抗修改封装。
3.被final修饰的变量为常量。
		对于并不需要修改的量来说，前加修饰符final更为安全。
		PS：常量的命名法则：
				所有字母都大写，如由多个单词所组成，单词间通过_连接。
*/


/*
经验积累部分：
编译报错需要标识符：
		把输出执行语句直接写在类里面了，该类没写主函数。
*/