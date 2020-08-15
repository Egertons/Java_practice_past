/*
		RuntimeException（运行异常） 详解：
		
		RuntimeException以及它的子类异常如果在函数内抛出了
				在该函数上不用声明！（特性）
		不仅如此：
				它以及它的子类如直接在函数上声明的话，也不需要在主函数上进行“跟踪”
				
				
				之所以不用在函数上声明，是因为不需要让调用者处理。
				当该异常发生时，希望该程序停止。因为在运行时，出现了无法继续运算的情况，希望停止程序后，对代码进行修正。
				
				这种例子有很多：都是用来提示使用者程序出现BUG了~
				比如：空指针异常、角标越界（数组角标越界、字符串角标越界）
				
				
				
		注意：重点！！!
				如果自定义异常时：该异常发生时，无法继续进行下序运算，
				就让自定义异常继承RuntimeException
*/
public class demo
{
	public static void main(String[] args)
	{
		Tools a = new Tools();
		System.out.println(a.shu(4,0));
	}
}

class Tools
{
	int shu(int a,int b)
	{
		if(b<0)
			throw new fushuException("负数");
		if(b==0)   //手动抛异常
			throw new ArithmeticException("被零除了");
		return  a/b;
	}
}


class person
{
	public void checkname(String name)
	{
		if("lisi".equals(name))  //if(name != null && name.equals("lisi"))  其中equals是字符串类独有的一个方法，用来检测该字符串与指定的是否相同。
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}


class fushuException extends RuntimeException
{
	fushuException(String msg)
	{
		super(msg);
	}
}



/*
对于异常分两种：
		1.编译时被检测的异常。
				可以简略的理解为普通异常：正常抛、方法上声明、主函数try。
		2.编译时不被检测的异常。（运行异常）旨在让程序在出错的时候能够及时的停下来。
*/