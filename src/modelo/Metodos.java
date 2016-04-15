/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author roy
 */
public class Metodos {
    
    ArrayList<Usuario>arrayUsuario;
    String[] datos;
    
    public Metodos()
    {
        arrayUsuario=new ArrayList<Usuario>();
        datos=new String[5];
    }
    
    //metodo que agregar elementos al array
    public void agregar(String[]informacion)
    {
        Usuario temporal=new Usuario(informacion[0],informacion[1],informacion[2],informacion[3]);
        arrayUsuario.add(temporal);
        System.out.println("Usuario agregado");
    }
    
    
    //metodo que busca elemento del array
    public boolean buscar(String numeroPrestamo)
    {
        boolean existe=false;
        for(int i=0;i<arrayUsuario.size();i++)
        {
            if(arrayUsuario.get(i).getNumeroPrestamo().equals(numeroPrestamo))
            {
                datos[0]=arrayUsuario.get(i).getNumeroPrestamo();
                datos[1]=arrayUsuario.get(i).getNombreUsuario();
                datos[2]=arrayUsuario.get(i).getCedulaUsuario();
                datos[3]=arrayUsuario.get(i).getCodigoLibro();
                existe=true;
            }
          
        }
        
          return existe;
    }
    
    
    //metodo que modifica elemento del array
    public void modificar(String[] arreglo)
    {
        for(int i=0;i<arrayUsuario.size();i++)
        {
            if(arrayUsuario.get(i).getNumeroPrestamo().equals(arreglo[0]))
            {
                arrayUsuario.get(i).setNumeroPrestamo(arreglo[0]);
                arrayUsuario.get(i).setNombreUsuario(arreglo[1]);
                arrayUsuario.get(i).setCedulaUsuario(arreglo[2]);
                arrayUsuario.get(i).setCodigoLibro(arreglo[2]);
            }
        }
         System.out.print("Usuario modficado");
    }
    
    //Metodo que elimina elemento del array
    public void eliminar(String[] arreglo)
    {
        for(int i=0;i<arrayUsuario.size();i++)
        {
            if(arrayUsuario.get(i).getNumeroPrestamo().equals(arreglo[0]))
            {
                arrayUsuario.remove(i);
            }
        }
        System.out.print("Usuario eliminado");
    } 
    
            
            
         /*Metodo que genera el numero de Prestamo*/  
            
          public String devolverCodigo()
    {
        String codigo= "0000";
        
        
        if(arrayUsuario.size()==0)
        {
            codigo+=1;
            
        }else
        {
            int numero=Integer.parseInt(arrayUsuario.get(arrayUsuario.size()-1).getNumeroPrestamo());
            numero++;
            codigo="0000"+numero;
        }
        codigo=codigo.substring(codigo.length()-5, codigo.length());
        return codigo;
    }
          
          /*Metodo que devuelve el arreglo datos*/
          public String[] devolverDatos()
          {
              return datos;
          }
    
}
 




