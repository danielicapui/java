import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
	
	// inicia classes
	Rabbit shika=new Rabbit();
	Calculo usagi=new Calculo();
	Scanner input = new Scanner(System.in);
	
	//entrada
	shika.salario=input.nextDouble();
	input.close();
	
	//processamento das funções
	usagi.processamento(shika);	

	}
}

class Rabbit{
	double salario;
	double reajuste;
	double ganho;
	int percentual;
	
	public double Reajuste(double salario)
	{  
        if (salario>=0 && salario<=400.00){
            percentual=15;
        }
        else if (salario>=400.01 && salario<=800.00){
            percentual=12;
        }
        else if (salario>=800.01 && salario<=1200.00){
            percentual=10;
        }
        else if (salario>=1200.01 && salario<=2000.00){
            percentual=7;
        }
        else if (salario>2000.00){
            percentual=4;
        }
        return percentual;
	}
	public double Total(double salario, double percentual)
	{
        ganho=salario*(percentual/100);
        reajuste=(salario)+ganho;
        return reajuste;
	}
}

class Calculo{
	public void processamento(Rabbit shika)
	{
		shika.Reajuste(shika.salario);
		shika.Total(shika.salario,shika.percentual);
		Saida(shika);
	}
	public void Saida(Rabbit shika){
		System.out.printf("Novo salario: %.2f\n",shika.reajuste);
		System.out.printf("Reajuste ganho: %.2f\n",shika.ganho);
		System.out.printf("Em percentual: %d %%\n",shika.percentual);
	}   
}	

