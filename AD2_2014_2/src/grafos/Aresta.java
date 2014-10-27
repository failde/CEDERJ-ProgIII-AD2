package grafos;

public class Aresta {
	private Vertice vertice1 = null;
	private Vertice vertice2 = null;
	private float custo = Float.POSITIVE_INFINITY;
	
	public Aresta(Vertice i, Vertice j, float c){
		vertice1 = i;
		vertice2 = j;
		custo = c;
	}
	
	public Vertice getVertice1(){
		return vertice1;
	}
	
	public Vertice getVertice2(){
		return vertice2;
	}
	
	public float getCusto(){
		return custo;
	}
	
	public void setVertice1(Vertice v1){
		this.vertice1 = v1;
	}
	
	public void setVertice2(Vertice v2){
		this.vertice2 = v2;
	}
	
	public void setCusto(float c){
		this.custo = c;
	}
}
