package br.usjt.meuprimeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public final static String MENSAGEM = "br.usjt.meuprimeiroapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mandaMensagem(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);//this é o contexto e display...class é pra onde deve mandar as informaçãoes
        EditText edt = (EditText) findViewById(R.id.campo_edita);//pega o valor do campo, pelo id, que esta na view
        String texto = edt.getText().toString();//uma string recebe o valor capturado da view e converte pra string
        intent.putExtra(MENSAGEM, texto);//manda por intent usando a constante e a string
        startActivity(intent);//inicia a outra activity
    }
}
