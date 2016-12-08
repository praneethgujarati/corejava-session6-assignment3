package asg6_3;

public class Banking extends Customer implements Runnable {	// Interface Runnable used.

	Customer c;	// Object c of class Customer.
	char type;	// Variable to store type of transaction like (d)eposit or (w)ithdraw
	double amt;	// Variable to store amount to be deposited or withdrawn

	public void run(){		// Every Runnable interface has a run method.
		synchronized(this){	// Synchronized used otherwise each thread requests will come out of sequence.
 			this.c = setCredentials();
			printInfo();
			setTran();
			setTran();
		}
	}

	public void transaction(){
		switch (this.type){
			case 'd' :
				c.bal = deposit(this.amt);
				break;
			case 'w' :
				c.bal = withdraw(this.amt);
				break;
			default :
				System.out.println("Invalid Type!");
		}		
	System.out.println("Current balance is : " + c.bal);
	}

	public void setTran(){
		System.out.print("Enter your transaction type (d=deposit) or (w=withdrawal): ");
		this.type = System.console().readLine().charAt(0);
		setAmount();

	}

	public void setAmount(){
		System.out.print("Enter your amount: ");
		this.amt = Double.parseDouble(System.console().readLine());
		transaction();

	}

	public double deposit(double amt){
		c.bal = c.bal + amt;
		return c.bal;
	}

	public double withdraw(double amt){
		c.bal = c.bal - amt;
		return c.bal;	
	}
}