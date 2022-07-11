package Zones;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args)throws Exception{
        Instant instant = Instant.now();
        // for(String zone : ZoneId.getAvailableZoneIds()){
        //     System.out.println(zone);
        // }


        ZoneId.getAvailableZoneIds()
            .stream()
            .sorted()
            .forEach(
                zoneIdNome -> System.out.printf(
                    "%-40s %-10s >> %s %n",
                    zoneIdNome,
                    offset(ZoneId.of(zoneIdNome), instant),
                    localTime(ZoneId.of(zoneIdNome), instant), instant)
                );
    }

    static String offset(ZoneId zoneId, Instant instant){
        return ZonedDateTime.ofInstant(instant, zoneId).getOffset().toString();
    }

    static String localTime(ZoneId zoneId, Instant instant){

        return ZonedDateTime.ofInstant(instant, zoneId).format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}
