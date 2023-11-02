package first;

class Addition {
	public void add(int i,int j) {
		System.out.println(i+j);
	}

	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}

	public void add(int i,int j,int k,int l) {
		System.out.println(i+j+k+l);
	}
}

public class P015_Overloading {
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(1, 20, 50);
	}
}
