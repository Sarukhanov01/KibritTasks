package first.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class WorkingWithFile {
    private Path inputPath = Paths.get("C:/Users/Polad Sarukhanov/Desktop/input1[507].txt");
    private Path outputPath = Paths.get("C:/Users/Polad Sarukhanov/Desktop/output1[507].txt");


    public List<String> readFile() {
        List<String> strings = new ArrayList<>();
        try {
            strings = Files.readAllLines(inputPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strings;
    }
    public List<String> separateAndMergeFormats(List<String> strings){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        List<Date> dates = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        List<String> strs = new ArrayList<>();
        //Date formatter
        String regex = "[0-9]+";

        for (var item :
                strings) {
            if (item.matches(regex)) nums.add(Integer.valueOf(item));

            else if (item.length() > 9) {
                try {
                    dates.add(dateFormat.parse(item));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            } else strs.add(item);
        }
        Collections.sort(dates);
        Collections.sort(nums);
        Collections.sort(strs);

        for (var item :
                nums) {
            strs.add(item.toString());
        }

        for (var item :
                dates) {
            strs.add(dateFormat.format(item));
        }
        return strs;
    }

    public void writeToFile(List<String> strings){
        try {
            Files.write(outputPath,strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
