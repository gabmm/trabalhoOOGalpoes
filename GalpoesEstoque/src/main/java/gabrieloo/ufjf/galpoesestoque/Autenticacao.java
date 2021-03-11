/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */
package gabrieloo.ufjf.galpoesestoque;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
public class Autenticacao {
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
public static void auth(String usuario, String senha) {

String line = null;

try
{
	BufferedReader scan = new BufferedReader(new FileReader("login.txt"));
	while((line = scan.readLine()) != null){
		String u = line.split(",")[0];
		String p = line.split(",")[1];
		senha = md5(senha);
		System.out.println("Senha entrada: "+senha);
		if(u.equals(usuario)){
			if(p.equals(senha)){
				System.out.println("Bem-vindo, "+u);
				break;
			}
			else{
				System.out.println("Senha incorreta");
			}
		}
		else{
			System.out.println("Usuário inválido!");
		}
	}
}
catch(IOException ex)
{
	System.out.println("Erro");
}
}
}
