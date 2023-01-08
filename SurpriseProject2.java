import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SurpriseProject2 {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        String path = "/Users/home/Desktop/zerobase/project/week1/Project1/src/textfile.txt";
        String contents = fileUtils.getLoadText(path).toUpperCase();
        int a = (int)'Z' - (int)'A' + 1;
        int[] alphabetCount = new int[a];

        int All = 0;

        for (int i = 0; i < contents.length(); i++) {
            if ('A' <= contents.charAt(i) && contents.charAt(i) <= 'Z') {
                int idx = (int) contents.charAt(i) - (int) 'A';
                alphabetCount[idx] = alphabetCount[idx] + 1;
                All ++;
            }
        }

        int all = Arrays.stream(alphabetCount).sum();
        System.out.println(alphabetCount.length);

        for (int i = 0; i < alphabetCount.length; i++) {
            System.out.printf("%c = %8d개,    %.2f%%\n",(char)(i+'A'), alphabetCount[i], (float)alphabetCount[i]/all*100);
        }
    }
}
