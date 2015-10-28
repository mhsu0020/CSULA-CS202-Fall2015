package quiz;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Quiz4 {

	public static void writeIntegerListToFile(ArrayList<Integer> numbers, String fileName){
		Path path = Paths.get("C:\\Users\\Michael\\Desktop\\"+fileName);

		Charset charset = Charset.forName("US-ASCII");
		//This opens or creates an existing file
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
			for (int i = 0; i < numbers.size(); i++) {
				writer.write(String.valueOf(numbers.get(i)));
				writer.newLine();
			}
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Quiz4.writeIntegerListToFile(numbers, "Quiz4.txt");
		Path path = Paths.get("C:\\Users\\Michael\\Desktop\\lyrics.txt");
		String pathString = path.toString();
		System.out.println(pathString.substring(0, pathString.indexOf('.')));
	}

}
