package alexandre.com.br.trabalho_android_retrofit.service;

import java.util.List;

import alexandre.com.br.trabalho_android_retrofit.model.Candidata;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by projetos1 on 08/11/2017.
 */

public interface CandidataService {


    // nome do WebService que irá retornar a lista de dados
    @GET("lista_carros.php")
    Call<List<Candidata>> getCandidatas();

    // no POST deve-se colocar o nome do WebService PHP que irá receber os dados
    // cada campo do WS de inclusão deve ser indicado no Field
    // gravaProposta é o nome dado para a chamada do método

    /*
    @FormUrlEncoded
    @POST("insere_proposta.php")
    Call<Proposta> gravaProposta(@Field("cliente") String cliente,
                                 @Field("email") String email,
                                 @Field("proposta") String proposta,
                                 @Field("carro_id") int carro_id);*/

}
