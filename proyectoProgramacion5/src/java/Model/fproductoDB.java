/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Franklin Fernandez
 */
public class fproductoDB {
    
    
    
    public LinkedList<fproducto> moTodo() throws SNMPExceptions, SQLException{
        String select= "";
        LinkedList<fproducto> listaproductos= new LinkedList<fproducto>();
        
        try{
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos= new AccesoDatos();
            
            //Se crea la sentencia de Busqueda
            select=
                    "SELECT Num_Candidato,COUNT(Con_Voto) as Cantidad FROM VOTO_CANDIDATO group by Num_Candidato";
            //se ejecuta la sentencia sql
            ResultSet rsPA= accesoDatos.ejecutaSQLRetornaRS(select);
            //se llama el array con los proyectos
            while(rsPA.next()){
                
                int numCand= rsPA.getInt("Num_Candidato");
                int cantidad = rsPA.getInt("Cantidad");
                
                
                //se construye el objeto.
                fproducto producto= new fproducto(producto_id, producto_nombre, producto_descripcion, producto_imagen, 
                    producto_estado, producto_precio, producto_cantidad);
                
                listaproductos.add(perVoto);
            }
            rsPA.close();//se cierra el ResultSeat.
            
        }catch(SQLException e){
            throw new SNMPExceptions (SNMPExceptions.SQL_EXCEPTION,
                                     e.getMessage(),e.getErrorCode());
        }catch(Exception e){
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,e.getMessage());
        }finally{
            
        }
        return listaproductos;
    }
    
}
