package first;
class Mobile{
	private int ram;
	private int storage;
	private String model;
	private double price;
	public Mobile() {
		
	}
	public Mobile(int ram,int storage,String model,double price) {
		this.ram =ram;
		this.storage = storage;
		this.model=model;
		this.price = price;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setStorage(int storage) {
		this.storage=storage;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setPrice(double price) {
		this.price= price;
	}
	public int getRam() {
		return ram;
	}
	public int getStorage() {
		return storage;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "ram : "+ram+" storage : "+storage+" model : "+model+" price : "+price;
	}
}
public class P018_Encapsulation {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.setRam(8);
//		m1.ram = 10;
		m1.setStorage(265);
		m1.setModel("Samsung");
		m1.setPrice(30000.00);
		System.out.println(m1.getRam());
		System.out.println(m1.getStorage());
		System.out.println(m1.getModel());
		System.out.println(m1.getPrice());
		Mobile m2 = new Mobile(10, 128, "OnePlus", 25000.00);
		System.out.println(m2);
	}
}
