package org.jacoco.examples.java.gradle;

/**
 * HelloWorld类是JaCoCo测试覆盖示例的核心类，提供简单的问候消息生成功能。
 * 该类演示了基本的条件逻辑和字符串返回功能，用于测试代码覆盖率分析。
 */
public class HelloWorld {
	
	/**
	 * 根据传入的参数生成不同的问候消息
	 * @param bigger 布尔值，决定返回的问候语范围
	 * @return 根据参数返回"Hello Universe!"或"Hello World!"字符串
	 */
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
