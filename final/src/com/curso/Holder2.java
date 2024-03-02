package com.curso;

class Holder2 {
    int value = 1;
    Holder2 link;
    public Holder2(int val) { this.value = val; }
    
    public static void main(String[] args) {
    	
        final Holder2 a = new Holder2(5);        
        Holder2 b = new Holder2(10);
        a.link = b;
        
        
        System.out.println(a.link.value); //10
        
        
        
    }

   
}
