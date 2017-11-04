/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.awt.geom.Ellipse2D;
import javax.swing.JLabel;

/**
 *
 * @author Clint
 */
public class esfera {
    
    private int x;
    private int y;
    private int tamaño=30;
    private JLabel esfe;

    public esfera(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    
    public Ellipse2D generarEsfera(){
        
        
        return new Ellipse2D.Double(x,y,tamaño,tamaño);
    }
    
    public void moverenX (int i){
        x=i;
    }
    
    public void moverenY(int j){
        y=j;
    }
    
    
}
