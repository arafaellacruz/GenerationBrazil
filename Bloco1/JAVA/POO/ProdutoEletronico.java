package POO;

public class ProdutoEletronico {
	
	/*
	 *  e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
	 */
	
	public String nomeDoProduto;
	public String cor;
	public String marca;
	public String modelo;
	
	public ProdutoEletronico(String nomeDoProduto, String cor, String marca, String modelo) {
	
		this.nomeDoProduto = nomeDoProduto;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo; }
				
			
	public void imprimirInfo() {
		System.out.println("O produto "+nomeDoProduto+" na cor "+cor+", referente a marca "+marca+" e modelo "+modelo+" está disponível para compra.");
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
