/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprojekt;

/**
 *
 * @author rominakehl
 */
public class Rechner {
    
    
public float malzwei(float[] numbers)
{
float doppelt = 2*numbers[0];
return doppelt;   
}

public float minimum(float[] numbers)
{
      
     float minimum = numbers[0];  
     for(int i=0;i<numbers.length;i++){  
     if(minimum > numbers[i]){  
     minimum = numbers[i];  
        }  
     }  
    return minimum;  
}  
     
}

