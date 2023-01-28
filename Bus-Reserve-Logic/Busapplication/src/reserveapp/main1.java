package reserveapp;
import java.text.ParseException;
import java.util.*;
public class main1 {

	public static void main(String[] args) throws ParseException ,ConcurrentModificationException {
		Scanner sc=new Scanner(System.in);
		
		List <buslist>buses=new ArrayList<buslist>();    
		buses.add(new buslist(1,"yes",2,"15-01-2022"));  
		buses.add(new buslist(2,"no",1,"15-01-2022"));      //ADDING BUSES IN LIST
		buses.add(new buslist(3,"yes",2,"16-01-2022"));
		buses.add(new buslist(4,"no",1,"16-01-2022"));
		
		List <bookers>bk=new ArrayList<bookers>();         
		
		List<bookingsdone> bookersdetail= new ArrayList<bookingsdone>();  
		
		int bookno=1;  
		
		System.out.println("WELCOME TO BUS RESERVATION FOR CHENNAI ");
		System.out.println("Enter 1 to book or 2 to exit or 3 TO ACCESS AS ADMIN");
		int decision=sc.nextInt();
		
		while(decision==1)
		{
			System.out.println("BOOKING......");
			
			System.out.println("ENTER YOU NAME");
			String name=sc.next();
			
			System.out.println("ENTER DATE OF TRAVEL IN DD-MM-YYYY FORMAT.");
			String date=sc.next();
			
			System.out.println("ENTER 1 FOR AC OR 2 FOR NON AC");
			int ac=sc.nextInt();
			  String status="no";
			  if(ac==1)
			  {
				status="yes";  
			  }
			  
			  System.out.println("ENTER NUMBER OF PASSENGER");
			  int cap=sc.nextInt();
			  
			bk.add(new bookers(name,status,date,cap));
			
			System.out.println("SELECT BUS FROM BELOW LIST AND ENTER BUS NUMBER  HAVE SELECTED");
			
			
				bookers x2=null; 
				if(bk.size()>1)
				{
					x2=bk.get(bk.size()-1);
				}
				else
				{
					x2=bk.get(0);
				}
				for(buslist b1:buses)
			   {
			     if(x2.isNeedac().equals(b1.isAc())==true && x2.getDate().compareTo(b1.getdate())==0)
				     {
				    
				        System.out.println(b1);
				     }
			    
		       }
			
			int bno=sc.nextInt();       //GETTING BUS NUMBER AS INPUT
			
			for(buslist b1:buses)
			 {
				if(b1.getBusno()==bno)
				{
				 if(b1.getBusno()==bno && x2.isNeedac().equals(b1.isAc())==true && x2.getcapacity()<=b1.getCapacity())
				  {
					System.out.println("BOOKING SUCCESSFULL");
					b1.setcapacity(b1.getCapacity()-x2.getcapacity()); 
					
					bookersdetail.add(new bookingsdone(bookno,x2,b1));
					bookno++;
				  }
				 else
				  {
					System.out.println("BOOKING NOT SUCCESSFULL");
				  }
				}
			 } 
		                           
			System.out.println("ENTER 1 FOR BOOKING AGAIN OR 2 FOR EXIT OR 3 FOR ADMIN ACCESS");
			decision=sc.nextInt();
			}    //WHILE LOOP ENDING CONTEXT
		                          
		if(decision==2)
		{
			System.out.println("BOOK TICKETS NEXT TIME THANK YOU HAVE NICE DAY");
		}
		else if(decision==3)
		{
			System.out.println("ENTER ADMIN CODE FOR KNOWING BOOKING DETAILS");
			int samplecode=sc.nextInt();
			if(samplecode==bookingsdone.getAdmincode())
			{
			for(bookingsdone b:bookersdetail)
			{
				System.out.println(b);
			}
			}
			else
			{
				System.out.println("WRONG ADMIN CODE ENTERED");
			}
		}
		sc.close();
	}

}
