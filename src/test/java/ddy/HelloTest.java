package ddy;

import org.junit.Test;

/**
 * HelloTest类是Hello类的单元测试类，用于验证Hello类的功能是否正常工作。
 * 该测试类使用JUnit框架进行测试，确保Hello类的main方法能够正确执行。
 */
public class HelloTest {

	/**
	 * 测试Hello类的main方法能否正常执行
	 * 验证main方法在传入null参数时不会抛出异常
	 */
	@Test
	public void testMain() {
		Hello.main(null);
	}

}
