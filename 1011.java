import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	
	double n3,pi=3.14159,s=4/3.0;
	double raio=input.nextDouble();
	input.close();
	
	double volume=calculo.total(raio,pi,s);
	calculo.Saida(volume);
	}

}
class Calculo{
	public double total(double r, double pi,double s){
		return (s*pi*Math.pow(r,3));
	}
	public void Saida(double r){
		System.out.printf("VOLUME = %.3f\n",r);
	}
}	




