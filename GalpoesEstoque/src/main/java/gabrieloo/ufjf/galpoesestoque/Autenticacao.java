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

	public static boolean busca(String usuario, String senha)
	{
		try
		{
			BufferedReader leitura = new BufferedReader(new FileReader("login.txt"));
			String line = null;
			while((line = leitura.readLine()) != null)
			{
				String u = line.split(",")[0];
			String p = line.split(",")[1];
				senha = md5(senha);
				if(u.equals(usuario))
				{
					if(p.equals(senha))
					{
						return true;
					}
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public static void grava(String usuario, String senha) {
		try
		{
			/*if(busca(usuario, senha))
			{
				System.out.println("Usuario já cadastrado!");
			}
			else
			{*/
				BufferedWriter escrita = new BufferedWriter(new FileWriter(new File("login.txt")));
				escrita.write(usuario +","+ senha);
				escrita.close();
			//}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
