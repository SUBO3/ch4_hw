package ch4_hw;

public class Sample4_7 {

	public static void main(String[] args) {
		
		Car24 car1; 
		car1 = new Car24();
		
		car1.setCar(1234, 20.5);
		
		System.out.println(car1);

	}

}


class Car24
{
	protected int num;
	protected double gas;
	
	public Car24()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+ num + "，將汽油量設為" + gas);
	}
	
	public String toString()
	{
		String str = "車號:" + num + "，汽油量:" + gas;
		return str;
	}
}
