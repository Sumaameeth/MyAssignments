package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Size is 1280×720");
	}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computermodel();
		
	}

}
