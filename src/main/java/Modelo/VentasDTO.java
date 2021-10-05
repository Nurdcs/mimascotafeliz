package Modelo;

public class VentasDTO {
private int codigo;
private long cedula;
private long Cedula_Usuario;
private double ivaventa;
private double totalventa;
private double valorventa;
public VentasDTO( long cedula, long cedula_Usuario, double ivaventa, double totalventa,
		double valorventa) {
	super();
	
	this.cedula = cedula;
	Cedula_Usuario = cedula_Usuario;
	this.ivaventa = ivaventa;
	this.totalventa = totalventa;
	this.valorventa = valorventa;
}








public int getCodigo() {
	return codigo;
}








public void setCodigo(int codigo) {
	this.codigo = codigo;
}








public VentasDTO(int codigo, long cedula, long cedula_Usuario, double ivaventa, double totalventa, double valorventa) {
	super();
	this.codigo = codigo;
	this.cedula = cedula;
	Cedula_Usuario = cedula_Usuario;
	this.ivaventa = ivaventa;
	this.totalventa = totalventa;
	this.valorventa = valorventa;
}








public long getCedula() {
	return cedula;
}
public void setCedula(long cedula) {
	this.cedula = cedula;
}
public long getCedula_Usuario() {
	return Cedula_Usuario;
}
public void setCedula_Usuario(long cedula_Usuario) {
	Cedula_Usuario = cedula_Usuario;
}
public double getIvaventa() {
	return ivaventa;
}
public void setIvaventa(double ivaventa) {
	this.ivaventa = ivaventa;
}
public double getTotalventa() {
	return totalventa;
}
public void setTotalventa(double totalventa) {
	this.totalventa = totalventa;
}
public double getValorventa() {
	return valorventa;
}
public void setValorventa(double valorventa) {
	this.valorventa = valorventa;
}

}
