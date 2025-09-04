package oops;
class Animal{}
class Monkey extends Animal{}
class AnimalApp{
	public void m1(Monkey m) {
		System.out.println("Monkey Version");
		}
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
}

public class Sample {
public static void main(String[]args) {
	AnimalApp a = new AnimalApp();
	Monkey m = new Monkey();
	a.m1(m);//Monkey Version
	
	Animal animal = new Animal();
	a.m1(animal);//Animal version
	
	Animal an = new Monkey();
	a.m1(an);//Animal version
}
}
