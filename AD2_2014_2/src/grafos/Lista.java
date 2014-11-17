package grafos;

public class Lista {
	private int vertice;
	private Aresta proxAresta;
	private Lista proxLista;
	
	public Lista(int v){
		vertice = v;
		proxAresta = null;
		proxLista = null;
	}
	
	/*
	public Aresta pertence(int v){
		Aresta resp = proxAresta;
		while((resp != null) && (v != resp.getVertice()))
			resp = resp.getProxAresta();
		return resp;
	}
	*/
}
