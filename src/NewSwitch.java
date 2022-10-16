enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class NewSwitch {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SUNDAY;

        switch (day) {
            case MONDAY -> System.out.println("Понеділок");
            case TUESDAY -> System.out.println("Вівторок");
            case WEDNESDAY -> System.out.println("Середа");
            case THURSDAY -> System.out.println("Четвер");
            case FRIDAY -> System.out.println("П'ятниця");
            case SATURDAY, SUNDAY -> System.out.println("Вихідний день");
        }
    }
}
