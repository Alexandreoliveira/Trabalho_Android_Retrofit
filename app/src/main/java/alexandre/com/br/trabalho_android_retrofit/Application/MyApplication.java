package alexandre.com.br.trabalho_android_retrofit.Application;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by projetos1 on 09/11/2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
