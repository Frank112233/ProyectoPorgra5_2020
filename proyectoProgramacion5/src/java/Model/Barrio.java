/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ivonn
 */
public class Barrio {
    //Atributos
    private int BARRIO_ID;
    private int	CANTON_ID;
    private int DISTRI_ID;
    private int PROVI_ID;
    private String DSC_BARRIO;
    private int ESTADO_BARRIO;
    
    //Constructores
    public Barrio() {
        
    }
    
    public Barrio(int barrio_id, int canton_id, int distri_id, int provi_id, String dsc_barrio, int estado) {
        this.setBARRIO_ID(barrio_id);
        this.setCANTON_ID(canton_id);
        this.setDISTRI_ID(distri_id);
        this.setPROVI_ID(provi_id);
        this.setDSC_BARRIO(dsc_barrio);
        this.setESTADO_BARRIO(estado);
    }
    
    //Set y Get

    public int getBARRIO_ID() {
        return BARRIO_ID;
    }

    public void setBARRIO_ID(int BARRIO_ID) {
        this.BARRIO_ID = BARRIO_ID;
    }

    public int getCANTON_ID() {
        return CANTON_ID;
    }

    public void setCANTON_ID(int CANTON_ID) {
        this.CANTON_ID = CANTON_ID;
    }

    public int getDISTRI_ID() {
        return DISTRI_ID;
    }

    public void setDISTRI_ID(int DISTRI_ID) {
        this.DISTRI_ID = DISTRI_ID;
    }

    public int getPROVI_ID() {
        return PROVI_ID;
    }

    public void setPROVI_ID(int PROVI_ID) {
        this.PROVI_ID = PROVI_ID;
    }

    public String getDSC_BARRIO() {
        return DSC_BARRIO;
    }

    public void setDSC_BARRIO(String DSC_BARRIO) {
        this.DSC_BARRIO = DSC_BARRIO;
    }

    public int getESTADO_BARRIO() {
        return ESTADO_BARRIO;
    }

    public void setESTADO_BARRIO(int ESTADO_BARRIO) {
        this.ESTADO_BARRIO = ESTADO_BARRIO;
    }
   
    
}//fin 


