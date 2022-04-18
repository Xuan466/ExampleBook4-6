class Employee
{
	String name, email, position; 
	int balance;
	
	//first constructor which gives email and name
	Employee(String input1, String input2)
		{
		name = input1;
		email= input2;
		balance = 0;
		}
	
	// second constructor that gives name, email and balance 
	Employee(String input1, String input2, int input3)
	{
		name = input1;
		email= input2;
		balance = input3;
	}
	
	//method for getting balances
	public int getBalance()
	{
		return balance;
	}
	
	//method for getting initials
	public String getInitials()
	{
		String initials = "";
	
		for (int i = 0; i<name.length(); i++)
		{
			char currentChar = name.charAt(i);
				if (currentChar >= 'A' && currentChar <= 'Z')
					initials = initials + currentChar + ".";
					
		}
	return initials;
	}
	
	
}

public class FinalProject 
{
	public static void main(String []args)
	{
		Employee[] employeeInitials = new Employee[16];
		employeeInitials[0] = new Employee("Janelly Antonio", 
				"janelly.antonio@sunydutchess.edu", 278);
		employeeInitials[1] = new Employee("Daniel Conroy", 
				"daniel.conroy@sunydutchess.edu", 329);
		employeeInitials[2] = new Employee("Wenhao Jin", 
				"wenhao.jin@sunydutchess.edu", 445);
		employeeInitials[3] = new Employee("Nathaniel Jones",
				"nathaniel.jones@sunydutchess.edu", 402);
		employeeInitials[4] = new Employee("Sean Kirchner",
				"sean.kirchner@sunydutchess.edu", 388);
		employeeInitials[5] = new Employee("Sabrina Lin", 
				"sabrina.lin@sunydutchess.edu", 275);
		employeeInitials[6] = new Employee("Eric Luna",
				"eric.luna@sunydutchess.edu", 243);
		employeeInitials[7] = new Employee("Kevin Luna",
				"kevin.luna@sunydutchess.edu", 334);
		employeeInitials[8] = new Employee("Zayad Maanane",
				"zayad.maanane@sunydutchess.edu", 412);
		employeeInitials[9] = new Employee("Hanne Nicolaisen",
				"hanne.nicolaisen@sunydutchess.edu", 393);
		employeeInitials[10] = new Employee("Jackson Nogles",
				"jackson.nogles@sunydutchess.edu", 299);
		employeeInitials[11] = new Employee("Emily Parvar", 
				"emily.parvar@sunydutchess.edu", 343);
		employeeInitials[12] = new Employee("Jaspreet Singh",
				"jaspreet.singh@sunydutchess.edu", 317);
		employeeInitials[13] = new Employee("Athena Stebe Glorius",
				"athena.steveglorius@sunydutchess.edu", 265);
		employeeInitials[14] = new Employee("Melanie Talyor",
				"melanie.talyor@sunydutchess.edu", 354);
		employeeInitials[15] = new Employee("Tankeh Appolo",
				"appolo.tankeh@sunydutchess.edu", 234);
		
		//print initials and initials
		for(int i = 0; i<employeeInitials.length; i++)
		{
				System.out.println("Initials: " +employeeInitials[i].getInitials());
				System.out.println("Balance: " + employeeInitials[i].getBalance() + "k");
				System.out.println("\n");
		}
		
	}
}
