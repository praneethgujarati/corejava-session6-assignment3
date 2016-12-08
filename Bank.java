/* Assignment 6.3 : Write an application to implement the basic functions 
   for the Online Banking Application (Use synchronized)
   
   Show deposit and withdraw functionality for the Online Banking Application (Using
   synchronized). Also compare your output without using synchronized.
*/

package asg6_3;

class Bank {
	public static void main(String[] args){
		Banking b = new Banking();	// Object b of class Banking. This class has basic deposit and withdrawal service.
		Thread t1 = new Thread(b);	// Thread 1 to show a customer 1 request.
		Thread t2 = new Thread(b);	// Thread 2 to show a customer 2 request.
		Thread t3 = new Thread(b);	// Thread 3 to show a customer 3 request.
		t1.setName("Customer 1");t2.setName("Customer 2");t3.setName("Customer 3");	// Set a name for each thread.
		t1.start(); t2.start();	t3.start();	// Start thread
	}
}