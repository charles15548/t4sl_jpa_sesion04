package app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo3 {

	//encontrar  y mostrar al usuario
	public static void main(String[] args) {
		//lamar a la conexion
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		//crear un manejador de las entidades
		EntityManager manager = fabrica.createEntityManager();
		//objeto a modificar
		Usuario u =new Usuario();
		
		
		
	
		
		
		//si queremos reqistrar, actualizar o eliminar ->transa...
		try {
		
			
			u= manager.find(Usuario.class, 1);
		if(u== null) {
			System.out.print("Usuario no existe");
		} else {
			System.out.println(u);
		}
			System.out.print(u);
		} catch (Exception e) {
			System.out.println("Error: " + e.getCause().getMessage());
		}
		manager.close();


	 }
	
	
}
