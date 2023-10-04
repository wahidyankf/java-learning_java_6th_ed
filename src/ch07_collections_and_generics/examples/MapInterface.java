package ch07_collections_and_generics.examples;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
  public static void main(String[] args) {
    Map<String, Date> dateMap = new HashMap<String, Date>();
    dateMap.put("today", new Date());

    // res: {today=Wed Oct 04 07:12:33 WIB 2023}
    System.out.println(dateMap);

    var today = dateMap.get("today");
    // res: today=Wed Oct 04 07:12:33 WIB 2023
    System.out.println(today);
    // res: null
    System.out.println(dateMap.get("tomorrow"));

    dateMap.put("tomorrow", new Date(today.getTime() + 24 * 60 * 60 * 1000));

    // res: {tomorrow=Thu Oct 05 07:12:33 WIB 2023, today=Wed Oct 04 07:12:33 WIB
    // 2023}
    System.out.println(dateMap);
    // res: 2
    System.out.println(dateMap.size());

    // res: true
    System.out.println(dateMap.containsKey("today"));
    // res: true
    System.out.println(dateMap.containsValue(today));

    // res: [today, tomorrow]
    System.out.println(dateMap.keySet());
    // res: [Wed Oct 04 07:12:33 WIB 2023, Thu Oct 05 07:12:33 WIB 2023]
    System.out.println(dateMap.values());
    // res: [today=Wed Oct 04 07:12:33 WIB 2023, tomorrow=Thu Oct 05 07:12:33 WIB
    System.out.println(dateMap.entrySet());
  }

}
