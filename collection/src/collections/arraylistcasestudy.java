package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylistcasestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Eclise");
		list.add("ms");
//		Iterator itr=list.iterator();
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("details of applications");
		do {

	        System.out.println("1.Display installed applictaion:\n2.Install application\n3.Uninstall application\n4.Update\n5.Quite:");
	        System.out.println("Please Enter your choice:");
	        c=s.nextInt();
	         
	        switch(c) {
	        case 1:
	        if(list.isEmpty()) {
	        	System.out.println("No apps are installed.....");
	        }
	        else {
        	Iterator itr=list.iterator();  
	        	while(itr.hasNext()){  
	        	System.out.println(itr.next());  
	        	}
	        }  
	        break;
	        case 2:
	         System.out.println("Enter application name:");
	         String app=s.next();
	         list.add(app);
	         System.out.println("App installed successfully.");
	        break;
	        case 3:
	        	System.out.println("Enter application to uninstall from exixting list");
	        	String rem=s.next();
	        	list.remove(rem);
	        	break;
	        case 4:
	        	Iterator itr=list.iterator();  
//	        	int length=ArrayList.Size();
	        	int i=0;
	        	for(i=0;itr.hasNext();i++) {
	        		System.out.println(itr.next()+" "+i);
	        	}
	        		System.out.println("Enter the index of application updated to:");
	        		int j=s.nextInt();
	        		System.out.println("Enter the  application You need to update:");
	        		String up=s.next();
	        		list.set(j,up);
	        		System.out.println(itr.next());  
	        	
	        case 5:
	        	return ;
	        }
		}while(c!=0);

	}
		
}
