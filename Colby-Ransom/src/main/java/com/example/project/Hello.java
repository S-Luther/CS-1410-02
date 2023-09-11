public class Hello {
    //public static void printStringOut(string inputString){
        //println(inputString);
    //}
    public static void main(String[] args) {
        //String[] stringArray= {"Hello World!"};
        //printStringOut(stringArray[0]);
        int[][] numbers = {{1,2},{3,4}};
        for(int i = 0; i<2; i++){
            for(int w = 0; w<2; w++){
                System.out.print(numbers[i][w] + " ");
            }
            System.out.println();
        }
    }
}