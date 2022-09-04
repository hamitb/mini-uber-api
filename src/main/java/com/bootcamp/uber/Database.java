package com.bootcamp.uber;

import java.util.*;

public class Database {
    private static Map<String, User> userDB = new HashMap<>();
    private static Map<User, List<Trip>> tripDB = new HashMap<>();

    static
    {
        User ahmetUser = new User(
                "ahmet",
                26,
                "ahmetbskaya@gmail.com",
                "ahmet123",
                "10.07.1997",
                "Turkey",
                false,
                false
        );

        User yasinUser = new User(
                "yasin",
                26,
                "ayasinuysal@gmail.com",
                "yasin123",
                "26.12.1995",
                "Turkey",
                false,
                true
        );

        User hamitUser = new User(
                "hamit",
                26,
                "hamitburakemre@gmail.com",
                "hamit123",
                "10.10.1996",
                "Turkey",
                false,
                false
        );

        userDB.put("ahmtbskaya", ahmetUser);
        userDB.put("ayasinuysal", yasinUser);
        userDB.put("hamitb", hamitUser);

        Driver driverMehmet = new Driver(
                "Mehmet Ross",
                "1",
                "Doblo",
                "mehmet131415",
                "mehmetr@gmail.com"
        );

        Driver driverJack = new Driver(
                "Jack Mark",
                "2",
                "BMW",
                "jack131415",
                "jackmark@gmail.com"
        );

        Driver driverYusuf = new Driver(
                "Yusuf Miroğlu",
                "3",
                "Volvo",
                "deliyurek123",
                "deliyurek@gmail.com"
        );

        Address address1 = new Address(
                "2nd",
                "3564",
                "Ireland"
        );

        Address address2 = new Address(
                "Dublin",
                "3562",
                "Ireland"
        );

        Address address3 = new Address(
                "Ataturk",
                "34602",
                "Turkey"
        );

        Address address4 = new Address(
                "Kurak",
                "35641",
                "Turkey"
        );

        Trip hamitTrip1 = new Trip (
                hamitUser,
                "completed",
                Arrays.asList(address1,address2),
                "10.08.2021 15:03",
                "10.08.2021 15:32",
                false,
                driverMehmet,
                driverMehmet.getVehicleType(),
                "15.03€"
        );

        Trip hamitTrip2 = new Trip (
                hamitUser,
                "completed",
                Arrays.asList(address2,address1),
                "10.08.2021 19:30",
                "10.08.2021 20:05",
                true,
                driverJack,
                driverJack.getVehicleType(),
                "16.00€"
        );

        List<Trip> hamitTrips = new ArrayList<Trip>();
        hamitTrips.add(hamitTrip1);
        hamitTrips.add(hamitTrip2);

        tripDB.put(hamitUser,hamitTrips);
        /*
        Put Trips in Database;

        tripDB.put(hamitUser, hamitTrips);
        tripDB.put(ahmetUser, ahmetTrips);
        tripDB.put(yasinUser, yasinTrips);

         */
    }

    public static Map<String, User> getUserDB() {
        return userDB;
    }

    public static Map<User, List<Trip>> getTripDB() {
        return tripDB;
    }
}
