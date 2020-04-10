package fitnessClub;

public class Logger {
    // здесь будут методы вывода информации в консоль (static)
    public static void log(Abonement abonement, Zone zone) {  //печать информации
        System.out.println("Фамилия  " + abonement.getClient().soname);
        System.out.println("Имя  " + abonement.getClient().name);
        System.out.println("Вид занятия  " + zone.zoneName);
        System.out.println("Дата посещения  " + abonement.getDrillDate());
        System.out.println("Время посещения  " + abonement.getDrillTime());
    }

}
