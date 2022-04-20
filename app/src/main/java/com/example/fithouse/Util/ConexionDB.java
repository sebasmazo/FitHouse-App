package com.example.fithouse.Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import android.database.sqlite.*;

public class ConexionDB {

    //Error: Al ejecutar la app el dispositivo no tiene acceso a la base de datos, por lo tanto la única manera
    //de usar sqlite sería que el dispositivo movil cree la base de datos en memoria, y a su vez cargar todos los
    //datos correspondientes
    public static void connect(){
        Connection conn = null;
        try {
            //SQLiteDatabase db = SQLiteDatabase.openDatabase("db/fithouse.sqlite",null,0);
            //db.execSQL("select * from creatinas");
            //System.out.println("Working Directory = " + System.getProperty("user.dir"));
            //String url = "jdbc:sqlite:db/fithouse.sqlite";
            //conn = DriverManager.getConnection(url);
            //System.out.println("Conexión establecida");
        } finally {
            System.out.println("S");
            //if (conn != null) {
            //conn.close();
            //}
        }
    }

}
