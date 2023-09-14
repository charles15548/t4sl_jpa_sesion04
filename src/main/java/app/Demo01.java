package app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {

	//registro new usuario usando valores fijos
	public static void main(String[] args) {
		//lamar a la conexion
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		//crear un manejador de las entidades
		EntityManager manager = fabrica.createEntityManager();
		
		Usuario u =new Usuario();
		u.setCod_usua(10041);
		u.setNom_usua("Jugan");
		u.setApe_usua("logl");
		u.setUsr_usua("jlol");
		u.setCla_usua("10040001");
		u.setFna_usua("2000/11/11");
		u.setIdtipo(3);
		u.setEst_usua(1);
		
		
		//si queremos reqistrar, actualizar o eliminar
		manager.getTransaction().begin();
		
		manager.persist(u);
		manager.getTransaction().commit();
		System.out.print("registro ok");
		manager.close();
	}
	
	
}
