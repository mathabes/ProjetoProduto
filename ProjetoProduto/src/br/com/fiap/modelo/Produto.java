package br.com.fiap.modelo;
public class Produto {
	private String tipo;
	private String marca;
	private int quant;
	private double preco;
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setQuant(int quant){
		this.quant = quant;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
	public String getTipo(){
		return tipo;
	}
	public String getMarca(){
		return marca;
	}
	public int getQuant(){
		return quant;
	}
	public double getPreco(){
		return preco;
	}
}
