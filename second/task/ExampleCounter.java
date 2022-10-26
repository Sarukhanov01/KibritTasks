package second.task;

import second.task.WordCounter;

public class ExampleCounter {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.take("Polad");
        wordCounter.take("Polad");
        wordCounter.take("Polad");
        wordCounter.take("Polad");
        wordCounter.take("Molad");
        wordCounter.take("Molad");
        wordCounter.take("Molad");
        System.out.println(wordCounter.count("Polad"));
        System.out.println(wordCounter.count("Molad"));
        wordCounter.take("abu");
        System.out.println(wordCounter.count("abu"));
    }
}
