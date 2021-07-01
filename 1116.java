import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	
	// inicia classes
	Rabbit shika=new Rabbit();
	Scanner input = new Scanner(System.in);
	
	//entrada
	shika.usagi=input.nextInt();
	for (int i=0;i<shika.usagi;i++)
		shika.inu=input.nextInt();
		shika.kuma=input.nextInt();
		shika.yume_nikki();
	//processamento das funções	
	input.close();
	}
}

class Rabbit
{
	
	int usagi=1;
	int inu=1;
	int kuma=1;
	public void yume_nikki()
	{
		if (kuma==0)
		{
			saida(666);
		}
		else
		{
			double t=inu/kuma;
			saida(t);
		}
	}
	public void saida(double neko)
	{
		if (neko==666 && kuma==0)
		{
			System.out.printf("divisao impossivel\n");
		}
		else
		{
			System.out.printf("%1f\n",neko);
		}
	}   
}	
