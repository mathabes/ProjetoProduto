package br.com.fiap.main;
import br.com.fiap.modelo.*;
public class testeProduto {

	public static void main(String[] args) {
		Produto objProduto = new Produto();
		
		objProduto.setTipo("Refrigerante");
		objProduto.setMarca("Coca-Cola");
		objProduto.setQuant(20);
		objProduto.setPreco(8.99);
		
		System.out.println("Tipo: " + objProduto.getTipo() +
							"\n" + "Marca: " + objProduto.getMarca() +
							"\n" + "Quantidade: " + objProduto.getQuant() + " unidades" +
							"\n" + "Preço: R$" + objProduto.getPreco());
	}

}
