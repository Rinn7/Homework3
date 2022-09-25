public class Main {
    public static void main(String[] args) {
        byte teacherA = 23;
        System.out.println("У Людмилы Павловны " +teacherA+ " ученика.");
        byte teacherB = 27;
        System.out.println("У Анны Сергеевны " +teacherB+ " ученика.");
        byte teacherC = 30;
        System.out.println("У Екатерины Андреевны " +teacherC+ " учеников.");
        short paper = 480;
        System.out.println("Всего было закуплено " +paper+ " листов.");
        byte totalStudents = (byte) (teacherA + teacherB + teacherC);
        System.out.println("Всего учеников " +totalStudents+ " человек.");
        short countOfPaper = (short) (paper / totalStudents);
        System.out.println("На каждого ученика рассчитано " +countOfPaper+ " листов бумаги.");
    }
}