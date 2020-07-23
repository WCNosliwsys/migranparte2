package com.ditec.migranparte2;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;

import androidx.annotation.Nullable;

import java.io.IOException;

public class miIntentServiciecargarmusica extends IntentService {
    public miIntentServiciecargarmusica() {
        super("IntentServiceOperacion");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            Multimedia3.mediaPlayer.setDataSource("https://www.partnersinrhyme.com/pir/libs/media/Arabian_Salsa_2.wav");
            Multimedia3.mediaPlayer.prepare();
        } catch (IOException e) {
        }
    }
}
