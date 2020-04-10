package fitnessClub;

import java.time.LocalDate;
import java.time.LocalTime;

public class DailyAbonement extends Abonement {
    // дневной абонемент

    public DailyAbonement(LocalDate drillDate, LocalDate drillEndDate) {
        super(drillDate, drillEndDate);
        drillTime = LocalTime.of(8, 00);
        drillEndTime = LocalTime.of(16, 00);
    }

}
