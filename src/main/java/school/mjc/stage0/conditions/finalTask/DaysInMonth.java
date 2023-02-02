package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if (year < 0 || (month < 0 && month > 12)) {
            System.out.println("invalid date");
            return;
        }

        boolean isYearLeap;
        if (year % 400 == 0) {
            isYearLeap = true;
        } else {
            if (year % 100 == 0) {
                isYearLeap = false;
            } else if (year % 4 == 0) {
                isYearLeap = true;

            } else {
                isYearLeap = false;
            }
        }

       switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println(31);
            }
            case 4, 6, 9, 11 -> {
                System.out.println(30);
            }
            case 2 -> {
                System.out.println(isYearLeap ? 29 : 28);
            }
            default -> System.out.println("invalid date");
        }
    }
}
