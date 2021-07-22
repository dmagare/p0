import java.lang.*;
public class calculation{
	void fact(int n){
	int fact = 1;
	for(int i=1; i<n; i++){
	fact = fact*i;
       }
	System.out.println(n +" Factorial is "+ fact);
       }

public static void  main(String[] args){
calculation num= new calculation();
	num.fact(10);
	}
}
