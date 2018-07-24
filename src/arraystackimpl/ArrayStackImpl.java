/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystackimpl;

/**
 *
 * @author Dr. Abuobayda Shabat
 * @version 2.0
 */
public class ArrayStackImpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StackInterface<Integer> s = new Stack<Integer>();
        s.push(20);
        s.push(10);
        s.push(70);
        
        System.out.println("The size of the stack: "+ s.stackSize());
        System.out.println("The top value on the stack: "+ s.pop());
        System.out.println("The size of the stack: "+ s.stackSize());
        
        
        
        

    }
    
}
