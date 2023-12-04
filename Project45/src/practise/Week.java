package practise;

public enum Week {
    MONDAY("mon") {
        @Override
        public void toDayOfWeek() {
            System.out.println("Day number = " + 1);
        }
    },
    TUESDAY("tue"),
    WEDNESDAY("wed"),
    THURSDAY("thu"),
    FRIDAY("fri") {
        @Override
        public void toDayOfWeek(){
            System.out.println("Day number = " + 5);
        }
    },
    SATURDAY("sat"),
    SUNDAY("sun");

    private final String formattedName;

    private Week(String formattedName){
        this.formattedName = formattedName;
    }

    public String getFormattedName() {
        return this.formattedName;
    }

    public void toDayOfWeek() {
        System.out.println("Common day number");
    }
}
