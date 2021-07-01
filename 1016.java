import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	int x1=input.nextInt();

	input.close();
	int usagi=calculo.tempo(x1);
	calculo.Saida(usagi);
	}

}
class Calculo{
	public int tempo(int a){
		return a*2;
	}

	public void Saida(int a){
		System.out.printf("%d minutos%n",a);

	}
}	




