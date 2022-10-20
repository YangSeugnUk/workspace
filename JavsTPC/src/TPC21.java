import kr.tpc.*;

public class TPC21 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class
		Animal ani = new Dog(); //upcasting
		ani.eat();
		
		ani = new Cat(); //Dog,Cat에 대한 다형성 원리
		ani.eat();
//		ani.night();
//		Cat cc = (Cat)ani;
//		cc.night();
		((Cat)ani).night(); // downcasting
	}
}
