package first;
class Data{
	int id;
	String name;
	String address;
	Data(){
		System.out.println("Data in Cons id : "+id+" name : "+name+" address : "+address);
	}
	Data(int id,String name,String address){
		this.id = id;
		this.name= name;
		this.address=address;
		System.out.println("Data in Cons id : "+id+" name : "+name+" address : "+address);
	}
	Data(int i){
		System.out.println("para i = "+i);
	}
	Data(int i,int j){
		System.out.println(" i ="+i+" j = "+j);
	}
	Data(String name){
		System.out.println("name "+name);
	}
	public void showData() {
		System.out.println("Data in ShowData fun id : "+id+" name : "+name+" address : "+address);
	}
	Data(Data u1){
		this.id = u1.id;
		this.name = u1.name;
		this.address =u1.address;
		System.out.println("Data in Cons id : "+id+" name : "+name+" address : "+address);
	}
}
class UserData{
	int id;
	String name;
	String address;
	UserData(int id,String name,String address){
		this.id = id;
		this.name= name;
		this.address=address;
		System.out.println("Data in Cons id : "+id+" name : "+name+" address : "+address);
	}
	public void showData() {
		System.out.println("Data in ShowData fun id : "+id+" name : "+name+" address : "+address);
	}
}
public class P010_Constructor {
	public static void main(String[] args) {
		System.out.println("main method");
//		Data d = new Data(1);
		Data u1 = new Data(1, "java", "ahmedabad");
		Data u2 = new Data(u1);
//		u1.showData();
	}
}
