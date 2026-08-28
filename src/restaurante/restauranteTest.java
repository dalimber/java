package restaurante;

public class restauranteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante rest1=new Restaurante();
		System.out.println("RESTAURANTE 1");
		System.out.println("Nombre:"+ rest1.nombre);
		System.out.println("Direccion:"+ rest1.direccion);
		System.out.println("Calificacion:"+rest1.calificacion);
		rest1.nombre="Papitas papadas";
		rest1.direccion="Charles Darwin";
		rest1.calificacion=4.5;
		System.out.println("RESTAURANTE 1");
		System.out.println("Nombre:"+ rest1.nombre);
		System.out.println("Direccion:"+ rest1.direccion);
		System.out.println("Calificacion:"+rest1.calificacion);
		
		Restaurante rest2=new Restaurante();
		System.out.println("RESTAURANTE 2");
		System.out.println("Nombre:"+ rest2.nombre);
		System.out.println("Direccion:"+ rest2.direccion);
		System.out.println("Calificacion:"+rest2.calificacion);
		rest2.nombre="Pollito 2P";
		rest2.direccion="Conocoto";
		rest2.calificacion=3.5;
		System.out.println("RESTAURANTE 2");
		System.out.println("Nombre:"+ rest2.nombre);
		System.out.println("Direccion:"+ rest2.direccion);
		System.out.println("Calificacion:"+rest2.calificacion);
	}

}
