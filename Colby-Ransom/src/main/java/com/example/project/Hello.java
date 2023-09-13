public class Hello {
    public static void main(String[] args) {
        int[][][] numbers;
        numbers = new int[2][2][2];
        int temp = 1
        for(int i = 0; i<2; i++){
            for(int w = 0; w<2; w++){
                for(int z=0; z<2; z++){
                    numbers[i][w][z] = temp;
                    temp++;
                }
            }
        }

        //print it out
        for(int z=0; z<2; z++){
            for(int y=0; y<2; y++){
                for(int x=0; x<2; x++){
                    System.out.print(numbers[z][y][x]/*+ " "*/);
                }
                //System.out.println();
            }
            //System.out.println();
        }

        //you need to print them in a line so the println()'s are not needed
        // but otherwise it looks perfect.
    }
}