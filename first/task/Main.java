package first.task;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkingWithFile workingWithFile = new WorkingWithFile();
        List<String> strings =  workingWithFile.readFile();
        List<String> newStrings =  workingWithFile.separateAndMergeFormats(strings);
        workingWithFile.writeToFile(newStrings);
    }
}
