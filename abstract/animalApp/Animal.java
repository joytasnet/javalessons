public abstract class Animal{
	private String name;
	public Animal(String name){
		this.name=name;
	}
	public abstract void cry();
	public String getName(){
		return this.name;
	}
}
class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	@Override
	public void cry(){
		System.out.println(this.getName()+"はワン！と吠えた");
	}
}
class Pig extends Animal{
	public Pig(String name){
		super(name);
	}
	@Override
	public void cry(){
		System.out.println(this.getName()+"はブーとないた");
	}
}
class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	@Override
	public void cry(){
		System.out.println(this.getName()+"はニャンとないた");
	}
	public void sleep(){
		System.out.println(this.getName()+"はすやすやと眠った");
	}
}
