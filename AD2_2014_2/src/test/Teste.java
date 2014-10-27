package test;

import java.io.IOException;
import grafos.*;

public class Teste {	
	public static void main(String[] args) throws IOException{
		String[] argumentos = {"/home/johnny/Documentos/Faculdade/5º Semestre/Prog III/ADs/Teste/ligacoes_possiveis.txt","/home/johnny/Documentos/Faculdade/5º Semestre/Prog III/ADs/Teste/ligacoes_obrigatorias.txt"};
		try{
			AD02_2014_2.main(argumentos);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}