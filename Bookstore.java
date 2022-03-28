package xyz;
import java.util.Scanner;

public class Bookstore {
	String name;
	int price,qnty;
	void input()
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter book name,price and quantity");
		name=s.next();
		price=s.nextInt();
		qnty=s.nextInt();
	}
	void display()
	{
		System.out.println("book name is "+name);
		System.out.println("book nprice is "+price);
		System.out.println("book quantity is "+qnty);
		System.out.println("total price for "+qnty+" books = "+(qnty*price));
	}

	public static void main(String[] args) {
		Bookstore k=new Bookstore();
		k.input();
		k.display();
		// TODO Auto-generated method stub

	}

}
