package paquete;

public class Main {
	public static void main(String[]ar) {
		// Los arreglos sirven para guardar muchas variables en una
		
		int x[];
		x=new int[3];
		
		x[0]=10;
		x[1]=5;
		x[2]=7;
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println("Arreglo en índice: "+i+" Es igual a "+x[i]);
		}	
		
		
	}

}
