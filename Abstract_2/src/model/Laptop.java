package model;



public class Laptop {
 private int id;
 private String cpu;
 private int ram;
 private String vga;

 public Laptop(int id, String cpu, int ram, String vga) {
     this.id = id;
     this.cpu = cpu;
     this.ram = ram;
     this.vga = vga;
 }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCpu() {
	return cpu;
}

public void setCpu(String cpu) {
	this.cpu = cpu;
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
}

public String getVga() {
	return vga;
}

public void setVga(String vga) {
	this.vga = vga;
}

}
