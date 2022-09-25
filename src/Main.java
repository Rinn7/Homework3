public class Main {
    public static void main(String[] args) {
        short bottleCount = 16;
        short time1 = 2;
        System.out.println("Машина за " +time1+ " минуты изготавливает " +bottleCount+ " бутылок.");
        byte time2 = 20;
        int workA = ( bottleCount * time2 ) / time1;
        System.out.println("За " +time2+ " минут машина изготавливает " +workA+ " бутылок.");
        short time3 = 1440;
        int workB = ( bottleCount * time3 ) / time1;
        System.out.println("За " +time3+ " минут(сутки) машина изготавливает " +workB+ " бутылок.");
        short time4 = 4320;
        int workC = ( bottleCount * time4 ) / time1;
        System.out.println("За " +time4+ " минут(3 дня) машина изготавливает " +workC+ " бутылок.");
        int time5 = 43200;
        int workD = ( bottleCount * time5 ) / time1;
        System.out.println("За " +time5+ " минут(1 месяц) машина изготавливает " +workD+ " бутылок.");
    }
}