/*
经典异常练习：
		老师用电脑上课。
		
		可能出现的问题（异常）
		电脑蓝屏（可处理）
		电脑冒烟（不可处理）
*/
public class demo
{
	public static void main(String[] args)
	{
		Teacher t = new Teacher("新老师");
		try
		{
			t.prelect();
		}
		catch(NoPlanException e)
		{
			System.out.println(e.toString());
			System.out.println("换老师或者放假");
		}
	}
}


class NoPlanException extends Exception
{
	NoPlanException(String msg)
	{
		super(msg);
	}
}


class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class maoyanException extends Exception
{
	maoyanException(String msg)
	{
		super(msg);
	}
}


class Computer
{
	private int state = 3;
	public void run()throws LanPingException,maoyanException
	{
		if(state==2)
			throw new LanPingException("蓝屏了");
		if(state==3)
			throw new maoyanException("冒烟了");
		System.out.println("电脑运行");
	}
	public void reset()
	{
		state=1;
		System.out.println("电脑重启");
	}
}

class Teacher
{
	private String name;
	private Computer cmpt;
	Teacher(String name)
	{
		this.name = name;
		cmpt = new Computer();
	}
	
	public void prelect()throws NoPlanException
	{
		try
		{
			cmpt.run();
		}
		catch(LanPingException e)
		{
			cmpt.reset();
		}
		catch(maoyanException e)
		{
			lianxi();     //注意：throw是除了return后第二个方法结束的标志，所以throw必须写到最后！
			throw new NoPlanException("课时计划无法完成！"+e.getMessage());
		}
		System.out.println("讲课");
	}
	
	public void lianxi()
	{
		System.out.println("练习");
	}
}