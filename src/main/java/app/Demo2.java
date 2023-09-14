package app;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo2 {

	//actualizar los datos de un usuario
	public static void main(String[] args) {
		//lamar a la conexion
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		//crear un manejador de las entidades
		EntityManager manager = fabrica.createEntityManager();
		//objeto a modificar
		Usuario u =new Usuario();
		u.setCod_usua(3);
		u.setNom_usua("Zoila");
		u.setApe_usua("toro");
		u.setUsr_usua("ztore@mail.com");
		u.setCla_usua("54541");
		u.setFna_usua("2004/01/12");
		u.setIdtipo(3);
		u.setEst_usua(2);
		
		
		//si queremos reqistrar, actualizar o eliminar
		try {
			manager.getTransaction().begin();
			
			manager.merge(u);
			manager.getTransaction().commit();
			System.out.print("Actualización ok");
		} catch (Exception e) {
			System.out.println("Error: " + e.getCause().getMessage());
		}
		manager.close();
		
	 }
	
	
}
