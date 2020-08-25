
public class Fibonnacci {
    public int factorial(int n){
         if (n>1){
       return factorial(n-1) + factorial(n-2); 
    }
    else if (n==1) { 
        return 1;
    }
    else if (n==0){  
        return 0;
    }
    else{ 
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
    } 
    }
}
