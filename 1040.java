import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	
		// inicia classes
		Rabbit shika=new Rabbit();
		// Scanner input = new Scanner(System.in);
		// entrada
		// for (int i=0;i<5;i++)
		// (
			// shika.usagi=input.nextInt();
		// )
		// input.close();
		//processamento das funções	
		shika.yume_nikki();
		shika.saida();
	}
}

class Rabbit
{
	float notas[]=new float [4];
	float n1=0;
	float n2=0;
	float n3=0;
	float n4=0;
	float nota_exame=0;
	float exame=0;
	//int nemui[]=new int [100];
	float media=0;
	int caso;
	String resposta="aprovado.";
	////String[]=new String[]	
	public void yume_nikki()
	{
		Scanner input = new Scanner(System.in);
			n1=input.nextFloat();
			n2=input.nextFloat();
			n3=input.nextFloat();
			n4=input.nextFloat();
			Media();
			analise();
			if (caso==2)
			{
				nota_exame=input.nextFloat();
				Exame();
			}
			input.close();
		
	}
	public void Exame()
	{
		exame=(nota_exame+media)/2;
		if (exame<=4.9)
		{
			resposta="reprovado.";
		}
		else
		{
			resposta="aprovado.";
		}
		
	}
	
	public void Media()
	{
		media=((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
	}
	
	public void analise()
	{
		if (media<5.0)
		{
			caso=1;
		}
		else if (media>=5.0 && media<=6.9)
		{
			caso=2;
		}
		else if (media>=7.0)
		{
			caso=3;
		}
	}
	public void saida()
	{
		if (caso==1)
		{
			System.out.printf("Media: %.1f\n",media);
			System.out.printf("Aluno reprovado.\n");
		}
		else if (caso==3)
		{
			System.out.printf("Media: %.1f\n",media);
			System.out.printf("Aluno aprovado.\n");
		}
		else if (caso==2)
		{
			System.out.printf("Media: %.1f\n",media);
			System.out.printf("Aluno em exame.\n");
			System.out.printf("Nota do exame: %.1f\n",nota_exame);
			System.out.printf("Aluno %s\n",resposta);
			System.out.printf("Media final: %.1f\n",exame);
		}
	} 
}	
