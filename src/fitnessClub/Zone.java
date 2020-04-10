package fitnessClub;

public class Zone {
    // класс для создания 3-х зон
    String zoneName;            // название зоны (Pool, Gym, Group)
    int userCount;              // текущее число клиентов (абонементов) в зоне
    int maxUserCount = 20;      //  макс. число клиентов (абон-в) в зоне
    Abonement[] abonements = new Abonement[100]; // список абонементов

    public void addAbonement(Abonement abonement) {
        for (int i = 0; i < abonements.length; i++) {
            if (abonements[i] == null) {
                abonements[i] = abonement;
                break;
            }
        }
    }

    public Zone(String zoneName, int userCount, int maxUserCount) {
        this.zoneName = zoneName;
        this.userCount = userCount;
        this.maxUserCount = maxUserCount;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getMaxUserCount() {
        return maxUserCount;
    }

    public void setMaxUserCount(int maxUserCount) {
        this.maxUserCount = maxUserCount;
    }

    public Abonement[] getAbonements() {
        return abonements;
    }

    public void setAbonements(Abonement[] abonements) {
        this.abonements = abonements;
    }
}
