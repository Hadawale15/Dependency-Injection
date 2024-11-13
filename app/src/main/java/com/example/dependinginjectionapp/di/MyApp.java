package com.example.dependinginjectionapp.di;

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class MyApp extends Application {
    // Hilt setup for the app-wide dependency container
}
