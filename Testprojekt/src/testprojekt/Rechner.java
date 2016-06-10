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

public float[] selection(float[] numbers){
    float temp;
    for(int i = 0; i < numbers.length - 1; i++){
        for (int j = i + 1; j < numbers.length; j++){
            if (numbers[j] < numbers[i]){
                temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;
            }
        }
    }
    return numbers;
} 
}
