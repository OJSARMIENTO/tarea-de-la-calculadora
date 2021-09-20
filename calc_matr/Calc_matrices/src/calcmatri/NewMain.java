/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmatri;

/**
 *
 * @author fabrica1
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalculadoraDeMatrices calcMatr=new CalculadoraDeMatrices();
        
        float [][] matrizA = {{1,-1,1},{2,2,3},{-2,-3,-1}};
        float [][] matrizB = {{1,0,4},{0,2,5},{1,3,0}};
        float [][] matrizC = {{2,1,3},{4,-1,2},{-3,4,2}};
       
        calcMatr.CalcMatrices(matrizA, matrizC, '&');
        
        // TODO code application logic here
    }
    
}
