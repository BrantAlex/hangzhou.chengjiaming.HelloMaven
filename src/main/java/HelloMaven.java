package org.apache.maven.hellomaven;
/**
 *一般来说，项目中Java类的包都应该基于项目的groupId和artifactId
 */
public class HelloMaven {
	public String sayHello() {
		return "Hello Maven";
	}

	public static void main(String[] args) {
		System.out.println(new HelloMaven().sayHello());
	}
}
