package paquete;

public class Main {
	public static void main(String[]ar) {
		//se puede usar int y char
		
		char x;
		x='A';
		
		switch(x)
		{
		case 'a':
		{
			System.out.println("Esta es la opción 0");
			break;
		}	
		case 'b':
		{
			System.out.println("Esta es la opción 1");
			break;
		}	
		default:
		{
			System.out.println("Esta opción es la opción por defecto");
		}	
		
		}
	}

}
