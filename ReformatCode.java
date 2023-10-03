// ReformatCode.java by Donato Zampini SB ID 114849209
import java.io.*;
import java.util.*;

public class ReformatCode {
	public static void main(String[] args) throws Exception {
		String filearg = args[0];
		Scanner input = new Scanner(new File(filearg));
		String output = "";
		while(input.hasNextLine()) {
			output += input.nextLine() + "\n";
		}
		output = output.replaceAll("\n*\\s*\\{","{");
		PrintWriter w = new PrintWriter(filearg);
		w.write(output);
		w.close();
		input.close();
	}
}
