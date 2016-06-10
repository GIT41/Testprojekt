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

public void swap(float[] numbers, int a, int b) {
	float c = numbers[a];
	numbers[a] = numbers[b];
	numbers[b] = c;
}

public void bubble(float[] numbers) {
    for(int n = numbers.length; n > 1; n--)
        for(int i = 0; i < n - 1; i++)
            if (numbers[i] > numbers[i + 1])
                swap(numbers, i, i+1);
}

}
