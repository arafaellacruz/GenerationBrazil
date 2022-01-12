package LaçoCondicionalJAVA;

import java.util.Scanner;

public class Exercício2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		Scanner leia=new Scanner(System.in);

        Float n1,n2,n3;

        System.out.println("\nEntre com o primeiro número: ");
        n1 = leia.nextFloat();
        System.out.println("\nEntre com o segundo número: ");
        n2 = leia.nextFloat();
        System.out.println("\nEntre com o terceiro número: ");
        n3 = leia.nextFloat();

        if(n1<=n2 && n2<=n3)
        {
            System.out.println("\n " +n1+" é o menor valor informado " +n2+ " é o segundo menor valor informado e " +n3+ " é o maior valor informado. ");
        }
        else if(n1<=n3 && n3<=n2)
        {
            System.out.println("\n " +n1+" é o menor valor informado " +n3+ " é o segundo menor valor informado e " +n2+ " é o maior valor informado.");
        }
        else if(n3<=n1 && n1<=n2)
        {
            System.out.println("\n " +n3+" é o valor menor informado " +n1+ " é o segundo menor valor informado e " +n2+ " é o maior valor informado.");
        }
        else if(n3<=n2 && n2<=n1)
        {
            System.out.println("\n " +n3+" é o menor valor informado " +n2+ " é o segundo menor valor informado e " +n1+ " é o maior valor informado.");
        }
        else if(n2<=n3 && n3<=n1)
        {
            System.out.println("\n " +n2+" é o menor valor informado " +n3+ " é o segundo menor valor informado e " +n1+ " é o maior valor informado. ");
        }
        else if(n2<=n1 && n1<=n3)
        {
            System.out.println("\n " +n2+" é o menor valor informado " +n1+ " é o segundo menor valor informado e " +n1+ " é o maior valor informado. ");
        }



    }

}