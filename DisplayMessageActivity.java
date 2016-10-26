package br.usjt.meuprimeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();//Serve para pegar o intent vindo da outra activity
        String mensagem = intent.getStringExtra(MainActivity.MENSAGEM);//salva numa string o intent que está vindo, por meio da constante MENSAGEM
        TextView textView = new TextView(this);//Passando o contexto para um textView
        textView.setTextSize(40);//Seta o tamanho do textView
        textView.setText(mensagem);//Seta o conteudo

        ViewGroup layout = (ViewGroup)findViewById(R.id.activity_display_message);//Casting activity para ViewGroup
        layout.addView(textView);//Adiciona o ViewGroup
    }
}
