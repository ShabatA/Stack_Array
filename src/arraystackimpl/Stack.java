/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystackimpl;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author Dr. Abuobayda Shabat
 * @version 2.0
 */
public class Stack<T> implements StackInterface<T> {
    
    private T elements[];
    private int size;
    
    Stack(){
        elements = (T[]) new Object[20];
        size = 0;
    }

    @Override
    public void push(T newvalue) {
        if(size==elements.length){
            elements = Arrays.copyOf(elements, size*2);
        }
        elements[size]=newvalue;
        size++;
        
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();    
        }
        T top = elements[size-1];
        size--; 
        return top;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();    
        }
        T top = elements[size-1];
        return top; 
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void clear() {
        size=0;
    }

    @Override
    public int stackSize() {
        return size;
    }
    
}
