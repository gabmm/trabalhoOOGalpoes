/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */
package gabrieloo.ufjf.galpoesestoque;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class Autenticacao
{

	public static String md5(String senha)
	{
		try
		{
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(senha.getBytes());
			byte[] d = m.digest();
			senha = DatatypeConverter.printHexBinary(d);
		}
		catch(NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		return senha;
	}

	public static Integer busca(String usuario, String senha)
	{
		try
		{
			BufferedReader leitura = new BufferedReader(new FileReader("login.csv"));
			String linha = null;
			while((linha = leitura.readLine()) != null)
			{
				if(usuario.equals(linha.split(",")[1]))
				{
					if(md5(senha).equals(linha.split(",")[2]))
					{
						return Integer.parseInt(linha.split(",")[0]);
					}
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return -1;
	}

	public static void grava(String usuario, String senha) {
		out:
		try
		{
			BufferedReader leitura = new BufferedReader(new FileReader("login.csv"));
			Integer id = new Integer(0);
			String linha = null;
			while((linha = leitura.readLine()) != null)
			{
				if(usuario.equals(linha.split(",")[1]))
				{
					System.out.println("Usuario já cadastrado!");
					break out;
				}
				else
				{
					id++;
				}
			}
			BufferedWriter escrita = new BufferedWriter(new FileWriter("login.csv"));
			escrita.write(Integer.valueOf(id)+","+usuario +","+ senha);
			escrita.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static Boolean getTempo() {
		try
		{
			File arquivo = new File("tempo.txt");
			if(arquivo.isFile())
			{
				BufferedReader leitura = new BufferedReader(new FileReader(arquivo));
				Long inicio = Long.parseLong(leitura.readLine());
				if(System.currentTimeMillis() - inicio > 60000)
				{
					arquivo.delete();
					return true;
				}
				return false;
			}
			return true;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public static void setTempo() {
		try
		{
			File arquivo = new File("tempo.txt");
			arquivo.createNewFile();
			BufferedWriter escrita = new BufferedWriter(new FileWriter(arquivo), 13);
			escrita.write(String.valueOf(System.currentTimeMillis()));
			escrita.close();

		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
