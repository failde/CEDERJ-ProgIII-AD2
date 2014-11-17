package grafos;

public class Aresta {
	private int vertice;
	private int custo;
	private Aresta proxAresta;
	
	public Aresta(int v, int c){
		vertice = v;
		custo = c;
		proxAresta = null;
	}
	
	public int getVertice(){
		return vertice;
	}
	
	public int getCusto(){
		return custo;
	}
	
	public Aresta getProxAresta(){
		return proxAresta;
	}
	
	public String toString(){
		String resp = vertice + ": " + custo + "\n";
		return resp;
	}
}
