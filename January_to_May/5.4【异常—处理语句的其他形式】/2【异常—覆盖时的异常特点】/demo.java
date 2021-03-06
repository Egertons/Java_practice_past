/*
		异常—覆盖时的异常特点
		（异常在子父类覆盖中的体现）
		
				1.子类在覆盖父类时，如果父类的方法抛出异常，那么子类的覆盖方法
						只能抛出父类的异常或者该“异常”的子类异常，或者不抛。
								PS：这里注意，如果子类对象中重写的方法确实有独特于父类的新异常情况出现。
										那么，就只能在子类方法内部解决掉（try、catch）不能向外声明抛出。
				
				2.如果父类方法抛出多个异常，那么子类在覆盖该方法时，只能抛出父类异常的自集。当然，不抛也行。
				
				3.如果父类或者接口方法中没有异常抛出，那么子类在覆盖方法时，也不可以抛出异常。
					如果子类方法中发生了异常，就必须就地处理，绝对不能抛出。
*/
public class demo
{
	public static void main(String[] args)
	{
		Text a = new Text();
		a.d(new Zi());  //这里传入new Zi()就是多态的体现，父类对象指向子类引用。
	}
}

class AException extends Exception
{
	
}
class BException extends AException
{
	
}
class CException extends Exception
{
	
}

class Fu
{
	void show()throws AException
	{
		
	}
}

class Zi extends Fu
{
	void show()throws BException//这里还可以抛出AException，但就是不能抛出CException(主要在于在多态层面上的考量)
	{
		System.out.println("\nHello World");
	}
}


class Text
{
	public void d(Fu f)
	{
		try
		{
			f.show();
		}
		catch(BException e) //这里注意：如果创建对象时，传入的不是Fu 而是 Zi；那么，这时如果Zi里面声明的是A异常或者B异常则都可以通过异常间的继承多态来解决，但是要是Zi声明的是C异常的话，就报错了。
		{
			e.toString();
		}
	}
}