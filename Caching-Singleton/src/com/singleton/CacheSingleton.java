package com.singleton;

import java.util.HashMap;
import java.util.Map;

public class CacheSingleton {
    private final Map<String, String> cache = new HashMap<>();

    private static CacheSingleton instance;

    private CacheSingleton() {
    }

    public static CacheSingleton getInstance() {
        if (instance == null) {
            synchronized (CacheSingleton.class) {
                if (instance == null)
                    instance = new CacheSingleton();
            }
        }
        return instance;
    }

    public void setInfo(String id, String item) {
        cache.put(id, item);
    }

    public String getInfo(String key) {
        return cache.get(key);
    }
}