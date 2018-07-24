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
public interface StackInterface<T> {
    public void push(T newvalue);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void clear();
    public int stackSize();
    
}
