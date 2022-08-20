package com.javase.datastructures;

import java.util.Arrays;

public class Stack {
    //Default maximum stack size
    public static final int MAX_STACK_SIZE = 5;
    boolean full = false;
    boolean empty = true;

    //Backing Array
    String[] array = new String[MAX_STACK_SIZE];
    //Points to first empty cell
    int pointer = 0;

    //Put element from the top
    public boolean push(String newElement) {
        if (!full) {
            array[pointer] = newElement;
            pointer++;
            empty = false;
            if (pointer == MAX_STACK_SIZE)
                full = true;
            return true;
        } else
            return false;
    }

    // Pop element from the top
    public String pop() {
        String lastItem = null;
        if (!empty) {
            lastItem = array[pointer - 1];
            array[pointer - 1] = null;
            pointer--;
            if (pointer == MAX_STACK_SIZE)
                full = false;
            if (pointer == 0)
                empty = true;
        }
        return lastItem;
    }

    // Remove all elements from stack
    public void clear() {
        Arrays.fill(array, null);
        pointer = 0;
        empty = true;
        full = false;
    }

    // Stack status operations
    // Is stack empty?
    public boolean isEmpty() {
        return empty;

    }

    // Is stack full?
    public boolean isFull() {
        return full;
    }

    // How many elements in stack?
    public int size() {
        return pointer;
    }

    // Capacity of stack?
    public int getCapacity() {
        return MAX_STACK_SIZE;
    }

    // Outputs the elements in the
    public void showElements() {
        System.out.println("*** Elements in the Stack ***");
        if (!empty)
            for (String s : array) {
                if (s != null)
                    System.out.println(s);
            }

        else
            System.out.println("Nothing in the Stack");
    }
}
