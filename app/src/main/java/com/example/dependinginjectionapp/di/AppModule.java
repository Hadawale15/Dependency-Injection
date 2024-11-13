package com.example.dependinginjectionapp.di;

import com.example.dependinginjectionapp.MyRepository;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Provides
    public MyRepository provideMyRepository() {
        return new MyRepository();
    }
}

