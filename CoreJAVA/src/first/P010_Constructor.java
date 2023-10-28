package first;
class Data{
	Data(){
		System.out.println("hello default cons");
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
		Data d = new Data(1);
		UserData u1 = new UserData(1, "java", "ahmedabad");
		u1.showData();
	}
}
