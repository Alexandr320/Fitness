package fitnessClub;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Abonement {
    // родительский класс для создания 3-х дочерних
    private Client client; // создали ссылку на клиента
    public Client getClient() {  // создалии геттер клиента
        return client;
    }

    public void setClient(Client client) {  // создалии сеттер клиента
        this.client = client;
    }

    /*protected Zone[] zones;

    public Zone[] getZones() {
        return zones;
    }

    public void setZones(Zone[] zones) {
        this.zones = zones;
    }*/

    protected LocalDate drillDate; // дата регистрации начало
    protected LocalDate drillEndDate; // дата регистрации конец
    protected LocalTime drillTime; // разрешенное время начала занятия
    protected LocalTime drillEndTime; // разрешенное время окончания занятия

    protected String[] zonesNames;  // массив с названиями возможных зон

    public String[] getZonesNames() {
        return zonesNames;
    }

    public void setZonesNames(String[] zonesNames) {
        this.zonesNames = zonesNames;
    }

    public Abonement(LocalDate drillDate, LocalDate drillEndDate) {
        this.drillDate = drillDate;
        this.drillEndDate = drillEndDate;
    }

    public LocalDate getDrillDate() {
        return drillDate;
    }

    public void setDrillDate(LocalDate drillDate) {
        this.drillDate = drillDate;
    }

    public LocalDate getDrillEndDate() {
        return drillEndDate;
    }

    public void setDrillEndDate(LocalDate drillEndDate) {
        this.drillEndDate = drillEndDate;
    }

    public LocalTime getDrillTime() {
        return drillTime;
    }

    public void setDrillTime(LocalTime drillTime) {
        this.drillTime = drillTime;
    }

    public LocalTime getDrillEndTime() {
        return drillEndTime;
    }

    public void setDrillEndTime(LocalTime drillEndTime) {
        this.drillEndTime = drillEndTime;
    }
}
