/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.casoexamen.dao;

import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public class usuarioDao {
    int create(Usuario u);
    int update(Usuario u);
    int delete(int idusuario);
    Usuario read(int idusuario);
    List<Usuario> readAll();
}
