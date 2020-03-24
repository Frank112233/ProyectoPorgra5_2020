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
import javax.naming.NamingException;

/**
 *
 * @author Franklin Fernandez
 */
public class ProvinciaDB {
     private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    private LinkedList<Provincia> listaP = new LinkedList<Provincia>();

    public ProvinciaDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public ProvinciaDB() {
        super();
    }

    public LinkedList<Provincia> moTodo() throws SNMPExceptions, SQLException {
        String select = "";
        LinkedList<Provincia> listaPro = new LinkedList<Provincia>();

        try {

            //Se instancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de búsqueda
            select
                    = "SELECT PROVI_ID,DSC_PROVIN,DSC_CORTA_PROVIN,ESTADO_PROVIN FROM PROVINCIA";
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //Se llena el arryaList con los proyectos   
            while (rsPA.next()) {

                int codigoProvincia = rsPA.getInt("PROVI_ID");
                String dscProvincia = rsPA.getString("DSC_PROVIN");
                String dscCortaProvincia = rsPA.getString("DSC_CORTA_PROVIN");
                int logActivo = rsPA.getInt("ESTADO_PROVIN");

                Provincia perProvincia = new Provincia(codigoProvincia,dscProvincia, dscCortaProvincia, logActivo);
                listaPro.add(perProvincia);
            }
            rsPA.close();

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage());
        } finally {

        }

        return listaPro;
    }

    public void mvActualizarProv(Provincia pvoProvincia) throws SNMPExceptions, SQLException, NamingException, ClassNotFoundException {
        //Se obtienen los valores del objeto Empresa
        Provincia E = new Provincia();
        E = pvoProvincia;
        //Datos de Empresa    

        int codigo = E.getPROVI_ID();
        String nombre = E.getDSC_CORTA_PROVIN();
        int estado = E.getESTADO_PROVIN();
        //Se crea la sentencia de actualización
        String update
                = "UPDATE Provincia SET DSC_PROVIN = '" + nombre + "', ESTADO_PROVIN=" + estado + "where PROVI_ID = " + codigo;
        //Se ejecuta la sentencia SQL
        accesoDatos.ejecutaSQL(update);

    }

    public boolean mbConsultarProvincia(int pvnCodigo) throws SNMPExceptions, SQLException {
        ResultSet rsEM = null;
        String select = "";
        try {
            boolean existe = false;
            select
                  
                    = "SELECT PROVI_ID,DSC_PROVIN,DSC_CORTA_PROVIN,ESTADO_PROVIN FROM PROVINCIA where PROVI_ID =" + pvnCodigo;
            //Se ejecuta la sentencia SQL
            rsEM = accesoDatos.ejecutaSQLRetornaRS(select);

            if (rsEM.next()) {
                existe = true;
            }
            return existe;
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage());
        } finally {
            accesoDatos.closeResultSet(rsEM);

        }
    }
}
