/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posiciones;

/**
 *
 * @author Omar
 */
public class Arreglo {
    
    char arreglo [] = new char[10];
    
    public Arreglo()    {
        cambiaValor(0,this.arreglo);
    }
    
    char[] getArreglo() {
        return this.arreglo;
    }
    
   public void cambiaValor(int x, char arreglo[])    {
        for(int z = 0; z < this.arreglo.length; z++)    {
           this.arreglo[z] = '#';
        }
        try {
            this.arreglo[x] = '*';
        } catch(Exception e)    {
            if (x <= 0) {
                this.arreglo[0] = '*';
            } else if (x>=10)   {
                this.arreglo[9] = '*';
            }
        }
            
        
        
    }
    
    
}
