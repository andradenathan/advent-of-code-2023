import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
        public static List<String> getInput(String path) throws FileNotFoundException {
            List<String> input = new ArrayList<>();

            try {
                File file = new File(path);
                Scanner reader = new Scanner(file);
                while(reader.hasNextLine()) {
                    String inputData = reader.nextLine();
                    input.add(inputData);
                }
                return input;
            } catch (FileNotFoundException fileNotFoundException) {
                String message = String.format("Arquivo de caminho %s não encontrado", path);
                throw new FileNotFoundException(message);
            }
        }
}