package reserveapp;

public class bookingsdone {

	private int bookno;
	private bookers passenger;
	private buslist bookedbus;
	private static int admincode=455457;
	public bookingsdone(int bookno, bookers passenger, buslist bookedbus) {
		super();
		this.bookno = bookno;
		this.passenger = passenger;
		this.bookedbus = bookedbus;
	}
	@Override
	public String toString() {
		return "bookingsdone [bookno=" + bookno + ", passenger=" + passenger + ", bookedbus=" + bookedbus + "]";
	}
	public static int getAdmincode() {
		return admincode;
	}
	
}
