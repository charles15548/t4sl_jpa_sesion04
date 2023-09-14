package app;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import model.Usuario;

public class Demo08 {

	//login
	public static void main(String[] args) {
		
		
		
		String usuario = JOptionPane.showInputDialog("Ingrese su Usuario");	
		String clave = JOptionPane.showInputDialog("Ingrese su Clave");

		
		//lamar a la conexion
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		EntityManager manager = fabrica.createEntityManager();
		
		//select from tb_xxxx where usr_usua = ? and cla_usua = ?
	
				String sql = "select u from Usuario u where u.usr_usua = :xusr and u.cla_usua =:xcla";
				
				
				try {
					Usuario u = manager.createQuery(sql, Usuario.class).setParameter("xusr", usuario)
							.setParameter("xcla", clave).getSingleResult();
					//recorrer y mostrar
					System.out.println("Código..:" + u.getCod_usua());
					System.out.println("Nombre..:" + u.getNom_usua() + "  " + u.getApe_usua());
					System.out.println("Tipo....:" + u.getIdtipo() + "  " + u.getObjTipo().getDescripcion());
					System.out.println("----------------------------------");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Usuario o clave incorrecto");
				}
				manager.close();
		
		
			 }
	
	
}
