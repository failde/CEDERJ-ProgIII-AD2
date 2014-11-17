package grafos;

public class GrafoMatrizAdj {
	private float[][] matrizAdj = null;
	private int tamMatriz;
	
	public GrafoMatrizAdj(){
	
	}
	
	public void criaMatriz(String tamanho){
		tamMatriz = Integer.parseInt(tamanho);
		matrizAdj = new float[tamMatriz][tamMatriz];
		for(int i=0;i<tamMatriz;i++){
			for(int j=0;j<tamMatriz;j++){
				if (i != j)
					matrizAdj[i][j] = Float.POSITIVE_INFINITY;
				else
					matrizAdj[i][j] = 0F;
			}
		}
	}
	
	public void criaMatriz(int tamanho){
		matrizAdj = new float[tamanho][tamanho];
		for(int i=0;i<tamanho;i++){
			for(int j=0;j<tamanho;j++){
				if (i != j)
					matrizAdj[i][j] = Float.POSITIVE_INFINITY;
				else
					matrizAdj[i][j] = 0F;
			}
		}
	}
	
	// MÉTODO CRIADO PARA VERIFICAR FUNCIONAMENTO DA CLASSE
	public void imprimeMatrizAdj(){
		for(int i=0;i<tamMatriz;i++){
			for(int j=0;j<tamMatriz;j++){
				System.out.println("Ponto["+i+"]["+j+"] = "+matrizAdj[i][j]);
			}
		}
	}
	
	public void addAresta(String v1, String v2, String c){
		matrizAdj[Integer.parseInt(v1) - 1][Integer.parseInt(v2) - 1] = Float.parseFloat(c);
		matrizAdj[Integer.parseInt(v2) - 1][Integer.parseInt(v1) - 1] = Float.parseFloat(c);
	}
	
	public boolean existeAresta(int v1, int v2){
		if (matrizAdj[v1][v2] != Float.POSITIVE_INFINITY)
			return true;
		return false;
	}
	
	public int getTamMatriz(){
		return tamMatriz;
	}
}
