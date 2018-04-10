package br.com.cotemig.instagramfake.app;

import android.app.Application;

import br.com.cotemig.instagramfake.services.RestService;
import br.com.cotemig.instagramfake.services.ServiceFeed;

/**
 * Created by dirceu on 06/04/2018.
 */

public class InstagramFakeApplication extends Application {

    private static String URL = "http://apiteste.fourtime.com/api/";

    private ServiceFeed serviceFeed;

    private static InstagramFakeApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        createService();
    }

    private void createService(){
        serviceFeed = (new RestService(URL)).getService(ServiceFeed.class);
    }

    public static InstagramFakeApplication getInstance() {
        return instance;
    }

    public ServiceFeed getServiceFeed() {
        return serviceFeed;
    }
}
