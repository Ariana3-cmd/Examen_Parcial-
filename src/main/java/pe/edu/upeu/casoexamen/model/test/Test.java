/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.casoexamen.model.test;

/**
 *
 * @author TOSHIBA
 */
public class Test {
     static Gson gson = new Gson();
    static usuarioDao u = new UsuarioDaoImpl();
    
    
    public static void main(String[] args) {
        if(Conexion.getConexion()!=null) {
			System.out.println("conectado");
		}else {
			System.out.println("Error");
		}
        
        System.out.println(gson.toJson(u.readAll()));
    }
}
