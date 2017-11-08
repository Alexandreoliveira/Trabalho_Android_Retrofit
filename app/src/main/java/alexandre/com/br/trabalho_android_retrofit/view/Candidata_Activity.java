package alexandre.com.br.trabalho_android_retrofit.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import alexandre.com.br.trabalho_android_retrofit.R;

public class Candidata_Activity extends AppCompatActivity {

    private Toolbar mToolbar;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidata);

        this.context = this;
        this.mToolbar = (Toolbar) findViewById(R.id.tb_candidata);
        this.mToolbar.setTitle("Candidata ");
        setSupportActionBar(this.mToolbar);

    }
}
