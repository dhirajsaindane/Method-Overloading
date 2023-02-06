public class Main
{
    public void s1(int a, String b){
        System.out.println("Overloading Method");
    }
    
    public void s1(String a, int b){
        System.out.println("Method Overloading");
    }
	public static void main(String[] args) {
		
		Main m=new Main();
		m.s1(12,"dhiraj");
		m.s1("dhiraj",12);
	}
	
}
