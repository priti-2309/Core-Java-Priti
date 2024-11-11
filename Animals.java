package Lab;

class Animal{
	public void makeSound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal{	
	public void makeSound() {
		System.out.println("The Dog Barks.");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("The Cat Meows");
	}
}

public class Animals {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.makeSound();
		Dog d=new Dog();
		d.makeSound();
		Cat c=new Cat();
		c.makeSound();
	}

}
