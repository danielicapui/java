import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Calculo calculo=new Calculo();
	Scanner input = new Scanner(System.in);
	String usagi;
	double x=input.nextDouble();
	double y=input.nextDouble();
	input.close();
	usagi=calculo.Quadrante(x,y);
	calculo.Saida(usagi);
	}

}
class Calculo{
	public String Quadrante(double x,double y){
		String rabbit="oi";
		if (x>0 && y>0){
			rabbit="Q1";
		}
		else if (x<0 && y>0){
			rabbit="Q2";
		}
		else if (x<0 && y<0){
			rabbit="Q3";
		}
		else if (x>0 && y<0){
			rabbit="Q4";
		}
		else if (x==0 && y==0){
			rabbit="Origem";
		}
		else if (x==0 && y!=0){
			rabbit="Eixo Y";
		}
		else if (x!=0 && y==0){
			rabbit="Eixo X";
		}
		return rabbit;
	}
	public void Saida(String r){
		System.out.printf("%s%n",r);
		
	}
}	
