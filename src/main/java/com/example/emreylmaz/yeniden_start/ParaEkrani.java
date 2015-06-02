package com.example.emreylmaz.yeniden_start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Emre YILMAZ on 6.1.2015.
 */
public class ParaEkrani extends Activity {
   Button btBasla;
   EditText editTextPara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.para_ekrani);
        btBasla=(Button)findViewById(R.id.buttonBasla);
        editTextPara=(EditText)findViewById(R.id.editTextPara);
btBasla.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent cagir =new Intent("android.intent.action.OYUNEKRANI");
        startActivity(cagir);
    }
});

    }
}
