package first;
abstract class RBI{
	public abstract void SA();
	public abstract void HL();
	public static void repoRate() {
		System.out.println("repo Rate +-4%");
	}
} 
class SBI extends RBI{

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("sbi SA 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI hl 8%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("sbi SA 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI hl 9%");
	}
	
}
public class P017_Abstractin {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.HL();
		s.SA();
		SBI.repoRate();
		JAVA j = new JAVA();
		j.SA();
		j.HL();
		JAVA.repoRate();
	}
}
