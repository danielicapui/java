import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	double numero1= input.nextDouble();
	double numero2=input.nextDouble();
	input.close();
	double med=calculo.media(numero1,numero2);
	calculo.Saida(med);
	}

}
class Calculo{
	public double media(double n1,double n2){
		return ((n1*3.5+n2*7.5)/11);
	}
	public void Saida(double r){
		System.out.printf("MEDIA = %.5f%n",r);
	}
}	




