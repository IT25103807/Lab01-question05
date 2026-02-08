public class MarathonConverter {
    public static void main(String[] args) {
        int miles;
        int yards;
        double kilometers;

        miles = 26;
        yards = 385;

        double milesFromYards = yards / 1760.0;
        double totalMiles = miles + milesFromYards;
        kilometers = totalMiles * 1.609;

        System.out.println(kilometers);
    }
}