package fitnessClub;

public class Client {
    // инфа о клиентах: фамилия, имя, год рождения, вид занятия, дата и время посещения
    protected String soname; // фамилия
    protected String name; // имя
    protected int bornYear; // год рождения

    public Client(String soname, String name, int bornYear) {
        this.soname = soname;
        this.name = name;
        this.bornYear = bornYear;
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }
}
