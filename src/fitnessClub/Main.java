package fitnessClub;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // создали клиентов
        Client client0 = new Client("Иванов", "Александр", 1986);
        Client client1 = new Client("Петров", "Степан", 1979);
        Client client2 = new Client("Сидоров", "Кирилл", 1972);
        Client client3 = new Client("Кузнецов", "Виктор", 1982);
        Client client4 = new Client("Валов", "Владислав", 1988);
        Client client5 = new Client("Антонюк", "Сергей", 1965);

        String[] onceAbonementZones = {"Pool", "Gym"}; // названия зон для разового абонемента
        String[] dailyAbonementZones = {"Gym", "Group"}; // названия зон для дневного абонемента
        String[] fullAbonementZones = {"Pool", "Gym", "Group"}; // названия зон для полного абонемента

        LocalDate someDate0 = LocalDate.of(2018, 6, 12);  // дата начала действия абонемента
        LocalDate someDate1 = LocalDate.of(2022, 6, 12);  // дата конца действия абонемента
        OnceOnlyAbonement onceOnlyAbonement = new OnceOnlyAbonement(someDate0, someDate1); // разовый абонемент
        onceOnlyAbonement.setZonesNames(onceAbonementZones); // доступные зоны для объекта "разовый абонемент"

        LocalDate someDate2 = LocalDate.of(2017, 6, 12);  // дата начала действия абонемента
        LocalDate someDate3 = LocalDate.of(2021, 6, 12);  // дата конца действия абонемента
        DailyAbonement dailyAbonement0 = new DailyAbonement(someDate2, someDate3);  // дневной абонемент
        dailyAbonement0.setZonesNames(dailyAbonementZones); // доступные зоны
        DailyAbonement dailyAbonement1 = new DailyAbonement(someDate2, someDate3);  // дневной абонемент
        dailyAbonement1.setZonesNames(dailyAbonementZones); // доступные зоны

        LocalDate someDate4 = LocalDate.of(2017, 6, 12);  // дата начала действия абонемента
        LocalDate someDate5 = LocalDate.of(2021, 6, 12);  // дата конца действия абонемента
        FullAbonement fullAbonement0 = new FullAbonement(someDate4, someDate5);  // полный абонемент
        fullAbonement0.setZonesNames(fullAbonementZones); // доступные зоны
        FullAbonement fullAbonement1 = new FullAbonement(someDate4, someDate5);  // полный абонемент
        fullAbonement1.setZonesNames(fullAbonementZones); // доступные зоны
        FullAbonement fullAbonement2 = new FullAbonement(someDate4, someDate5);  // полный абонемент
        fullAbonement2.setZonesNames(fullAbonementZones); // доступные зоны

        Fitness fitness = new Fitness(); fitness.addClient(onceOnlyAbonement, "Pool");
        fitness.addClient(dailyAbonement0, "Gym"); fitness.addClient(dailyAbonement1, "Group");
        fitness.addClient(fullAbonement0, "Gym"); fitness.addClient(fullAbonement1, "Pool");
        fitness.addClient(fullAbonement2, "Group");
    }
}
