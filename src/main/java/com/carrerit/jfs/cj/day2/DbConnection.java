package com.carrerit.jfs.cj.day2;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DbConnection {

    private static List<DbConnection> list;

    static {
        list = List.of(new DbConnection(), new DbConnection(), new DbConnection());
    }

    private DbConnection() {

    }

    public static DbConnection getInstance(){
        int index = ThreadLocalRandom.current().nextInt(0,3);
        return list.get(index);
    }


}
