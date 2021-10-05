package Modelo;

public class DetalleVentaDTO {
	private long codigodetalleventa;
	private int cantidadproducto;
	private long codigoventa;
	private long codigoproducto;
	private double valortotal;
	private double valorventa;
	private double valoriva;
	public DetalleVentaDTO( int cantidadproducto, long codigoventa, long codigoproducto,
			double valortotal, double valorventa, double valoriva) {
		
		
		this.cantidadproducto = cantidadproducto;
		this.codigoventa = codigoventa;
		this.codigoproducto = codigoproducto;
		this.valortotal = valortotal;
		this.valorventa = valorventa;
		this.valoriva = valoriva;
	}
	public long getCodigodetalleventa() {
		return codigodetalleventa;
	}
	public void setCodigodetalleventa(long codigodetalleventa) {
		this.codigodetalleventa = codigodetalleventa;
	}
	public int getCantidadproducto() {
		return cantidadproducto;
	}
	public void setCantidadproducto(int cantidadproducto) {
		this.cantidadproducto = cantidadproducto;
	}
	public long getCodigoventa() {
		return codigoventa;
	}
	public void setCodigoventa(long codigoventa) {
		this.codigoventa = codigoventa;
	}
	public long getCodigoproducto() {
		return codigoproducto;
	}
	public void setCodigoproducto(long codigoproducto) {
		this.codigoproducto = codigoproducto;
	}
	public double getValortotal() {
		return valortotal;
	}
	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}
	public double getValorventa() {
		return valorventa;
	}
	public void setValorventa(double valorventa) {
		this.valorventa = valorventa;
	}
	public double getValoriva() {
		return valoriva;
	}
	public void setValoriva(double valoriva) {
		this.valoriva = valoriva;
	}
	
	
	
	
	
}
