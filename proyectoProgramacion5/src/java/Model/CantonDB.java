/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author ivonn
 */
public class CantonDB {
    //Atributos
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    private LinkedList<Canton> listaC = new LinkedList<Canton>();

    //Constructores
    public CantonDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public CantonDB() {
        super();
    }

    //Metodos
    
    //Llena el combo de Canton
    public LinkedList<Canton> moTodo() throws SNMPExceptions {
        String select = "";
        LinkedList<Canton> listaCant = new LinkedList<Canton>();

        try {

            //Se instancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de búsqueda
            select 
                    = "SELECT CANTON_ID,PROVI_ID,DSC_CANTON,ESTADO_CANTON FROM CANTON";
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            while (rsPA.next()) {

                int codigoCanton = rsPA.getInt("CANTON_ID");
                int codigoProvincia = rsPA.getInt("PROVI_ID");
                String dscCanton = rsPA.getString("DSC_CANTON");
                int logActivo = rsPA.getInt("ESTADO_CANTON");

                Canton perCanton = new Canton(codigoCanton,codigoProvincia,dscCanton,logActivo);
                listaCant.add(perCanton);
            }
            rsPA.close();
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }

        return listaCant;
    }
    
   

}//fin clase
 
