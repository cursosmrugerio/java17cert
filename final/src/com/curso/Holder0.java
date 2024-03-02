package com.curso;

class Holder0 {
    int value = 1;
    Holder0 link;
    public Holder0(int val) { this.value = val; }
    
    public static void main(String[] args) {
    	
        final Holder0 a = new Holder0(5);
        
        System.out.println(a.value);//5
        System.out.println(a.link.value);//NullPointerException
        
    }

   
}
