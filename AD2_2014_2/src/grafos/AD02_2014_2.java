package grafos;
import java.io.*;
public class AD02_2014_2{
	public static void main(String[] args) throws IOException{
		BufferedReader arqLigPoss;
		BufferedReader arqLigObri;
		String linha;
		String[] vLinha;
		float[][] matrizAdj;
		int tamanhoMatriz;
		
		try{
			arqLigPoss = new BufferedReader(new FileReader(args[0]));
			arqLigObri = new BufferedReader(new FileReader(args[1]));
			
			//CONSTRÓI A MATRIZ DE ADJACENCIA COM AS LIGAÇÕES POSSÍVEIS
			while ((linha = arqLigPoss.readLine()) != null){
				vLinha = linha.split(" ");
				if(isNumber(vLinha[0])){
					tamanhoMatriz = Integer.parseInt(vLinha[0]);
					matrizAdj = new float[tamanhoMatriz][tamanhoMatriz];
					for(int i=0;i<tamanhoMatriz;i++){
						for(int j=0;j<tamanhoMatriz;j++){
							if (i != j)
								matrizAdj[i][j] = Float.POSITIVE_INFINITY;
							else
								matrizAdj[i][j] = 0;
						}
					}
					//CONSTROI AS OUTRAS LINHAS DO GRAFO
					while((linha = arqLigPoss.readLine()) != null){
						vLinha = linha.split(" ");
						matrizAdj[Integer.parseInt(vLinha[0]) - 1][Integer.parseInt(vLinha[1]) - 1] = Integer.parseInt(vLinha[2]);
						matrizAdj[Integer.parseInt(vLinha[1]) - 1][Integer.parseInt(vLinha[0]) - 1] = Integer.parseInt(vLinha[2]);
					}
					//IMPRESSÃO DA MATRIZ PARA TESTE
					imprimeMatriz(matrizAdj,tamanhoMatriz);
					break;
				}
			}
			/*
			//CONSTRÓI A LISTA DAS LIGAÇÕES OBRIGATÓRIAS
			while ((linha = arqLigPoss.readLine()) != null){
				vLinha = linha.split(" ");
				if(isNumber(vLinha[0])){
					matrizAdj = new float[Integer.parseInt(vLinha[0])][Integer.parseInt(vLinha[0])];
					//CONSTROI AS OUTRAS LINHAS DO GRAFO
					while((linha = arqLigPoss.readLine()) != null){
						vLinha = linha.split(" ");
						matrizAdj[Integer.parseInt(vLinha[0])][Integer.parseInt(vLinha[1])] = Integer.parseInt(vLinha[2]);
						matrizAdj[Integer.parseInt(vLinha[1])][Integer.parseInt(vLinha[0])] = Integer.parseInt(vLinha[2]);
					}
					break;
				}
			} */  
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
	public static boolean isNumber(String s){
		try{
			Integer.parseInt(s);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	public static void imprimeMatriz(float[][] matriz, int tamanhoMatriz){
		for(int i=0;i<tamanhoMatriz;i++){
			for(int j=0;j<tamanhoMatriz;j++){
				System.out.println("Ponto["+i+"]["+j+"] = "+matriz[i][j]);
			}
		}
	}
}

