package restaurante;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plato platoA=new Plato();
		System.out.println("PLATO 1");
		System.out.println("Nombre: "+ platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.Precio);
		System.out.println("Disponible: "+platoA.disponible);
		platoA.nombre="Encebollado";
		platoA.tipo="Sopa";
		platoA.Precio=3.5;
		platoA.disponible=true;
		System.out.println("PLATO 1");
		System.out.println("Nombre: "+ platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.Precio);
		System.out.println("Disponible: "+platoA.disponible);
		
		Plato platoB=new Plato();
		System.out.println("PLATO 2");
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo: "+platoB.tipo);
		System.out.println("Precio: "+platoB.Precio);
		System.out.println("Disponible: "+platoB.disponible);
		platoB.nombre="Fritada";
		platoB.tipo="Tradicional";
		platoB.Precio=4.00;
		platoB.disponible=false;
		System.out.println("PLATO 2");
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo: "+platoB.tipo);
		System.out.println("Precio: "+platoB.Precio);
		System.out.println("Disponible: "+platoB.disponible);
		
		Plato platoC=new Plato();
		System.out.println("PLATO 3");
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+platoC.tipo);
		System.out.println("Precio: "+platoC.Precio);
		System.out.println("Disponible: "+platoC.disponible);
		platoC.nombre="Flan";
		platoC.tipo="Postre";
		platoC.Precio=1.00;
		platoC.disponible=true;
		System.out.println("PLATO 3");
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+platoC.tipo);
		System.out.println("Precio: "+platoC.Precio);
		System.out.println("Disponible: "+platoC.disponible);

	}

}
