import java.util.Scanner;

public class EventTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format: Dia HH : MM : SS
        String s1 = sc.nextLine(); // "Dia 5"
        String[] d1 = s1.split(" ");
        int startDay = Integer.parseInt(d1[1]);

        String t1 = sc.nextLine(); // "08 : 12 : 23"
        String[] startTime = t1.split(" : ");
        int startHour = Integer.parseInt(startTime[0]);
        int startMin = Integer.parseInt(startTime[1]);
        int startSec = Integer.parseInt(startTime[2]);

        String s2 = sc.nextLine(); // "Dia 9"
        String[] d2 = s2.split(" ");
        int endDay = Integer.parseInt(d2[1]);

        String t2 = sc.nextLine(); // "06 : 13 : 23"
        String[] endTime = t2.split(" : ");
        int endHour = Integer.parseInt(endTime[0]);
        int endMin = Integer.parseInt(endTime[1]);
        int endSec = Integer.parseInt(endTime[2]);

        // Total seconds from start
        int totalStartSec = startDay * 24 * 3600 + startHour * 3600 + startMin * 60 + startSec;
        int totalEndSec = endDay * 24 * 3600 + endHour * 3600 + endMin * 60 + endSec;

        int diff = totalEndSec - totalStartSec;

        int days = diff / (24 * 3600);
        diff %= 24 * 3600;
        int hours = diff / 3600;
        diff %= 3600;
        int minutes = diff / 60;
        int seconds = diff % 60;

        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
    }
}
