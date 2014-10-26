package grafos;

public class Aresta {
	private int vertice;
	private int custo;
	private Aresta aresta;
	
	public Aresta(int i, int j, int c){
		vertice = i;
		custo = c;
		aresta = new Aresta(j,i,c);
	}
	
	public int getVertice(){
		return vertice;
	}
	
	public int getCusto(){
		return custo;
	}
	
	public Aresta getAresta(){
		return aresta;
	}
	
	public int getVerticeAresta(){
		return aresta.getVertice();
	}
}
