public class Main {
    public static void main(String[] args) {
        var teacherA = 23;
        System.out.println("У Людмилы Павловны " +teacherA+ " ученика.");
        var teacherB = 27;
        System.out.println("У Анны Сергеевны " +teacherB+ " ученика.");
        var teacherC = 30;
        System.out.println("У Екатерины Андреевны " +teacherC+ " учеников.");
        var paper = 480;
        System.out.println("Всего было закуплено " +paper+ " листов.");
        var totalStudents = teacherA + teacherB + teacherC;
        System.out.println("Всего учеников " +totalStudents+ " человек.");
        var countOfPaper = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " +countOfPaper+ " листов бумаги.");
    }
}