public class demo
{
	public static void main(String[] args)
	{
		/*   复习
		first.hh yy = new first().new hh();
		yy.show();
		*/
		/*
				当内部类定义在外部类的成员位置上时，而且非私有。
				可以在外部其他类中，直接被建立对象。
				格式：
						外部类名.内部类名  变量名  =  外部类对象.内部类对象;
				
				
				当内部类在成员位置上时，就可以被成员修饰符修饰。
						比如：private（私有）将内部类在外部类中进行封装。
									static（静态）内部类就具备了静态的特性。
											也就是说：当内部类被static修饰后，只能直接访问外部类中的static成员。出现了访问局限。
		*/
	}
}

/*   复习
class first extends Object
{
	int u = 5;
	class hh
	{
		int u = 88;
		void show()
		{
			System.out.println(first.this.u);
		}
	}
}
*/