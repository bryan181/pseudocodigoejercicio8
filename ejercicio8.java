import java.util.*;

public class ejercicio8{
	public static void main(String[] args){

		int num;
		String opcSalir="a";
		Scanner scanner=new Scanner(System.in);

		while(!opcSalir.equals("s")){
			num=5*(int)(Math.random()*1000);
			System.out.println("Numero multiplo de 5: "+num);
			System.out.println("Para cancelar el programa presione: s");
			opcSalir=scanner.nextLine();
		}
	}
}