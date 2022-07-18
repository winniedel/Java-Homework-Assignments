public class Kennel {

	public static void main(String [] args) {
		
		Dog d = new Dog("Sparky", 2);
		System.out.print(d.getName() + " ");
		System.out.print(d.getAgePerson() + "\n");
		
	
	//public String toString() {
	//	return description + info;
	//}
		
		System.out.println(d.toString());
		
		
		
		
		System.out.println();
		
		d.setAge(4);
		
		d.setName("Ronnie");
		d.getAgePerson();
		System.out.print(d.getName() + " ");
		System.out.print(d.getAgePerson());
		
		
		
	}

}
