package La�oCondicionalJAVA;

import java.util.Scanner;

public class Exerc�cio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		Scanner leia=new Scanner(System.in);

        Float n1,n2,n3;

        System.out.println("\nEntre com o primeiro n�mero: ");
        n1 = leia.nextFloat();
        System.out.println("\nEntre com o segundo n�mero: ");
        n2 = leia.nextFloat();
        System.out.println("\nEntre com o terceiro n�mero: ");
        n3 = leia.nextFloat();

        if(n1<=n2 && n2<=n3)
        {
            System.out.println("\n " +n1+" � o menor valor informado " +n2+ " � o segundo menor valor informado e " +n3+ " � o maior valor informado. ");
        }
        else if(n1<=n3 && n3<=n2)
        {
            System.out.println("\n " +n1+" � o menor valor informado " +n3+ " � o segundo menor valor informado e " +n2+ " � o maior valor informado.");
        }
        else if(n3<=n1 && n1<=n2)
        {
            System.out.println("\n " +n3+" � o valor menor informado " +n1+ " � o segundo menor valor informado e " +n2+ " � o maior valor informado.");
        }
        else if(n3<=n2 && n2<=n1)
        {
            System.out.println("\n " +n3+" � o menor valor informado " +n2+ " � o segundo menor valor informado e " +n1+ " � o maior valor informado.");
        }
        else if(n2<=n3 && n3<=n1)
        {
            System.out.println("\n " +n2+" � o menor valor informado " +n3+ " � o segundo menor valor informado e " +n1+ " � o maior valor informado. ");
        }
        else if(n2<=n1 && n1<=n3)
        {
            System.out.println("\n " +n2+" � o menor valor informado " +n1+ " � o segundo menor valor informado e " +n1+ " � o maior valor informado. ");
        }



    }

}