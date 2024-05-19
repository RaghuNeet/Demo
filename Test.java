/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author neet
 */
public class Stack {
    private int[] stack;
    private int tos;
    private int capacity;
    
    public Stack(int capacity){
        this.capacity = capacity;
        stack = new int[this.capacity];
        tos = -1;
    }
    public void push(int element){
        if(tos >= capacity - 1){
            System.out.println("Stack OverFlow : ");
            return;
        }
        stack[++tos] = element;
    }
    public int pop(){
        if(tos == -1){
            System.out.println("Stack Underflow : ");
            return -2;
        }
        int popEl = stack[tos--];
        return popEl;
    }
}
