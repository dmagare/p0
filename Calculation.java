//This is only a simple program, with more enhencements coming.
//This program only calls one method to calculate a factorial.
public class Calculation{
	void fact(int n){
	int fact = 1;
	for(int i=1; i<n; i++){
	fact = fact*i;
       }
	System.out.println(n +" Factorial is "+ fact);
       }

public static void  main(String[] args){
Calculation num= new Calculation();
	num.fact(20);
	}
}
