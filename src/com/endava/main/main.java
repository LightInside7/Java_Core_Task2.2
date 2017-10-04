package com.endava.main;

import com.endava.model.LruCache;
import com.endava.model.User;

public class Main {
    public static LruCache<Integer, User> test = new LruCache<>(50);
    private static User user = new User();

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            test.put(user.getId() + i, new User(("Name" + i), i));
        }
        System.out.println(test);
        test.put(user.getId() + 51, new User(("Name" + 51), 51));
        System.out.println(test);
    }
}
