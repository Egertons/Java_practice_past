public class demo
{
	public static void main(String[] args)
	{
		
	}
}

/*
		Jar包
			Java的压缩包
					方便项目的携带。
					方便于使用，只要在classpath中设置jar路径即可。
					数据库驱动，SSH框架等都是以jar包体现的。
					
					
				直接输入jar可以调出jar的参考命令提示。
						-t列出归档目录
						-v显示详情信息
					
			通常在当前目录下操作，例如：
					jar -c(创建)f(指定文件名) demo.jar (需要压缩的包-1) (需要压缩的包-2)
					jar -t(查看)f(指定文件名) demo.jar (需要查看的包-1) (需要查看的包-2)
					
			
			
			在创建jar包的时候，JVM会默认在jar包中创建一个特殊的配置文件目录。
					通过修改该配置文件目录可以达到一些特殊的执行效果。
					
			jar包的功能还在于，在配置过classpath之后，可以只依赖于jar包来执行Java文件。
			
			
					jar -tf a.jar >C:\1.txt    //命令行的新特性，可以将内容直接输出到指定文件中。
						又称为  数据重定向（数据重新定义输出方向）

native --新关键字     本地方法的意思，用于方法函数的定义，调用系统（Win）底层的具体实现。

*/