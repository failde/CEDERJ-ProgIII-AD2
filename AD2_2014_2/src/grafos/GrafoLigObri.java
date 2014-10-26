package grafos;
import java.util.List;
import java.util.ArrayList;

public class GrafoLigObri {
	private int numLigacoes;
	private int[] ponto = new int[2];
	private List<int[]> ligacoes;
	
	public GrafoLigObri(int i){
		numLigacoes = i;
		ligacoes = new ArrayList<>();
	}
	
	public void addLigacao(int i, int j){
		ponto[0] = i;
		ponto[1] = j;
		ligacoes.add(ponto);
	}
	
	public int getNumLigacoes(){
		return numLigacoes;
	}
	
	public int[] getPontos(int i){
		ligacoes.get(i-1);
		return ponto;
	}
}
