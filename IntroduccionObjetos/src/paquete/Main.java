package paquete;
import paquete.Pelota;
class Main {
	public static void main(String[]ar) {
		
		Pelota p;
		p= new Pelota();
		p.patearPelota();
		
		System.out.println("La pelota pesa:"+p.obtenerPeso());
		
	}

}
