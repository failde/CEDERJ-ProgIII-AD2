package grafos;
import java.io.*;

public class AD02_2014_2{
	
	public static void main(String[] args) throws IOException{
		BufferedReader arqLigPoss;
		BufferedReader arqLigObri;
		String linha;
		String[] vLinha;
		int[] parametrosGrafo = new int[3];
		GrafoLigPoss ligacoesPossiveis = null;
							
		try{
			//Os caminhos dos arquivos utilizados foram passados por argumento
			//e serão pegos no args[]
			
			arqLigPoss = new BufferedReader(new FileReader(args[0]));
			arqLigObri = new BufferedReader(new FileReader(args[1]));
			
			//Linhas de Teste - Verificar se pegou a Strings passadas no Args[]
			System.out.println(args[0]);
			System.out.println(args[1]);
			//Fim da Linha de Teste
			
			//Procura o numero de vertices na primeira linha com numero e inicializa o Grafo
			while ((linha = arqLigPoss.readLine()) != null){
				vLinha = linha.split(" ");
				if(isNumber(vLinha[0])){
					ligacoesPossiveis = new GrafoLigPoss(Integer.parseInt(vLinha[0]));
					//Constroi as outras linhas do grafo
					while((linha = arqLigPoss.readLine()) != null){
						vLinha = linha.split(" ");
						ligacoesPossiveis.addAresta(parametrosGrafo[0], parametrosGrafo[1], parametrosGrafo[2]);
					}
					break;
				}
			}
			arqLigPoss.close();
			arqLigObri.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		//TESTE//
		
		System.out.println(ligacoesPossiveis.getNumVertices());
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
}
