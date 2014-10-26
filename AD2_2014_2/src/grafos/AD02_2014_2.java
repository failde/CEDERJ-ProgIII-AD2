package grafos;
import java.io.*;
public class AD02_2014_2{
	public static void main(String[] args) throws IOException{
		BufferedReader arqLigPoss;
		BufferedReader arqLigObri;
		String linha;
		String[] vLinha;
		int[][] ligPoss;
		
		try{
			arqLigPoss = new BufferedReader(new FileReader(args[0]));
			arqLigObri = new BufferedReader(new FileReader(args[1]));
			
			//CONSTRÓI A MATRIZ DE ADJACENCIA COM AS LIGAÇÕES POSSÍVEIS
			while ((linha = arqLigPoss.readLine()) != null){
				vLinha = linha.split(" ");
				if(isNumber(vLinha[0])){
					ligPoss = new int[Integer.parseInt(vLinha[0])][Integer.parseInt(vLinha[0])];
					//Constroi as outras linhas do grafo
					while((linha = arqLigPoss.readLine()) != null){
						vLinha = linha.split(" ");
						ligPoss[Integer.parseInt(vLinha[0])][Integer.parseInt(vLinha[1])] = Integer.parseInt(vLinha[2]);
						ligPoss[Integer.parseInt(vLinha[1])][Integer.parseInt(vLinha[0])] = Integer.parseInt(vLinha[2]);
					}
					break;
				}
			}
			
			//CONSTRÓI A LISTA DAS LIGAÇÕES OBRIGATÓRIAS
			while ((linha = arqLigPoss.readLine()) != null){
				vLinha = linha.split(" ");
				if(isNumber(vLinha[0])){
					matriz = new int[Integer.parseInt(vLinha[0])][Integer.parseInt(vLinha[0])];
					//Constroi as outras linhas do grafo
					while((linha = arqLigPoss.readLine()) != null){
						vLinha = linha.split(" ");
						matriz[Integer.parseInt(vLinha[0])][Integer.parseInt(vLinha[1])] = Integer.parseInt(vLinha[2]);
						matriz[Integer.parseInt(vLinha[1])][Integer.parseInt(vLinha[0])] = Integer.parseInt(vLinha[2]);
					}
					break;
				}
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}

