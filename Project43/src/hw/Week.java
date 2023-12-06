package hw;

import javax.naming.OperationNotSupportedException;

public enum Week {
    MONDAY {
        public void toDayOfWeek() {
            System.out.println(1);
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void toDayOfWeek() {
        throw new RuntimeException();
    }
}
