package br.com.cervejaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Application {

	public static void main(String[] args) throws IOException {
		String caminho = "http://localhost:8080/cervejaria/clientes";
		URL url = new URL(caminho);
		InputStream inputStream = url.openConnection().getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
