package alexandre.com.br.trabalho_android_retrofit.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import alexandre.com.br.trabalho_android_retrofit.R;
import alexandre.com.br.trabalho_android_retrofit.model.Candidata;
import alexandre.com.br.trabalho_android_retrofit.view.Candidata_Activity;

/**
 * Created by Alexandre Meireles Oliveira on 09/11/2017.
 */

public class CandidataAdapter extends RecyclerView.Adapter<CandidataAdapter.CandidataViewHolder> {

    private List<Candidata> mCandidatas;


    public CandidataAdapter(List<Candidata> mCandidatas) {
        this.mCandidatas = mCandidatas;
    }

    private void goPerfilCandidata(Context context, Candidata candidata) {
        Intent intent = new Intent(context, Candidata_Activity.class);
        intent.putExtra("id", candidata.getId());
        intent.putExtra("nome", candidata.getNome());
        intent.putExtra("adicional", candidata.getAdicional());
        intent.putExtra("foto", candidata.getFoto());
        context.startActivity(intent);
    }


    @Override
    public CandidataAdapter.CandidataViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_recycler_candidatas, viewGroup, false);
        return new CandidataAdapter.CandidataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CandidataAdapter.CandidataViewHolder holder, int position) {

        final Candidata candidata = mCandidatas.get(position);

        holder.nome.setText(candidata.getNome());
        holder.adicional.setText(candidata.getAdicional());
        holder.foto.setImageURI(candidata.getFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPerfilCandidata(view.getContext(), candidata);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.mCandidatas.size();
    }

    protected static class CandidataViewHolder extends RecyclerView.ViewHolder {

        protected TextView nome;
        protected TextView adicional;
        protected SimpleDraweeView foto;

        public CandidataViewHolder(View itemView) {
            super(itemView);
            this.nome = itemView.findViewById(R.id.nome_recycler);
            this.foto = itemView.findViewById(R.id.foto_recycler);
            this.adicional = itemView.findViewById(R.id.adicional_recycler);

        }
    }


}