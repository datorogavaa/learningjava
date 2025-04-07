import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter date = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Enter time for alarm in this \"HH:mm:ss\" format");
        String input = scanner.nextLine();
        LocalTime updated = LocalTime.parse(input, date);
        AlarmClock clock = new AlarmClock(updated);
        Thread thread = new Thread(clock);
        thread.start();
    }
}