package reserveapp;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class buslist {
	
	private int busno;
	private String ac;
	private int capacity;
	private Date date;
	SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
	
	public buslist(int busno, String ac, int capacity,String date) throws ParseException
	{
		super();
		this.busno = busno;
		this.ac = ac;
		this.capacity = capacity;
		this.date=format.parse(date);
	}


	public int getBusno() {
		return busno;
	}


	public String isAc() {
		return ac;
	}


	public int getCapacity() {
		return capacity;
	}
	
	public Date getdate()
	{
		return date;
	}

	
	public void setcapacity(int a)
	{
		this.capacity=a;
	}

	@Override
	public String toString() {
		return "buslist [busno=" + busno + ", ac=" + ac + ", capacity=" + capacity + ", date=" + date + "]";
	}
	
	

	
	
	

}
