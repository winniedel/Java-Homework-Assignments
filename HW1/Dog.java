public class Dog {
	
	String name;
	int age;
	
	

	String description = "Sparky loves to run";
	String info = "Ronnie loves to bite";
	
	public String toString() {
		return description +"\n"+ info;
	}
	
	
	
	public Dog (String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	
	}
	public String getName() {
		return name;
	}
	public int getAgePerson() {
		int humanAge = 0;
		humanAge = age*7;
		return humanAge;
	
	}
	





/*public void printDetails() {
	System.out.println(name + "," + getAgePerson());
}*/
}
