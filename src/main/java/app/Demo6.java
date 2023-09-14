package app;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Productos;

public class Demo6 {

	//encontrar  y mostrar al usuario
	public static void main(String[] args) {
		//lamar a la conexion
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
	
		EntityManager manager = fabrica.createEntityManager();
		
		//select from tb_xxxx
	
				String sql = "select u from Productos u";
				List<Productos> lstProductos = manager.createQuery(sql, Productos.class).getResultList();
				//recorrer y mostrar
				
				for(Productos u : lstProductos) {
					System.out.println("Código..:" + u.getId_prod());
					System.out.println("Descripción..:" + u.getDes_prod() );
					System.out.println("Stok..:" + u.getStk_prod()) ;
					System.out.println("Precio.......:" + u.getPre_prod());
					System.out.println("Categpria....:" + u.getIdcategoria());
					System.out.println("Estado.......:" +  u.getEst_prod());
					System.out.println("Id Proveedor..:" + u.getIdproveedor());
					
				}
				
				
				
				manager.close();
		
		
			 }
	
	
}
