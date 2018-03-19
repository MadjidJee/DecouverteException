package Madjid.com;

import java.io.File;

public class ProjetException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File.createTempFile("", null);
		}catch (Exception erreur) {
			erreur.printStackTrace();
			
		}

	}

}
