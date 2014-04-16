package src;

import java.io.File;
import java.util.Scanner;



public class Builder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input Starting Directory:");
		if(in.hasNextLine()){
			String aString = in.nextLine().toString();
			File aFile = new File(aString);
			if(!aFile.exists()){
				if(aFile.mkdir()){
					
					
					for(int i = 0; i < args.length; i++){
					File newDir2 = new File(aString +"/" + args[i]);
					newDir2.mkdir();
					}
					System.out.println("Directories Created.");
					System.out.println("Create files in Directories?");
					
					
				}
			}
			if(in.hasNextLine()){
			String answer = in.nextLine();
			if(answer.toUpperCase() == "Y" || answer.toUpperCase() == "YES"){
				while(in.hasNextLine()){
					
					System.out.println("What directory would you like to create files in?");
					if(in.hasNextLine()){
						answer = in.nextLine();
						File newDirs = new File(aString + "/" + answer);
						
						if(newDirs.exists()){
							System.out.println("List file names and extensions in space seperated list");
						}
					}
				}
			}
		}
		}
		
		
	}

}
