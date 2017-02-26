/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A. R. Chishti
 */
public class MatrixTest {
        Matrix a = new Matrix("A",2,2);
        Matrix b = new Matrix("B",2,2);
        Matrix result = new Matrix("RESULT",a.no_rows,b.no_cols);
    
    public MatrixTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
/*        a.get_input();
        a.print();
        
        b.get_input();
        b.print();*/

        
        a.matrix[0][0]=1;
        a.matrix[0][1]=2;
        a.matrix[1][0]=3;
        a.matrix[1][1]=4;

        b.matrix[0][0]=1;
        b.matrix[0][1]=2;
        b.matrix[1][0]=58;
        b.matrix[1][1]=7;
        
        int[][] resultMatrix= new int[2][2];
        resultMatrix[0][0]=116;
        resultMatrix[0][1]=14;
        resultMatrix[1][0]=232;
        resultMatrix[1][1]=28;        

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get_result method, of class Matrix.
     */
    @Test
    public void testGet_result() {
                
        if(a.no_cols == b.no_rows){
            Matrix check = new Matrix("no",0,0);
            result = check.get_result(a,b,result);
            
            System.out.println("HERE IS THE MATRIX A");
            a.print();
            System.out.println("HERE IS THE MATRIX B");
            b.print();
            
            System.out.println("HERE IS THE RESULT");
            System.out.println("VALUES OF RESULTANT MATRIX WILL BE");
            result.print();
        }
        else{
            System.out.println("NOT COMPATIBLE");
        }
    }

   
}
