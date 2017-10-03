
public class MallardDuck extends Duck {
	 MallardDuck(){
    flybehavior = new FlyWithWing();
	quackbehavior = new Quack();
	
	}
	@Override
	void display() {
			System.out.println("Look like a mallard");
	}
}
