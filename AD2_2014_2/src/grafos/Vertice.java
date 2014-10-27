package grafos;

public class Vertice {
	private int id;
	
	public Vertice(int v){
		id = v;
	}
	
	//ESTE CONSTRUTOR DEVE SER DESTRUIDO CASO
	//NÃO SEJA NECESSÁRIO
	public Vertice(String v){
		id = Integer.parseInt(v);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
