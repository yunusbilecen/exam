package com.bilgeadam.sinav02;

public class Test {
	public static void main(String[] args) {
		Manager manager1 = new Manager(1, "assistant", "Yunus", LevelType.JUNIOR, "Departmant 1");
		manager1.printInformation();
		Manager manager2 = new Manager(2, "assistant 2", "Yunus", LevelType.INTERMEDIATE, "Departmant 2");
		manager2.printInformation();
	}
}
