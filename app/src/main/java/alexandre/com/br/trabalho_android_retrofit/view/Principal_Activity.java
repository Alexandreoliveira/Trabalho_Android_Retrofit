package alexandre.com.br.trabalho_android_retrofit.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.wang.avi.AVLoadingIndicatorView;

import java.util.List;

import alexandre.com.br.trabalho_android_retrofit.R;
import alexandre.com.br.trabalho_android_retrofit.adapter.CandidataAdapter;
import alexandre.com.br.trabalho_android_retrofit.model.Candidata;
import alexandre.com.br.trabalho_android_retrofit.service.CandidataService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Principal_Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Toolbar mToolbar;
    private Context context;
    private AVLoadingIndicatorView avLoadingIndicatorView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        this.context = this;
        this.mToolbar = (Toolbar) findViewById(R.id.tb_principal);
        this.mToolbar.setTitle("Lista de Candidatas");
        setSupportActionBar(this.mToolbar);

        this.recyclerView = (RecyclerView) findViewById(R.id.recycler_principal);
        this.recyclerView.setHasFixedSize(true);
        this.linearLayoutManager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.avLoadingIndicatorView = (AVLoadingIndicatorView) findViewById(R.id.loader_candidatas);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://binarity.com.br/ws_senac/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CandidataService service = retrofit.create(CandidataService.class);

        Call<List<Candidata>> candidatas = service.getCandidatas();
        candidatas.enqueue(new Callback<List<Candidata>>() {

            @Override
            public void onResponse(Call<List<Candidata>> call,
                                   Response<List<Candidata>> response) {
                if (response.isSuccessful()) {
                    List<Candidata> lista = response.body();
                    avLoadingIndicatorView.hide();
                    CandidataAdapter adapter = new CandidataAdapter(lista);
                    recyclerView.setAdapter(adapter);

                } else {
                    avLoadingIndicatorView.hide();
                }
            }

            @Override
            public void onFailure(Call<List<Candidata>> call, Throwable t) {
                avLoadingIndicatorView.hide();
            }
        });


    }
}
