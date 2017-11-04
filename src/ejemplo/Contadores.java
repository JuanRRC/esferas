/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Clint
 */
public class Contadores extends Thread{
    
    int i=0;
    int velocidad;
    JLabel num;
    esfera obj,obj2,obj3,obj4;
    EsferaP panel_obj;
    private int limiteX,limiteY;
    
    public Contadores(EsferaP referenciaPanel,int limiteX,int limiteY){
        
        this.panel_obj= referenciaPanel;
        this.limiteX=limiteX;
        this.limiteY=limiteY;
        obj = new esfera(10,10);
        obj2 = new esfera(540,10);
        obj3 = new esfera(540,265);
        obj4 = new esfera(10,265);
        
    }
    
    
    
    
    @Override
    public void run(){
        
        panel_obj.recibeEsfera(obj);
        panel_obj.recibeEsfera(obj2);
        panel_obj.recibeEsfera(obj3);
        panel_obj.recibeEsfera(obj4);
        try {
        
            if((limiteX==10)&&(limiteY==10)){
                for(i=0;i<=540;i++){
                    obj.moverenX(i);
                    panel_obj.paint(panel_obj.getGraphics());
                    
                    sleep(5);
            
                }
            }
                        
            
                if((limiteX==540)&&(limiteY==10)){
                    for(i=10;i<=260;i++){
                    obj2.moverenY(i);
                    panel_obj.paint(panel_obj.getGraphics());
                    
                    sleep(5);
            
                    }   
                }
                
                if((limiteX==540)&&(limiteY==265)){
                        for(i=540;i>10;i--){
                        obj3.moverenX(i);
                        panel_obj.paint(panel_obj.getGraphics());
                    
                        sleep(5);
            
                        }   
                    }
                if((limiteX==10)&&(limiteY==265)){
                        for(i=265;i>10;i--){
                        obj4.moverenY(i);
                        panel_obj.paint(panel_obj.getGraphics());
                    
                        sleep(5);
            
                        }  
                    }
                
            
            
        
        
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Contadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void reset(){
        this.i=0;
    }
    
}
