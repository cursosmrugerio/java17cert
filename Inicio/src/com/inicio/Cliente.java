package com.inicio;

public class Cliente extends Object {
	
	public Cliente(String nombreCompleto, String curp) {
		this.nombreCompleto = nombreCompleto;
		this.curp = curp;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Cliente other = (Cliente) obj;
//		return Objects.equals(curp, other.curp);
//	}

	String nombreCompleto;
	String curp;
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Patrobas","xzc100");
		Cliente c2 = new Cliente("Patrobas","xzc100");
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));  
	}

}
