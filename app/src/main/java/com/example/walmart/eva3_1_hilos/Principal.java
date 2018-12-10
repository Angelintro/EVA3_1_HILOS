package com.example.walmart.eva3_1_hilos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Runnable RHilo = new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<12;i++){
                    Log.wtf("Runnable",i+"");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {//Detener
                        e.printStackTrace(); }
                }
                }
                };


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Thread THilo = new Thread(RHilo);
        THilo.start();
        CHilo CRHilo = new CHilo();
        CRHilo.start();
    }

} class  CHilo extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i =0; i<12;i++){
            Log.wtf("Thread",i+"");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
            }
            }

