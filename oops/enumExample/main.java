package oops.enumExample;

class main {

    enum Week {
        Monday, Tuesday, Wednessday, Thirsday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }
}
