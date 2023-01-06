package AbstractClasses;


public class UseAnimals {
	
    public static void main (String[] args) {

		Animal cow1 = new Cow();

		System.out.println("When the cow speaks it says");
		cow1.speak();
		
		Animal dog1 = new Cow();

		System.out.println("When the dog speaks it says");
		dog1.speak();
		
		// Animal[] animals = {new Cow(), new Dog(), new Snake()};

		
		// for(int i=0; i<animals.length; i++){
		// 	String className = animals[i].getClass().getName();
		// 	System.out.print("When the "+className+" speaks it says ");
		// 	animals[i].speak();
		// }
    }
}
