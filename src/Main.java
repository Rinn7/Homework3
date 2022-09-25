public class Main {
    public static void main(String[] args) {
        short totalCount = 120;
        System.out.println("Всего было закуплено " +totalCount+ " банок краски");
        short white = 2;
        short brown = 4;
        int forOneClass = white + brown;
        System.out.println("На каждый класс было отведено " +white+ " банки белой краски и " +brown+ " банки коричневой краски");
        int classesCount = totalCount/forOneClass;
        System.out.println("Всего в школе " +classesCount+ " классов");
        int whiteForClasses = classesCount * white;
        int brownForClasses = classesCount * brown;
        System.out.println("В школе, где " +classesCount+ " классов, нужно " +whiteForClasses+ " банок белой краски и " +brownForClasses+ " банок коричневой краски");
    }
}