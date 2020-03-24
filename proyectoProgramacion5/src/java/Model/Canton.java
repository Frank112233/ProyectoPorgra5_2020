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
public class Canton {
    //Atributos
    private int CANTON_ID ;
    private int PROVI_ID;
    private String DSC_CANTON;
    private int ESTADO_CANTON;
    
    //Constructores
    public Canton(int canton_id, int prov_id, String dsc_canton, int estado){
        this.setCANTON_ID(canton_id);
        this.setPROVI_ID(prov_id);
        this.setDSC_CANTON(dsc_canton);
        this.setESTADO_CANTON(estado);
    }
    
    public Canton(){
        
    }
    
    //Set y Get

    public int getCANTON_ID() {
        return CANTON_ID;
    }

    public void setCANTON_ID(int CANTON_ID) {
        this.CANTON_ID = CANTON_ID;
    }

    public int getPROVI_ID() {
        return PROVI_ID;
    }

    public void setPROVI_ID(int PROVI_ID) {
        this.PROVI_ID = PROVI_ID;
    }

    public String getDSC_CANTON() {
        return DSC_CANTON;
    }

    public void setDSC_CANTON(String DSC_CANTON) {
        this.DSC_CANTON = DSC_CANTON;
    }

    public int getESTADO_CANTON() {
        return ESTADO_CANTON;
    }

    public void setESTADO_CANTON(int ESTADO_CANTON) {
        this.ESTADO_CANTON = ESTADO_CANTON;
    }
    
    
    
}//fin clase
