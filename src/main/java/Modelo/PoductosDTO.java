package Modelo;

public class PoductosDTO {
private long codigoproducto;
private double ivacompra;
private long nitproveedor;
private String nombreproducto;
private double preciocompra;
private double precioventa;
public PoductosDTO(long codigoproducto, double ivacompra, long nitproveedor, String nombreproducto, double preciocompra,
		double precioventa) {

	this.codigoproducto = codigoproducto;
	this.ivacompra = ivacompra;
	this.nitproveedor = nitproveedor;
	this.nombreproducto = nombreproducto;
	this.preciocompra = preciocompra;
	this.precioventa = precioventa;
}




public PoductosDTO(long codigoproducto) {
	super();
	this.codigoproducto = codigoproducto;
}




public long getCodigoproducto() {
	return codigoproducto;
}
public void setCodigoproducto(long codigoproducto) {
	this.codigoproducto = codigoproducto;
}
public double getIvacompra() {
	return ivacompra;
}
public void setIvacompra(double ivacompra) {
	this.ivacompra = ivacompra;
}
public long getNitproveedor() {
	return nitproveedor;
}
public void setNitproveedor(long nitproveedor) {
	this.nitproveedor = nitproveedor;
}
public String getNombreproducto() {
	return nombreproducto;
}
public void setNombreproducto(String nombreproducto) {
	this.nombreproducto = nombreproducto;
}
public double getPreciocompra() {
	return preciocompra;
}
public void setPreciocompra(double preciocompra) {
	this.preciocompra = preciocompra;
}
public double getPrecioventa() {
	return precioventa;
}
public void setPrecioventa(double precioventa) {
	this.precioventa = precioventa;
}






}
