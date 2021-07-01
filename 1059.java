import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
	
	// inicia classes
	Rabbit shika=new Rabbit();	
	//processamento das funções
	shika.saida();	
	}
}


class Rabbit
{	
	public void saida()
	{  
		for (int i=2;i<101;i=i+2){
			System.out.printf("%d\n",i);
		}
	}
}