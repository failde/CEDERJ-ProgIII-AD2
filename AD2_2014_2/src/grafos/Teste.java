package grafos;
import java.io.IOException;
public class Teste {	
	public static void main(String[] args) throws IOException{
		String[] argumentos = {"/home/johnny/Facul/5º Semestre/Prog III/ADs/Teste/ligacoes_possiveis.txt","/home/johnny/Facul/5º Semestre/Prog III/ADs/Teste/Fazer_ligacoes.txt"};
		try{
			AD02_2014_2.main(argumentos);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}