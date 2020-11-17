package desafio;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double area, base, altura,area2, base2, altura2;
		
		System.out.println("Entre com a base:");
		base= leia.nextDouble();
		while (base<=0)
		{
			System.out.println("ERROR!Entre com um numero maior que 0 para a base:");
			base= leia.nextDouble();
		}
		
		System.out.println("Entre com a altura:");
		altura= leia.nextDouble();
		while (altura<=0)
		{
			System.out.println("ERROR!Entre com um numero maior que 0 para a altura:");
			altura= leia.nextDouble();
		}
		
		System.out.println("Entre com a segunda base:");
		base2= leia.nextDouble();
		while (base2<=0)
		{
			System.out.println("ERROR!Entre com um numero maior que 0 para a segunda base:");
			base2= leia.nextDouble();
		}
		
		System.out.println("Entre com a segunda altura:");
		altura2= leia.nextDouble();
		while (altura2<=0)
		{
			System.out.println("ERROR!Entre com um numero maior que 0 para a segunda altura:");
			altura2= leia.nextDouble();
		}
		
		area=((base*altura)/2);
		
		area2=((base2*altura2)/2);
		
		if (area>area2)
		{
			System.out.println("A maior area é do primeiro triangulo: "+ area + ". A area do segundo triangulo é = "+ area2);
		}
		else if (area2>area)
		{
			System.out.println("A maior area é do segundo triangulo: "+ area2 + ". A area do primeiro triangulo é = "+ area);
		}
		else
		{
			System.out.println("Os dois triangulos tem valores de area igual. O primeiro triangulo: "+ area + ". A area do segungo triangulo é = "+ area2);
		}

	}

}
