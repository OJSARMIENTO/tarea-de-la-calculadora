/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmatri;

import java.util.Arrays;

/**
 *
 * @author fabrica1
 */
public class CalculadoraDeMatrices {

    private float[][] matrizA;
    private float[][] matrizB;
    private float[][] matrizR;
    private int filasA, columnasA, filasB, columnasB;
    private char op;

    public CalculadoraDeMatrices() {
    }

    public void CalcMatrices(float[][] matrizA, float[][] matrizB, char op) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.op = op;
        this.filasA = matrizA.length;
        this.columnasA = matrizA[0].length;
        this.filasB = matrizB.length;
        this.columnasB = matrizB[0].length;

        switch (op) {
            case '+':
                if (comprobarM()) {
                    matrizR = new float[this.filasA][this.columnasA];
                    sumarMatrices(matrizR);
                    System.out.println("Matriz A:");
                    imprimMatriz(this.matrizA);
                    System.out.println("Matriz B:");
                    imprimMatriz(this.matrizB);
                    System.out.println("La suma de las matrices es: ");
                    imprimMatriz(this.matrizR);
                } else {
                    System.out.println("Las matrices no tienen el mismo tamaño");
                }   break;
            case '-':
                if (comprobarM()) {
                    matrizR = new float[this.filasA][this.columnasA];
                    restarMatrices(matrizR);
                    System.out.println("Matriz A:");
                    imprimMatriz(this.matrizA);
                    System.out.println("Matriz B:");
                    imprimMatriz(this.matrizB);
                    System.out.println("La resta de las matrices es: ");
                    imprimMatriz(this.matrizR);
                } else {
                    System.out.println("Las matrices no tienen el mismo tamaño");
                }   break;
            case '*':
                if (comprobarM_()) {
                    matrizR = new float[this.matrizA[0].length][this.matrizB.length];
                    multiplicarMatrices(matrizR);
                    System.out.println("Matriz A:");
                    imprimMatriz(this.matrizA);
                    System.out.println("Matriz B:");
                    imprimMatriz(this.matrizB);
                    System.out.println("La multiplicacion de las matrices es: ");
                    imprimMatriz(this.matrizR);
                } else {
                    System.out.println("Las matrices no tienen el tamaño adecuado para la multiplicacion");
                }
                break;
            
                
            case '?':
                if (comprobarM()) {
                    
                    
                    System.out.println("Matriz A:");
                    imprimMatriz(this.matrizA);
                    System.out.println("La traza de las matriz A es: ");
                    System.out.println(trazaMatrices(matrizA));
                    System.out.println("Matriz B:");
                    imprimMatriz(this.matrizB);
                    System.out.println("La traza de las matriz B es: ");
                    System.out.println(trazaMatrices(matrizB));
                } else {
                    System.out.println("Las matrices no tienen el tamaño adecuado para la traza");
                }
                break;
                
            case '&':
                if (comprobarD(this.matrizA)){
                    System.out.println("Matriz A:");
                    imprimMatriz(this.matrizA);
                    System.out.println("El determinante es: " + determinanteM(this.matrizA));
                    
                }else{
                    System.out.println("La matriz no es cuadrada");
                }
                if (comprobarD(this.matrizB)){
                    System.out.println("Matriz B:");
                    imprimMatriz(this.matrizB);
                    System.out.println("El determinante es: " + determinanteM(this.matrizB));
                    
                }else{
                    System.out.println("La matriz no es cuadrada");
                }
                
                
            default:
                break;
        }

    }

    private boolean comprobarM() {
        if (this.columnasA == this.columnasB && this.filasA == this.filasB) {
            return true;
        } else {
            return false;
        }

    }

    private void sumarMatrices(float[][] matrizR) {
        for (int y = 0; y < this.filasA; y++) {
            for (int x = 0; x < this.columnasA; x++) {
                float numeroMatriz1 = this.matrizA[y][x];
                float numeroMatriz2 = this.matrizB[y][x];
                float suma = numeroMatriz1 + numeroMatriz2;
                matrizR[y][x] = suma;
            }
        }

    }

    private void restarMatrices(float[][] matrizR) {
        for (int y = 0; y < this.filasA; y++) {
            for (int x = 0; x < this.columnasA; x++) {
                float numeroMatriz1 = this.matrizA[y][x];
                float numeroMatriz2 = this.matrizB[y][x];
                float resta = numeroMatriz1 - numeroMatriz2;
                matrizR[y][x] = resta;
            }
        }
    }

    private boolean comprobarM_() {
        if (this.matrizA[0].length == this.matrizB.length) {
            return true;
        } else {
            return false;
        }
    }

    private void multiplicarMatrices(float[][] matrizR) {
        
    // se comprueba si las matrices se pueden multiplicar
        
    
        float suma = 0;  
    
        for(int i = 0; i < this.matrizA.length; i++){  
            for(int j = 0; j < this.matrizB.length; j++){  
                suma = 0;  
                for(int k = 0; k < this.matrizB.length; k++){  
                    suma += matrizA[i][k] * matrizB[k][j];  
                }  
                matrizR[i][j] = suma;  
            }  
        }  
      
    
    
    
    /*
        for (int i = 0; i < this.matrizA.length; i++) {
            for (int j = 0; j < this.matrizB[0].length; j++) {
                for (int k = 0; k < this.matrizA[0].length; k++) {
                    // aquí se multiplica la matriz
                    matrizR[i][j] += this.matrizA[i][k] * this.matrizA[k][j];
                }
            }
        }
    */
    }
    private void imprimMatriz(float [][] matrizR){
        for(int i=0;i<matrizR.length;i++){
            for(int j=0;j<matrizR[0].length;j++){
                System.out.print(matrizR[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    

    private float trazaMatrices(float[][] matrizR) {
        float suma=0;
        for(int i=0;i<matrizR.length;i++){
            
                suma+=matrizR[i][i];
        
        }
        return suma;
    }

    private boolean comprobarD(float [][] matriz) {
        if (matriz.length==matriz[0].length){
            return true;
            
        }else{
            return false;
        }
    }

    private float determinanteM(float[][] matriz) {
        
		assert matriz != null;
		assert matriz.length>0;
		assert matriz.length == matriz[0].length;
		
		float determinante = 0;
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		// Si la matriz es 1x1, el determinante es el elemento de la matriz
		if ((filas==1) && (columnas==1))
			return matriz[0][0];
		

		int signo=1;
		
		for (int columna=0;columna<columnas;columna++)
		{
			// Obtiene el adjunto de fila=0, columna=columna, pero sin el signo.
			float[][] submatriz = getSubmatriz(matriz, filas, columnas,
					columna);
			determinante = determinante + signo*matriz[0][columna]*determinanteM(submatriz);
			signo*=-1;
		}
		
		return determinante;
    }
    public static float[][] getSubmatriz(float[][] matriz, 
			int filas,
			int columnas, 
			int columna) {
		float [][] submatriz = new float[filas-1][columnas-1];
		int contador=0;
		for (int j=0;j<columnas;j++)
		{
			if (j==columna) continue;
			for (int i=1;i<filas;i++)
				submatriz[i-1][contador]=matriz[i][j];
			contador++;
		}
		return submatriz;
	}

}
