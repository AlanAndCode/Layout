package com.example.cardview.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {
    private List<Postagem>  postagens;
    public PostagemAdapter(List<Postagem> listaPostagens) {
 this.postagens =listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);
return new MyViewHolder(itemLista);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = postagens.get( position );
holder.textNome.setText(postagem.getNome());
holder.textPost.setText(postagem.getPostagem());
holder.imagePost.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView textNome;
        private final TextView textPost;
        private final ImageView imagePost;

        public MyViewHolder(View itemView){
     super(itemView);
     textNome = itemView.findViewById(R.id.textNome);
            textPost = itemView.findViewById(R.id.textPost);
            imagePost = itemView.findViewById(R.id.imagePost);

        }

    }
}
