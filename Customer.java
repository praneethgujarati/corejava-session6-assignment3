package asg6_3;

class Customer{		// Class Customer

	String name;	// Name of customer
	int br;		// Bank branch of customer
	int acc;	// Account number of customer
 	double bal;	// Current Balance

	public void printInfo(){	// Method to print customer info
		System.out.println("\nWelcome " + name + "!");
		System.out.println("Account Number: " + acc);
		System.out.println("Current Balance: " + bal + "\n");
	}

	public Customer setCredentials(){	// Method to set credentials of customer
		this.name = Thread.currentThread().getName();	// Using get name to fetch the name set from initial main method.
		System.out.println("\nWelcome " + this.name + "!");
		System.out.print("Enter your branch code: ");
		this.br = Integer.parseInt(System.console().readLine());
		System.out.print("Enter your account number: ");
		this.acc = Integer.parseInt(System.console().readLine());
		this.bal = 0;	// Initializing everytime to zero to avoid incorrect values for new customer request.
		return this;
	}
}