package grafos;

import java.io.*;

public class AD02_2014_2{
	public static void main(String[] args) throws IOException{
		BufferedReader arqLigPoss;
		BufferedReader arqLigObri;
		String linha;
		String[] vLinha;
		GrafoMatrizAdj ligPoss = new GrafoMatrizAdj();
		
		try{
			//LÊ OS ARQUIVOS E PÕE NO BUFFER
			arqLigPoss = new BufferedReader(new FileReader(args[0]));
			arqLigObri = new BufferedReader(new FileReader(args[1]));
			
			//CONSTRÓI A MATRIZ DE ADJACENCIA COM AS LIGAÇÕES POSSÍVEIS
			while ((linha = arqLigPoss.readLine()) != null){
				vLinha = linha.split(" ");
				if(isNumber(vLinha[0])){
					ligPoss.criaMatriz(vLinha[0]);
					
					//ADICIONA AS ARESTAS A MATRIZ
					while((linha = arqLigPoss.readLine()) != null){
						vLinha = linha.split(" ");
						ligPoss.addAresta(vLinha[0], vLinha[1], vLinha[2]);
					}
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
			
			//IMPRESSÃO PARA TESTE
			ligPoss.imprimeMatrizAdj();
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
	
}

