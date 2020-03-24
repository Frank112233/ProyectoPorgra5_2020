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
 * @author ivonn
 */
public class ProductoDB {
     private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    //private LinkedList<Producto> listaP = new LinkedList<Producto>();
    public ProductoDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public ProductoDB() {
        super();
    }

    //CRUD Caro ver
    //Actualiza el producto
    public void mvActualizarProd(Producto producto) throws SNMPExceptions, SQLException, NamingException, ClassNotFoundException {

        //Se obtienen los valores del objeto Producto
        Producto oUsuario = new Producto();
        oUsuario = producto;

        //Datos de Proyecto 
        //String Nombre= oProducto.getNombre();
        int prodId = oUsuario.getProd_id();
        double cantidad = oUsuario.getCantidad();
        double precio = oUsuario.getPrecio();
        char estado = oUsuario.getEstado();

        //Se crea la sentencia de actualización
       String update = "UPDATE Producto SET PROD_ID = " + prodId + ", PROD_CANTIDAD = '" + cantidad
        + "',PROD_PRECIO= '" + precio + "',PROD_ESTADO= '" + estado + "' where PROD_ID= " + producto.getProd_id() + "";

        //Se ejecuta la sentencia SQL
//        accesoDatos.ejecutaSQL(update);
    }

    //Consultar Producto
    public boolean consultarProducto(int proCodigo) throws SNMPExceptions, SQLException {
        ResultSet rsPA = null;
        String select = "";
        try {
            boolean existe = false;
            select = "SELECT PROD_ID,PROD_DESCRIPCION,PROD_ESTADO,PROD_PRECIO\n" +
            ",PROD_CANTIDAD FROM dbo.PRODUCTO where PROD_ID =" + proCodigo;

            //Se ejecuta la sentencia SQL
            rsPA = accesoDatos.ejecutaSQLRetornaRS(select);

            if (rsPA.next()) {
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
            accesoDatos.closeResultSet(rsPA);
        }
    }

    //Eliminar Producto
    public void mvEliminarProd(int codElimina) throws SNMPExceptions, SQLException, NamingException, ClassNotFoundException {
        //Se crea la sentencia borrado
        // open();
        int estado = 0;
        ResultSet rsPA = null;
        //Se crea la sentencia de actualización
        String update
                = "UPDATE Usuario SET Estado = " + estado + " where Prodc_Id = " + codElimina + "";

        accesoDatos.ejecutaSQL(update);
    }

    //Insertar un producto
    public void insertarProducto(Producto prod) throws SNMPExceptions, SQLException {
        String strSQL = "";
        try {

            //Se obtienen los valores del objeto de proyecto
            Producto oProducto = new Producto();
            oProducto = prod;

            strSQL = "INSERT INTO PRODUCTO(PROD_ID,PROD_DESCRIPCION,PROD_ESTADO,PROD_PRECIO,PROD_CANTIDAD)\n" +
            "VALUES VALUES (" + prod.getProd_id()+ ",'" + prod.getNombreProducto()+ "','" + prod.getEstado()+ "','" + 
                    prod.getPrecio() + "','" + prod.getCantidad()+ ")";
            
            //Se ejecuta la sentencia SQL
            accesoDatos.ejecutaSQL(strSQL);

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage());
        } finally {

        }
    }
    
    //BUSCAR Producto   
    public LinkedList<Producto> unProducto(int codigop) throws SNMPExceptions, SQLException {
      
        String strSQL = "";
        LinkedList<Producto> unoProd = new LinkedList<Producto>();
        try {
        
            strSQL = 
            "SELECT PROD_ID,PROD_DESCRIPCION, PROD_ESTADO,PROD_PRECIO\n" +
            ",PROD_CANTIDAD FROM dbo.PRODUCTO where PROD_ID =" + codigop;
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(strSQL);
            while (rsPA.next()) {
                int prodId =rsPA.getInt("Prodc_Id");
                String nombreProducto=rsPA.getString("Produc_Nombre");
                double cantidad=rsPA.getDouble("Produc_Cantidad");
                double precio=rsPA.getDouble("Usu_Produc_Precio");
                int estado=rsPA.getInt("estado");
            
                //Producto oUsuario = new Producto(codigo, nombreProducto, cantidadExis, precio, cantidadMin, descripcion, fechaVenci,  
                   //                             fechaIngreso, fechaEdita, usuIngresa, usuEdita, categoria, estado);
                //unoProd.add(oUsuario);
            }
            rsPA.close();
            
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        }catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {
         
        }
        return unoProd;
    }

}//fin clase

