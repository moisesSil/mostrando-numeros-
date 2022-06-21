package primos;
import java.util.ArrayList;
import java.util.Scanner;
public class primos {
	private static ArrayList <Integer>arrayList;

	public static void main(String[] args) {
		System.out.println("Hello World");
		arrayList = new ArrayList<>();
		Scanner tecla = new Scanner(System.in);
		int Iinicial;
		int Ifinal;
		int i;
		int j;
		boolean primo;
		System.out.println("Digite o Primeiro Numero");
		Iinicial = tecla.nextInt();
		System.out.println("Digite o Último Numero");
		Ifinal = tecla.nextInt();
		
		for(i = Iinicial; i<=Ifinal;i++) {
			primo = true ;
			if(primo) {
				if((i%2==0) && (i!=2)) {
					primo = false ;
				}
			}
			if(primo) {
				for(j =3; j<= (i/2);j++) {
					if(i%j==0) {
						primo = false;
						break;
					}
				}
				
			}
			if(primo)
				arrayList.add(i);
		}
		System.out.println(arrayList.toString());
		System.out.println(String.format("Há %d números primos entre %d e %d",arrayList.size(),Iinicial,Ifinal));
		
		if(Iinicial > Ifinal){
            System.out.println("Impossivel fazer essa operação!");
            System.out.println("O primeiro número deve ser maior que o Segundo!");
        }
	}

}
