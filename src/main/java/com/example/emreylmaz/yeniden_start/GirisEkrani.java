package com.example.emreylmaz.yeniden_start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Emre YILMAZ on 6.1.2015.
 */
public class GirisEkrani extends Activity  {
    Button giris;
    Button pas;

    EditText kullaniciAdi;
    EditText  sifre;
    //String id=kullaniciAdi.getText().toString();
   //String pass=sifre.getText().toString();
    TextView hataliGiris;
    CheckBox sifreGoster;
    String kullan = "a";
    String sifreli = "a";
    String deneme="a123";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris_ekrani);

        giris=(Button) findViewById(R.id.buttonGiris);
        pas=(Button) findViewById(R.id.buttonPas);
        kullaniciAdi=(EditText) findViewById(R.id.editTextAdiniz);
        sifre=(EditText)findViewById(R.id.editTextSifre);
        hataliGiris=(TextView)findViewById(R.id.textViewHata);
        sifreGoster=(CheckBox)findViewById(R.id.checkBoxSifreGoster);

       giris.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (kullaniciAdi.getText().toString()== "1" && sifre.getText().toString()== "a"){
                   Intent cagir =new Intent("android.intent.action.PARAEKRANI");
                   startActivity(cagir);
               }

           }
       });

       pas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent cagir =new Intent("android.intent.action.PARAEKRANI");
               startActivity(cagir);
           }
       });
        sifreGoster.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

          public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
              if (!isChecked) {
                  // show password
                 sifre.setTransformationMethod(PasswordTransformationMethod.getInstance());
              } else {
                  // hide password
                  sifre.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
              }
           }
         }
        );
    }
}

