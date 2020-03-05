/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

/**
 *
 * @author pdelague
 */
public class FizzBuzzAlgorithm extends ConsoleBasedFizzBuzz{
    
    public FizzBuzzAlgorithm(int a, int b){
        super(a,b);
    }
    
    String r = "";
    
    @Override
    public String algorithm(){
        
        for(int i=a;i<=b;i ++){
            
            if(i%3==0 && i%5==0){
                r=r.concat(" FizzBuzz \n");
            }
            else if(i%3==0){
                r=r.concat(" Fizz \n");
            }
            else if(i%5==0){
                r=r.concat(" Buzz \n");
            }
            else{
                r=r.concat(" "+i+" \n");
            }
        }
        
        return r;
    }
}
