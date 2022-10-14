import java.io.*;


public class test {

	public static void main(String[] args) throws IOException {
		
/*
		BufferedReader br = new BufferedReader(new FileReader("data\\LiBai.txt"));
		char[] chs = new char[1024];
		int len;
		while ((len = br.read(chs)) != -1){
			System.out.print(new String(chs, 0, len));
		}
*/

		String command = "ipconfig";
		try {
			ProcessBuilder builder = new ProcessBuilder(command);
			Process p = builder.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));


			String line = null;
			while ((line = br.readLine()) != null){
				System.out.println(line);
			}


			int exitValue = p.waitFor();
			System.out.println("推出返回值: " + exitValue);


		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}
}
