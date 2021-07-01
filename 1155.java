import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	
	// inicia classes
	Rabbit shika=new Rabbit();
	//processamento das funções	
	shika.yume_nikki();
	shika.saida();
	}
}

class Rabbit
{
	float usagi=1;
	//int nemui[]=new int [100];
	////String[]=new String[]	
	public void yume_nikki()
	{		
		for (float i=2;i<=100;i++)
		{
			float s=1/i;
			usagi=usagi+s;
			
		}
	}
	public void saida()
	{
		System.out.printf("%.2f\n",usagi);
	}   
}	
