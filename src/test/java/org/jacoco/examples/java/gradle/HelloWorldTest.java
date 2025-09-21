package org.jacoco.examples.java.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * HelloWorldTest类是HelloWorld类的单元测试类，用于验证HelloWorld类的getMessage方法功能是否正确。
 * 该测试类使用JUnit框架进行测试，确保HelloWorld类在不同输入条件下能返回预期的结果。
 */
public class HelloWorldTest {

	private HelloWorld subject;

	/**
	 * 在每个测试方法执行前初始化测试对象
	 * 创建HelloWorld实例供测试使用
	 */
	@Before
	public void setup() {
		subject = new HelloWorld();
	}
	
	/**
	 * 测试getMessage方法在传入false参数时的行为
	 * 验证方法返回预期的"Hello World!"字符串
	 */
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}
	
}
