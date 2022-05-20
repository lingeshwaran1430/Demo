package org.tort;

public class Desktop implements Software,HardWare {
	
	public void desktopModel() {
		System.out.println("desktopModel is 0.8");
	}

	@Override
	public void softwareResources() {
		System.out.println("softwareResources is SW");
		
	}

	@Override
	public void hardwaResources() {
		System.out.println("hardwaResources is O/D");
		
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareResources();
		d.hardwaResources();
	}

	
}
