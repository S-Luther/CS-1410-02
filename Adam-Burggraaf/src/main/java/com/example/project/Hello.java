package com.example.project;

public class Hello {

   

        
    public static void main(String[] args) {

            int [][][] empty= newint [2][2][2];
                    int h=1;
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    for(int k=0; k<2; k++){
                       empty[i][j][k]= h;
                        h++;
                
                    }

                }

            }

        for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    for(int k=0; k<2; k++){
                       System.out.print(empty[i][j][k]);
                
                    }
                    System.out.print(empty[i][j][k]);
                
                }
                System.out.print(empty[i][j][k]);
                

            }



    



}
	

}

