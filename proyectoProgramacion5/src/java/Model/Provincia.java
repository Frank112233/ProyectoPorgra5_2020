/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Franklin Fernandez
 */
public class Provincia {
    int PROVI_ID;
    String DSC_PROVIN;
    String DSC_CORTA_PROVIN;
    int ESTADO_PROVIN;
    
    public Provincia(int provi_id, String dsc_provin, 
            String dsc_corta_provin, int estado_provin) {
        
        this.setPROVI_ID(provi_id);
        this.setDSC_PROVIN(dsc_provin);
        this.setDSC_CORTA_PROVIN(dsc_corta_provin);
        this.setESTADO_PROVIN(estado_provin);
    }
     public Provincia()  {
        
    }

    public int getPROVI_ID() {
        return PROVI_ID;
    }

    public void setPROVI_ID(int PROVI_ID) {
        this.PROVI_ID = PROVI_ID;
    }

    public String getDSC_PROVIN() {
        return DSC_PROVIN;
    }

    public void setDSC_PROVIN(String DSC_PROVIN) {
        this.DSC_PROVIN = DSC_PROVIN;
    }

    public String getDSC_CORTA_PROVIN() {
        return DSC_CORTA_PROVIN;
    }

    public void setDSC_CORTA_PROVIN(String DSC_CORTA_PROVIN) {
        this.DSC_CORTA_PROVIN = DSC_CORTA_PROVIN;
    }

    public int getESTADO_PROVIN() {
        return ESTADO_PROVIN;
    }

    public void setESTADO_PROVIN(int ESTADO_PROVIN) {
        this.ESTADO_PROVIN = ESTADO_PROVIN;
    }
     
}

  
