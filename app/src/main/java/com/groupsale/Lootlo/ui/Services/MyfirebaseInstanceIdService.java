package com.groupsale.Lootlo.ui.Services;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyfirebaseInstanceIdService extends FirebaseMessagingService {
    public MyfirebaseInstanceIdService() {
    }

    @Override
    public void onNewToken(String token) {
        Log.d("Fcm Token", "Refreshed token: " + token);
        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(token);
    }

    private void sendRegistrationToServer(String token) {
    }
}

