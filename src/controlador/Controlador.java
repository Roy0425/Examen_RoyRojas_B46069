/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Metodos;
import vista.FRM_Principal;


/**
 *
 * @author roy
 */
public class Controlador implements ActionListener {
    
    FRM_Principal principal;
    Metodos metodos;
    
    public Controlador(FRM_Principal principal)
    {
        this.principal=principal;
        metodos=new Metodos();
      principal.llenarCodigo();
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregar(principal.cargarDatos());
            principal.limpiar();
            principal.inicio();
            principal.llenarCodigo();
        }
        if(e.getActionCommand().equals("Buscar"))
        {
          if(metodos.buscar(principal.devolverNumeroPrestamo()))
        {
            principal.mostrarInfo(metodos.devolverDatos());
            principal.existe();
        }else
        {
            principal.noExiste();
        }
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificar(principal.cargarDatos());
            principal.inicio();
            principal.limpiar();
           
        }
        
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminar(principal.cargarDatos());
            principal.limpiar();
            principal.inicio();
           
        }
        
    }
    
    
    
}
