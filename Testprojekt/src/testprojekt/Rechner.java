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


public float summe (float[] numbers)
{
    
         float sum = 0;
    for(int i=0; i<5; i++){
        sum = sum +numbers[i];
        }
    return sum;   
}
}
