/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author ivonn
 */
public class Cliente {
    //variables
    private int CLI_ID;
    private String CLI_NOMBRE;
    private String CLI_APELLIDO1;
    private String CLI_APELLIDO2;
    private int DIREC_ID;
    private int TEL_ID;
    private Date CLI_HORARIO_ENTREGA;
    private int ESTADO;
    //Constructores
    
    public Cliente(int CLI_ID,String CLI_NOMBRE,String apellido1,String apellido2,int DIREC_ID,int TEL_ID,Date CLI_HORARIO_ENTREGA,int ESTADO){
      this.setCLI_ID(CLI_ID); 
      this.setCLI_NOMBRE(CLI_NOMBRE);
      this.setCLI_APELLIDO1(apellido1);
      this.setCLI_APELLIDO2(apellido2);
      this.setDIREC_ID(DIREC_ID); 
      this.setTEL_ID(TEL_ID); 
      this.setCLI_HORARIO_ENTREGA(CLI_HORARIO_ENTREGA);
      this.setESTADO(ESTADO);
    }
    
    public Cliente()    {
        
    }
    
    //Get y Set
    

    public int getCLI_ID() {
        return CLI_ID;
    }

    public void setCLI_ID(int CLI_ID) {
        this.CLI_ID = CLI_ID;
    }

    public String getCLI_NOMBRE() {
        return CLI_NOMBRE;
    }

    public void setCLI_NOMBRE(String CLI_NOMBRE) {
        this.CLI_NOMBRE = CLI_NOMBRE;
    }

    public int getDIREC_ID() {
        return DIREC_ID;
    }

    public void setDIREC_ID(int DIREC_ID) {
        this.DIREC_ID = DIREC_ID;
    }

    public int getTEL_ID() {
        return TEL_ID;
    }

    public void setTEL_ID(int TEL_ID) {
        this.TEL_ID = TEL_ID;
    }

    

    public Date getCLI_HORARIO_ENTREGA() {
        return CLI_HORARIO_ENTREGA;
    }

    public void setCLI_HORARIO_ENTREGA(Date CLI_HORARIO_ENTREGA) {
        this.CLI_HORARIO_ENTREGA = CLI_HORARIO_ENTREGA;
    }

    public String getCLI_APELLIDO1() {
        return CLI_APELLIDO1;
    }

    public void setCLI_APELLIDO1(String CLI_APELLIDO1) {
        this.CLI_APELLIDO1 = CLI_APELLIDO1;
    }

    public String getCLI_APELLIDO2() {
        return CLI_APELLIDO2;
    }

    public void setCLI_APELLIDO2(String CLI_APELLIDO2) {
        this.CLI_APELLIDO2 = CLI_APELLIDO2;
    }

    public int getESTADO() {
        return ESTADO;
    }

    public void setESTADO(int ESTADO) {
        this.ESTADO = ESTADO;
    }

   
}
