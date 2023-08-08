import java.util.Scanner;
public class Bankingapplicationdesignprogram {
	String Name, Address;
	String Acc_no,Account_type;
	long Phone_no;
	long balance;
	long view_acc_balance;
	long with_draw_amount;
	String With_drawal_mode;
	Scanner S= new Scanner(System.in);
	
	
	//for opening acc
	public void open_account() {
		System.out.println("Enter acc_no");
		Acc_no = S.next();
		System.out.println("Account_type");
		Account_type= S.next();
		System.out.println("Enter name");
		Name=S.next();
		System.out.println("Enter phone no");
		Phone_no=S.nextLong();
		System.out.println("Address");
		Address=S.next();
		
		
	}
	//Show acount
	public void show_acc() {
		System.out.println("account no is: " +Acc_no);
		System.out.println("Account type is: " +Account_type);
		System.out.println("name: " +Name);
		System.out.println("phone no is: " +Phone_no);
		System.out.println("Adress: " +Address);
		
		
	}
	//for savings account
	public void savings_acc()
	{
	System.out.println("view acc balance");
	view_acc_balance=S.nextLong();
	System.out.println("account balance is:" +view_acc_balance);
	
	System.out.println(" withdraw amount:");
	with_draw_amount=S.nextLong();
	System.out.println("withdrawal amount is:" +with_draw_amount);
	
	
    if(view_acc_balance > with_draw_amount)
    {view_acc_balance=view_acc_balance-with_draw_amount;
    
    System.out.println("balance after withdrawal is"+view_acc_balance);
    }
    else
    {
    	System.out.println("Insufficient balance");
    }
    
    }
	
	

	public static void main(String[] args) {
		
		Bankingapplicationdesignprogram B = new Bankingapplicationdesignprogram();
		B.open_account();
		B.show_acc();
		B.savings_acc();
		
	}

}
