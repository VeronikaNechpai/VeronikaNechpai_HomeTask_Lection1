package by.epam.lesson1.hometask1;

public class Task6_2 {
	
	public static void main(String[] args) {
		
		double x=0, y=0, z;
		x=10;
		y=20;
		
		double temp;
		temp=Math.cos(x)-x/3;
		if (temp !=0) {
				z=x*Math.log(x)+y/temp;
		}else {
				System.out.println("Знаменатель равен нулю.");
				z=Double.NaN;
		}
		
		System.out.println("z = "+z);
	}

}
