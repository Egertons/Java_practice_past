/*
接口以及继承多态的练习：
		需求：   操纵数据库
		1.连接数据库     JDBC（手动连接数据库）         Hibernate（框架式连接服务器）
		2.使用数据库
				增、删、改、查
		3.关闭数据库连接
*/
public class demo         //主函数只对接接口或者抽象类，降低对实例工具类对象的依赖性。提高代码的扩展性。
{
	public static void main(String[] args)
	{
		User a = new User();
		a.name = "zhanglin";
		a.num = 78;
		jj i = new JDBC();      //多态      利用接口多态来实现在主函数中的工具类方法类调用
		i.add(a);
	}
}

class User
{
	String name;
	int num;
	char xingbie;
}

interface jj          //利用接口来向上抽取各个方法类的相同点，，用接口来在中间连接工具类和主函数。
{
	public abstract void add(User a);
	public abstract void shan(User a);
	public abstract void gai(User a);
	public abstract void find(User a);
}


class JDBC implements jj      //标准单个工具类，，，通过实现接口来达到与主函数需求的吻合。  需复写接口中的所有抽象方法。
{
	public void add(User a)
	{
		System.out.println("JDBC add");
	}
	public void shan(User a)
	{
		System.out.println("JDBC shan");
	}
	public void gai(User a)
	{
		System.out.println("JDBC gai");
	}
	public void find(User a)
	{
		System.out.println("JDBC find");
	}
}



class Hibernate implements jj           //这样做极大的提高的代码的扩展性    ，后续再需要增加新的工具类（技术栈）时，只需在程序中添加新的类即可。对主函数中的改动极少。
{
	public void add(User a)
	{
		System.out.println("Hibernate add");
	}
	public void shan(User a)
	{
		System.out.println("Hibernate shan");
	}
	public void gai(User a)
	{
		System.out.println("Hibernate gai");
	}
	public void find(User a)
	{
		System.out.println("Hibernate find");
	}
}