/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Casax64
 */
public class CdCheckIn {

    private String cdEqp, cdGrupo, postoInicial, lider;
    private int cdPostoInicial, cdLider;
    
    public void getCdCheckIn(String c){
        setCdEqp(c);
        setCdGrupo(c);
        setCdPostoInicial(c);
        setCdLider(c);
    }
    
    public void setCdEqp(String e) {
        //Recebe o Código da Equipe no caso os 3 pirmeiros dígitos do CheckIn
        cdEqp = e.substring(e.length() - 8, e.length() - 5);
    }

    public void setCdGrupo(String g) {
        cdGrupo = g.substring(g.length() -5, g.length() -2);
    }

    public void setCdPostoInicial(String p) {
        cdPostoInicial = Integer.parseInt(p.substring(p.length() - 2, p.length() -1)); 
    }

    public void setCdLider(String l) {
        cdLider = Integer.parseInt(l.substring(l.length() -1));
        
    }
    
    public void definirPostoInicial(){
        switch (cdPostoInicial){
            case 1:
                postoInicial = "01 - EUA";
                break;
            case 2:
                postoInicial = "02 - Suíça";
                break;
            case 3:
                postoInicial = "03 - Austrália";
                break;
            case 4:
                postoInicial = "04 - Alemanha";
                break;
            case 5:
                postoInicial = "05 - Brasil";
                break;            
        }
    }
    
    public void definirLider(){
        if (cdLider == 1){
            lider = "Sim";
        }else{
            lider = "Não";
        }
    }
    
    public String getCdEqp(){
        return cdEqp;
    }
    
    public String getCdGrupo(){
        return cdGrupo;
    }
    
    public String getPostoInicial(){
        return postoInicial;
    }
    
    public String getLider(){
        return lider;
    }
    


}
