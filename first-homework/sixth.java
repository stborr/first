import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes:");
        int minutes = scanner.nextInt();
        int minutesYears = minutes / 525600;
        int minutesDays = minutes / 1440;
        System.out.println(minutes + " " + "minutes" + " " + "=" + " " + minutesYears + " " + "years");
        System.out.println(minutes + " " + "minutes" + " " + "=" + " " + minutesDays + " " + "days");

    }
}