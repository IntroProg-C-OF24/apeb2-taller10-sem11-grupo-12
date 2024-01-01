package ejericiosbryan09;
public class Ejercicio8 {
    public static void main(String[] args) {
        int limMt=3;
        int mt[][]= new int [limMt][limMt];
        for (int i = 0; i < mt.length; i++) 
            for (int j = 0; j < mt.length; j++) 
                mt[i][j]= (int)(Math.random()*(9-(-9)+1)+(-9));
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) 
                System.out.print("["+mt[i][j]+"]"+ "\t");
            System.out.println("");          
        }
        System.out.println("");
        System.out.println("La diagonal principal es: ");
        for (int d = 0; d < mt.length; d++) {
            System.out.println("["+mt[d][d]+"]");
        }
        System.out.println("");
        System.out.println("Numeros por encima de la diagonal principal son: ");
        /* (int i = 1; i < mt.length; i++){
           for (int j = mt.length; j<0; j--) 
               System.out.println("["+mt[i][j]+"]");
        */
        System.out.print("["+mt[0][1]+"]");
        System.out.print("["+mt[0][2]+"]");
        System.out.print("["+mt[1][2]+"]");
        
        System.out.println("");
        System.out.println("Numeros por debajo de la diagonal principal son: ");
        /*for (int a = mt.length-1;a>0; a--){
            for (int i = a; i < mt.length; i++) 
             System.out.println("["+mt[a]i]+"]");
        */
        System.out.print("["+mt[1][0]+"]");
        System.out.print("["+mt[2][0]+"]");
        System.out.print("["+mt[2][1]+"]");
        System.out.println("");
    }
}

/*[9]	[-7]	[8]	
[6]	[1]	[-6]	
[5]	[-6]	[-3]	

La diagonal principal es: 
[9]
[1]
[-3]

Numeros por encima de la diagonal principal son: 
[-7][8][-6]
Numeros por debajo de la diagonal principal son: 
[6][5][-6]*/