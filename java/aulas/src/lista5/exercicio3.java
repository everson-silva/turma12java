package lista5;

public class exercicio3 {

	public static void main(String[] args) {
		int num,cont1=0,cont2=0,cont3=0,cont4=0;
		do
		{
			num = ((int) ((Math.random() * (101)) - 2));
			if (num>=0 && num<=25)
			{
				cont1++;
			}
			else if (num>25 && num<=50)
			{
				cont2++;
			}
			else if (num>50 && num<=75)
			{
				cont3++;
			}
			else if (num>75 && num<=100)
			{
				cont4++;
			}
		} while(num>=0);
		System.out.print( "Estão nos seguintes intervalos: \n[0-25]: "+ cont1+" numeros. \n[26-50]: "+cont2+" numeros. \n[51-75]: "+cont3+" numeros. \n[76-100]: "+cont4+" numeros.");

	}

}
