package testing;

import java.util.Scanner;
public class Matrix {

    public String name;
    public int[][] matrix;
    public int no_rows;
    public int no_cols;
    public Scanner read = new Scanner(System.in);
    
    public Matrix(String name, int rows, int cols){
        this.no_rows = rows;
        this.no_cols = cols;
        this.name = name;
        this.matrix = new int[no_rows][];
        for (int i = 0; i < no_rows; i++){
            matrix[i] = new int[no_cols];
        }
    }
    public Matrix(){}
    
    public Matrix get_result(Matrix a, Matrix b, Matrix c){
        int result;
        if(a != null && b != null){
        for(int i = 0; i < a.no_rows; i++){
            
            for(int k = 0; k < b.no_cols; k++){
            result = 0;

            for(int j = 0; j < b.no_rows; j++){
                  result += a.matrix[i][j] * b.matrix[j][k];
                }
                c.matrix[i][k] = result;
            }
        }
        return c;
        }
        else
            return null;
    }
    
    public void get_input(){
        System.out.print("Entries for Matrix");
        System.out.println(name);
        int input, row = 1, col = 1;
        
        for(int i = 0; i<(no_rows*no_cols); i++){
             input = read.nextInt();
             
             if(row <= no_rows){
                 matrix[row-1][col-1] = input;
                 col++;
             }
             else
                 break;

             if(col > no_cols){
                 row++;
                 col = 1;
             }
        }
    }

 
    public void print(){
        if(this != null){
        
        for(int i = 0; i < no_rows; i++){
            System.out.print("values of row ");
            System.out.println(i + 1);
            for( int j = 0; j < no_cols; j++){
                System.out.print(matrix[i][j]);
                System.out.println(" ");
            }
        }
        System.out.println("END OF RESULTANT");
        }
    }

}
