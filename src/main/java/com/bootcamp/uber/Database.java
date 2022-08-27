package com.bootcamp.uber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                "todo",
                "Turkey",
                false,
                false
        );

        User yasinUser = new User(
                "yasin",
                26,
                "ayasinuysal@gmail.com",
                "yasin123",
                "todo",
                "Turkey",
                false,
                false
        );

        User hamitUser = new User(
                "hamit",
                26,
                "hamitburakemre@gmail.com",
                "hamit123",
                "todo",
                "Turkey",
                false,
                false
        );

        userDB.put("ahmtbskaya", ahmetUser);
        userDB.put("ayasinuysal", yasinUser);
        userDB.put("hamitb", hamitUser);


        /*

        Create trip data for each user first

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
