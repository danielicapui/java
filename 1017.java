import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int tempo=input.nextInt();
	int vm=input.nextInt();
	input.close();
	double usagi=calculo.espaco(vm,tempo);
	calculo.Saida(usagi);
	}

}
class Calculo{
	public double espaco(int vm,int tempo){
		double consumo=12;
		double s=tempo*vm;
		double litros=gasto(s,consumo);
		return litros;
	}
	public double gasto(double s,double consumo){
		return s/consumo;
	}
	public void Saida(double a){
		System.out.printf("%.3f%n",a);

	}
}	




