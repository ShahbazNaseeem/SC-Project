package shahbazproject;





import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filing {

	public void writeDetails() throws IOException
	{
		FileWriter fw = new FileWriter("E:/Details.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(Display.name);
		bw.newLine();
		bw.write(Display.phone);
		bw.newLine();
		bw.write(Display.cnic);
		bw.newLine();
		bw.write(Display.date);
		bw.newLine();
		String route = Display.From + " to " + Display.to;
		bw.write(route);
		bw.newLine();
		bw.write(Display.flightname);
		bw.newLine();
		bw.write(Display.timings);
		bw.newLine();
		bw.append(Display.type);
		bw.newLine();
		bw.close();
		fw.close();
	}
}

