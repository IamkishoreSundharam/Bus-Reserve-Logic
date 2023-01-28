package reserveapp;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class bookers {
    private int capacity;
	private String name;
	private String needac;
	private Date date; 
	private SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
	
	public bookers(String name, String needac,String date1,int capacity) throws ParseException  {
		super();
		this.name = name;
		this.needac = needac;
		this.date=format.parse(date1);
		this.capacity=capacity;
	}
	
	
	public String getName() {
		return name;
	}
	public String isNeedac() {
		return needac;
	}
	public Date getDate() {
		return date;
	}
    
	public int getcapacity()
	{
		return capacity;
	}

	@Override
	public String toString() {
		return "bookers [name=" + name + ", needac=" + needac + ", date=" + date + "]";
	}
	
	
	
	
	
}
