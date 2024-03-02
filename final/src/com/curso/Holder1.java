package com.curso;

class Holder1 {
    int value = 1;
    Holder1 link;
    public Holder1(int val) { this.value = val; }
    
    public static void main(String[] args) {
    	
        final Holder1 a = new Holder1(5);        
        Holder1 b = new Holder1(10);
        b = a;
        
        
    }

   
}
