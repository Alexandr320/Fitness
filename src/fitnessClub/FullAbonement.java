package fitnessClub;

import java.time.LocalDate;
import java.time.LocalTime;

public class FullAbonement extends Abonement {
    // полный абонемент

    public FullAbonement(LocalDate drillDate, LocalDate drillEndDate) {
        super(drillDate, drillEndDate);
        drillTime = LocalTime.of(8, 00);
        drillEndTime = LocalTime.of(22, 00);
    }
}
