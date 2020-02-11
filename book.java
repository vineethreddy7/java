package javatest;
import java.util.*;

public class book {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter number of books");
		int n=sc.nextInt();
		String titles[]=new String[n];
		int copies[]=new int[n];
		System.out.println("Enter book titles and number of copies");
		for(i=0;i<n;i++)
		{
			titles[i]=sc.next();
			copies[i]=sc.nextInt();
		}
		int ch;
		do
		{
		System.out.println("0.Exit\n1.Borrow the book\n2.Return the book\nEnter choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 0:System.out.println("Exiting the system");break;
		case 1:System.out.println("You are borrowing "+findbook(titles,copies,1));break;
		case 2:System.out.println("The book "+findbook(titles,copies,2)+" is returned");break;
		default:System.out.println("Wrong choice..Try again");
				
		}
		}while(ch!=0);
		
		System.out.println("Books with number of copies less than five are "+lesscopies(copies));
		System.out.println("Books with no copies are ");
		nocopies(titles,copies);
	}
	static String findbook(String a[],int c[],int task)
	{
		for(int i=0;i<a.length;i++)
		{
			if(c[i]>0)
			{
			System.out.println(a[i]);
			}
		}
		System.out.println("Enter title of the book");
		Scanner sc=new Scanner(System.in);
		String search=sc.next();
		for(int i=0;i<a.length;i++)
		{
			if(search.equals(a[i]))
			{
				System.out.println("book exists");
				if(task==1)
				{
				c[i]--;
				}
				else if(task==2)
				{
					c[i]++;
				}
				System.out.println("The books available after the transaction are "+c[i]);
			}
		}
		return search;
	}
	static int lesscopies(int c[])
	{
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]<5)
			{
				count++;
			}
		}
		return count;
	}
	static String nocopies(String s[],int c[])
	{
		for(int i=0;i<s.length;i++)
		{
			if(c[i]==0)
			{
				System.out.print(" "+s[i]);
			}
			else
			{
				System.out.println(" none");
				break;
			}
		}
		return "";
	}

}
