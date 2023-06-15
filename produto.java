
public class produto {

	float peso, preco;
	String sku, nome, descr, fab, categ;
	public produto(int id, int cod_bar, float peso, float preco, String sku, String nome, String descr, String fab,
			String categ) {
		
		this.id = id;
		this.cod_bar = cod_bar;
		this.peso = peso;
		this.preco = preco;
		this.sku = sku;
		this.nome = nome;
		this.descr = descr;
		this.fab = fab;
		this.categ = categ;
	}
	int id, cod_bar;
	private float getPeso() {
		return peso;
	}
	private void setPeso(float peso) {
		this.peso = peso;
	}
	private float getPreco() {
		return preco;
	}
	private void setPreco(float preco) {
		this.preco = preco;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getDescr() {
		return descr;
	}
	private void setDescr(String descr) {
		this.descr = descr;
	}
	private String getFab() {
		return fab;
	}
	private void setFab(String fab) {
		this.fab = fab;
	}
	private String getCateg() {
		return categ;
	}
	private void setCateg(String categ) {
		this.categ = categ;
	}
	private int getId() {
		return id;
	}
	private int getCod_bar() {
		return cod_bar;
	}
	private String getSku() {
		return sku;
	}
	
}

