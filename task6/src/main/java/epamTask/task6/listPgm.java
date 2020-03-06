package epamTask.task6;
import java.util.*;
public class listPgm 
{
	static List<Integer> ar=new ArrayList<Integer>();
	public static void main(String args[]) throws IndexOutOfBoundsException
	{
		int ch=0,ele=0;
		Scanner s=new Scanner(System.in);
		for (int i=1;i<=10;i++)
			ar.add(i);
		while(true)
		{
			System.out.println("1.Fetch 2.Add 3.Remove 4.Display 5.exit");
			System.out.println("Enter Choice:");
			ch=s.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter index of element to be fetched:");
						ele=s.nextInt();
						if(ele<0 || ele>ar.size())
							System.out.println("Index Limit Exceeded!");
						else
							System.out.println(fetch(ele));
						break;
				case 2: System.out.println("Enter element to be added into list:");
						ele=s.nextInt();
						addEle(ele);
						break;
				case 3: System.out.println("Enter index of element to be removed:");
						ele=s.nextInt();
						if(ele<0 || ele>ar.size())
							System.out.println("Index limit exceeded! Try Again");
						else
							System.out.println(removeEle(ele)+" is removed ");
						break;
				case 4: display();
						break;
				case 5: System.exit(0);
						break;
				default:System.out.println("Invalid Input..Please Try again");
			}
		}
	}
	static int fetch(int element)
	{
		return ar.get(element);
	}
	static void addEle(int element)
	{
		ar.add(element);
		return;
	}
	static int removeEle(int element)
	{
		return ar.remove(element);
	}
	static void display()
	{
		System.out.println(ar);
		return;
	}

}
