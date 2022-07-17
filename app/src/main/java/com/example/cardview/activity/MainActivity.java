package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerPost;
private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPost = findViewById(R.id.recyclerPost);

        //Define layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //Colocar layout na horizontal estilo navbar, tambem pode se usar gridlayout para por em por como catalogo
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerPost.setLayoutManager( layoutManager );

        //define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter( postagens);
        recyclerPost.setAdapter( adapter );

    }

    public void prepararPostagens(){
     Postagem p = new Postagem("Alan Modesto", "#Tbt Viagem Legal!", R.drawable.imagem1);
     this.postagens.add( p );

        Postagem p1 = new Postagem("Hotel Campaz", "Viaje, aproveite nossos descontos!", R.drawable.imagem2);
        this.postagens.add( p1 );

        Postagem p2 = new Postagem("Maria Luiza", "#Paris!!", R.drawable.imagem3);
        this.postagens.add( p2);

        Postagem p3 = new Postagem("Marcos Paulo", "Que foto Linda!", R.drawable.imagem4);
        this.postagens.add( p3 );
    }
}