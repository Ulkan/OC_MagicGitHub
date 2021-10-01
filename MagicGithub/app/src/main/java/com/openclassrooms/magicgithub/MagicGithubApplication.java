package com.openclassrooms.magicgithub;

import android.app.Application;
import android.content.Context;

import com.openclassrooms.magicgithub.di.Injection;
import com.openclassrooms.magicgithub.repository.UserRepository;

import androidx.annotation.VisibleForTesting;

public class MagicGithubApplication extends Application {

    // Small change here to send toast from FakeApiService when there is no NEW user to add randomly
    private static Context context;

    public void onCreate() {
        super.onCreate();
        MagicGithubApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MagicGithubApplication.context;
    }

    private UserRepository userRepository;

    public UserRepository getUserRepository() {
        if (userRepository == null) userRepository = Injection.createUserRepository();
        return userRepository;
    }

}
