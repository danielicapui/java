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
	shika.inu=input.nextInt();
	input.close();
	//processamento das funções	
	shika.yume_nikki();
	shika.saida();
	}
}

class Rabbit
{
	int usagi=1;
	int inu=1;
	int kuma=1;
	int ookami=1;
	public void yume_nikki()
	{
		int s=0;
		for (int r=0;r<Math.abs(inu);r++)
		{
			if (((usagi-r)%inu)==0)
			{
				ookami=(int)((usagi-r)/inu);
				s=r;
				break;
			}
			s=r;
		}
		kuma=s;
	}
	public void saida()
	{
		System.out.printf("%d %d\n",ookami,kuma);
	}   
}	
