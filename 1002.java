import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	double numero1= input.nextDouble();
	input.close();
	double area=calculo.circulo(numero1);
	calculo.Saida(area);
	}

}
class Calculo{
	public double circulo(double raio){
		return (raio*raio*3.14159);
	}
	public void Saida(double r){
		System.out.printf("A=%.4f%n",r);
	}
}	




