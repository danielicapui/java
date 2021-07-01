import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	
	double pi=3.14159;
	double a=input.nextDouble();
	double b=input.nextDouble();
	double c=input.nextDouble();
	input.close();
	
	double n1=calculo.triangulo(a,c);
	double n2=calculo.circulo(c,pi);
	double n3=calculo.trapezio(a,b,c);
	double n4=calculo.quadrado(b);
	double n5=calculo.retangulo(a,b);
	
	calculo.Saida(n1,n2,n3,n4,n5);
	}

}
class Calculo{
	public double triangulo(double a,double c){
		return (a*c/2);
	}
	public double circulo(double c,double pi){
		return (c*c*pi);
	}
	public double trapezio(double a,double b,double c){
		return (((a+b)*c)/2);
	}
	public double quadrado(double b){
		return (b*b);
	}
	public double retangulo(double a,double b){
		return (a*b);
	}
	public void Saida(double a,double b,double c,double d,double e){
		System.out.printf("TRIANGULO: %.3f\n",a);
		System.out.printf("CIRCULO: %.3f\n",b);
		System.out.printf("TRAPEZIO: %.3f\n",c);
		System.out.printf("QUADRADO: %.3f\n",d);
		System.out.printf("RETANGULO: %.3f\n",e);

	}
}	




