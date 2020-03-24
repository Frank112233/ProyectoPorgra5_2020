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
public class BarrioDB {
     //Atributos
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    private LinkedList<Barrio> listaB = new LinkedList<Barrio>();

    //Constructores
    public BarrioDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public BarrioDB() {
        super();
    }

    //Metodos
    public LinkedList<Barrio> moTodo() throws SNMPExceptions, SQLException {
        String select = "";
        LinkedList<Barrio> listaBarrio = new LinkedList<Barrio>();

        try {
            //Se instancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de búsqueda
            select
                    = "SELECT BARRIO_ID,CANTON_ID,DISTRI_ID,PROVI_ID,DSC_BARRI,ESTADO_BARRIO FROM BARRIO";
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //Se llena el arryaList con los proyectos   
            while (rsPA.next()) {
                
                int codigoBarrio = rsPA.getInt("BARRIO_ID");
                int codigoCanton = rsPA.getInt("CANTON_ID");
                int codigoDistrito = rsPA.getInt("DISTRI_ID");
                int codigoProvincia = rsPA.getInt("PROVI_ID");
                String dscBarrio = rsPA.getString("DSC_BARRI");
                int logActivo = rsPA.getInt("ESTADO_BARRIO");

                Barrio perBarrio = new Barrio(codigoBarrio,codigoCanton,codigoDistrito,codigoProvincia,dscBarrio, logActivo);
                listaBarrio.add(perBarrio);
            }
            rsPA.close();

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }

        return listaBarrio;
    }

}//fin clase 

