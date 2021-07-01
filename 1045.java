import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	
	String usagi;
	double a=input.nextDouble();
	double b=input.nextDouble();
	double c=input.nextDouble();
	
	input.close();
	double max=0,mid=0,min=0;
	if (a>b && a>c)
	{
		max=a;
		if (b>c)
		{
				mid=b;
				min=c;
		}
		else 
		{
			min=b;
			mid=c;
		}
	}
	else if (b>a && b>c)
	{
		max=b;
		if (a>c)
		{
			mid=a;
			min=c;
		}
		else
		{
			mid=c;
			min=a;
		}
	}
	else if (c>a && c>b)
	{
			max=c;
			if (b>a)
			{
				mid=b;
				min=a;
			}
			else
			{
				mid=a;
				min=b;
			}
	}
	else if (a==b && b==c)
	{
		max=a;
		mid=b;
		min=c;
	}
	else if(a==b)
	{
		if (c>b){
			max=c;
			mid=b;
			min=a;
		}
		else
		{
			max=a;
			mid=b;
			min=c;
		}
	}
	else if(a==c)
	{
		if(b>a)
		{
			max=b;
			mid=c;
			min=a;
		}
		else
		{
			max=a;
			mid=c;
			min=b;
		}
	}
	else if(b==c)
	{
		if (a>c)
		{
			max=a;
			mid=b;
			min=c;
		}
		else
		{
				max=c;
				mid=b;
				min=a;
		}
	}
	//System.out.printf("%.1f %.1f %.1f",max,mid,min);
	calculo.Triangulo(max,mid,min);
	}
}
class Calculo{
	public boolean Triangulo(double a,double b,double c){
		if (a>=b+c){
			System.out.printf("NAO FORMA TRIANGULO%n");
			return false;
		}
		if (a*a==b*b+c*c){
			System.out.printf("TRIANGULO RETANGULO%n");
		}
		if (a*a>b*b+c*c){
			System.out.printf("TRIANGULO OBTUSANGULO%n");
		}
		if (a*a<b*b+c*c){
			System.out.printf("TRIANGULO ACUTANGULO%n");
		}
		if (a==b && b==c){
			System.out.printf("TRIANGULO EQUILATERO%n");
		}
		if ((a==b && c!=b) || (a==c && b!=c) || (b==c && a!=c)){
			System.out.printf("TRIANGULO ISOSCELES%n");
		}
		return true;
	}
	public void Saida(String r){
		System.out.printf("%s%n",r);
		
	}
}	
