package grafos;
import java.util.List;
import java.util.ArrayList;

public class GrafoLigPoss {
	private int numVertices;
	private List<Aresta> matriz;
	
	public GrafoLigPoss(int vertices){
		numVertices = vertices;
		matriz = new ArrayList<>();
	}
	
	public void addAresta(int i, int j, int custo){
		Aresta conexao = new Aresta(i,j,custo);
		matriz.add(conexao);
	}
	
	public int getNumVertices(){
		return numVertices;
	}
}
