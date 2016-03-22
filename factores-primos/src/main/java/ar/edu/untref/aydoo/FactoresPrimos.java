import java.io.*;

public class FactoresPrimos {
int numero;

public FactoresPrimos(int numeroPrueba){
	numero = numeroPrueba;
}

public void factores(int numeroA){
	for (int i=2;i<numeroA; i++){
		while(numero%i==0){
			numero=numero/i;
			System.out.println(i+" ");

			if(numero==1){
			System.exit(0);
			}
		}
	}
}

public static void main(String[]args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Ingrese el numero a factorear: ");
        int num=Integer.parseInt(br.readLine());
        FactoresPrimos Factor1=new FactoresPrimos(num);
        System.out.println("Los factores primos son:");
        Factor1.factores(num);
		}
}

