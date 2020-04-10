package fitnessClub;

import java.time.LocalDate;
import java.time.LocalTime;

public class Fitness {

    Zone zone0 = new Zone("Pool", 0, 20);
    Zone zone1 = new Zone("Gym", 0, 20);
    Zone zone2 = new Zone("Group", 0, 20);

    //Zone[] zones = {zone0, zone1, zone2};


    public void addClient(Abonement abonement, String zone) {      // метод добавления клиентов
        for (String zoneName: abonement.getZonesNames()) {         // перебираем все доступные зоны по названию
            if (zoneName.equals(zone)) {                           // если совпадение найдено
                if (getByName(zone).getUserCount() < getByName(zone).getMaxUserCount()) { // проверяем наличие свободных мест
                    if (abonement.drillDate.isBefore(LocalDate.now()) && abonement.drillEndDate.isAfter(LocalDate.now())) { //проверка даты
                        if (abonement.drillTime.isBefore(LocalTime.now()) && abonement.drillEndTime.isAfter(LocalTime.now())) { // пров. времени
                            getByName(zone).addAbonement(abonement);   // добавляем абонемент
                        }
                    }
                }
            }
        }
    }

    private Zone getByName(String name) {     // метод возвращает ту зону, в которую пытается попасть abonement
        if (name.equals(zone0.getZoneName()))
            return zone0;
        if (name.equals(zone1.getZoneName()))
            return zone1;
        if (name.equals(zone2.getZoneName()))
            return zone2;
        return zone2;       // если зона указана с ошибкой, вернется zone2
    }
}

/*if (abonement.getZones()[i].zoneName.equals(zone) && abonement.getZones()[i].userCount < abonement.getZones()[i].maxUserCount
                    && abonement.drillDate.isBefore(LocalDate.now()) && abonement.drillEndDate.isAfter(LocalDate.now())
                    && abonement.drillTime.isBefore(LocalTime.now()) && abonement.drillEndTime.isAfter(LocalTime.now())) {
                abonement.getZones()[i].addAbonement(abonement);
            }*/
