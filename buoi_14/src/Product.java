import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Product {

	private String id;
	private String name;
	private int price;
	private double discount;
	private int remainingDays;
	
	public Product(String id, String name, int price, double discount, int remainingDays) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.remainingDays = remainingDays;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price - this.price * this.discount;
	}
	
	public double getDiscount() {
		return this.discount;
	}
	
	public int getRemainingDays() {
		return this.remainingDays;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public void setRemainingDays(String strExpirationDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date expirationDate = sdf.parse(strExpirationDate);
			long expirationDateInMiliSeconds = expirationDate.getTime();
			this.remainingDays = (int)((expirationDateInMiliSeconds - System.currentTimeMillis()) / 86400000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String getInfo() {
		return String.format("Product [id=%s, name=%s, price=%d, discount=%f, remainingDays=%d]",
					 this.id, this.name, this.price, this.discount, this.remainingDays);
	}

}