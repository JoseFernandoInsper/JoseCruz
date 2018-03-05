package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;


public class LeLabirinto {{
	try{
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		while(br.ready()){
			String thisline = br.readLine();
			char[] line = thisline.toCharArray();
			
			for(int i =0; i< line.length; i++){
				if(line[i] == '#'){
					line[i] = 'X';
				}
			}
			System.out.println(line);
		}
		br.close();
	}
	catch(IOException ioe){
		ioe.printStackTrace();
	}

}}