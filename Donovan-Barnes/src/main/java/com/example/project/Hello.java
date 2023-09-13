package com.example.project;

public class Hello {
int [][][] numbers = new int [2][2][2];
int rando = 1;

for (int a = 0; a < 2; a++) {
    for (int b = 0; b < 2; b++) {
        for (int c = 0; c < 0; c++){
            numbers[a][b][c] = rando;
            rando++;
            
            System.out.println(numbers[a][b][c]);
        }
    }
}
	

}

