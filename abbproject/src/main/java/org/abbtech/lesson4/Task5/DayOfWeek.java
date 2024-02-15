package abbproject.src.main.java.org.abbtech.lesson4.Task5;

public enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public boolean isWeekend() {
        switch (this) { 
            case SATURDAY:
            case SUNDAY:
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.SATURDAY;
        System.out.println(today);
        System.out.println(today.isWeekend());

        DayOfWeek tomorrow = DayOfWeek.TUESDAY;
        System.out.println(tomorrow);
        System.out.println(tomorrow.isWeekend());
    }
}
