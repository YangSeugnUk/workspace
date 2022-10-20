package kr.tpc;
public class Dog extends Animal{  // eat() { ? }
	// 이름, 나이, 종 : 상태정보
	// 재정의(override)
	public void eat() {
		System.out.println("dog eat");
	}
	public Dog() {
		super(); // new Animal();
	}
}
