/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.casoexamen.model01;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 *
 * @author TOSHIBA
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    private int idusuario;
    private String username;
    private String password;
    private int idpersona;
    private int idrol;
    private String fechacreacion;
    private boolean estado;
}
