import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        var input = Utils.getInput("C:\\Users\\andra\\IdeaProjects\\advent-of-code\\day1\\in");
        int output = 0;

        for (String data : input) {
            String leftNumber = "";
            String rightNumber = "";

            for (int j = 0; leftNumber.length() == 0; j++) {
                try {
                    leftNumber = String.valueOf(Integer.parseInt(String.valueOf(data.charAt(j))));
                } catch (Exception e) {
                }
            }

            for (int j = data.length(); rightNumber.length() == 0; j--) {
                try {
                    rightNumber = String.valueOf(Integer.parseInt(String.valueOf(data.charAt(j))));
                } catch (Exception e) {}
            }

            output += Integer.parseInt(leftNumber + rightNumber);
        }
        System.out.println(output);
    }
}