package com.lynch.util;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
/**
 * JUnit测试类
 * @author Lynch
 * 
 * 一个单元测试用例执行顺序为：
 * @BeforeClass –> @Before –> @Test –> @After –> @AfterClass
 * 每一个测试方法的调用顺序为：
 * @Before –> @Test –> @After
 */
public class CalculatorTest {

	/*
	 * JUnit测试注意事项：
	 * 
	 * 1、测试方法上必须使用@Test注解修饰；
	 * 2、测试方法必须使用public void修饰，不能带任何参数；
	 * 3、新建一个源代码目录来存放测试代码；
	 * 4、测试类的包名应该与被测试类包名保持一致；
	 * 5、测试单元中的每个方法必须可以独立测试，测试方法间不能有任何的依赖；
	 * 6、测试类使用Test作为类名的后缀(尽量保持这种规范)；
	 * 7、测试方法使用test作为方法名的前缀(尽量保持这种规范)； 
	 * 8、@BeforeClass修饰的方法会在所有方法被调用前执行，该方法是静态的，所以当测试类被加载后接着就会运行它，且内存中只有一个该实例，
	 * 	  比较适合加载配置文件；
	 * 9、@AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库连接等；
	 * 10、@Before和@After会在每个测试方法的前后各执行一次；
	 * 
	 */
	
	
	
	/**
	 * @BeforeClass注解：针对所有测试，只执行一次，且必须为static void
	 */
	@BeforeClass
	public static void testBeforeClass(){
		System.out.println("========BeforeClass JUnit test.========\n");
	}
	
	/**
	 * @Before注解：初始化
	 */
	@Before
	public void testBefore(){
		System.out.println("-------Before JUnit test.-------");
	}
	
	/**
	 * @Test注解：测试方法，在这里可以测试期望异常和超时时间
	 * 加法测试方法
	 */
	@Ignore("我不想被执行")		//忽略该测试方法
	@Test(timeout=1000)		//设置超时时间,避免死循环
	public void testAdd() {
		assertEquals(3, new Calculator().add(2, 1));
		while(true){
			System.out.println("This method is "+Thread.currentThread().getStackTrace()[1].getMethodName());
		}
	}

	/**
	 * 减法测试方法
	 */
	@Test
	public void testSub() {
		assertEquals(3, new Calculator().sub(5, 2));
		System.out.println("This method is "+Thread.currentThread().getStackTrace()[1].getMethodName());	
	}

	/**
	 * 乘法测试方法
	 */
	@Test
	public void testMul() {
		assertEquals(3, new Calculator().mul(3, 1));
		System.out.println("This method is "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	/**
	 * 除法测试方法
	 */
	@Test
	public void testDiv() {
		assertEquals(3, new Calculator().div(6, 2));
		System.out.println("This method is "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	/**
	 * @After注解：释放资源
	 */
	@After
	public void testAfter(){
		System.out.println("-------After JUnit test.-------\n");
	}
	
	/**
	 * @AfterClass注解：针对所有测试，只执行一次，且必须为static void
	 */
	@AfterClass
	public static void testAfterClass(){
		System.out.println("========AfterClass JUnit test.========\n");
	}
}
