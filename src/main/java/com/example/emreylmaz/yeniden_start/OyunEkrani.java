package com.example.emreylmaz.yeniden_start;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Emre YILMAZ on 6.1.2015.
 */
public class OyunEkrani extends Activity {
Button arttir,azalt,deneBakalim;
    TextView sayi,para,yonlendirme;
    int tutulanSayi=0,gosterilenSayi=12,kazanilanPara=100;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oyun_ekrani);
        arttir=(Button)findViewById(R.id.buttonArttır);
        azalt=(Button)findViewById(R.id.buttonAzalt);
        deneBakalim=(Button)findViewById(R.id.buttonDene);
        sayi=(TextView)findViewById(R.id.textViewSayi);
        para=(TextView)findViewById(R.id.textViewKazanc);
        yonlendirme=(TextView)findViewById(R.id.textViewYonlendirme);
        Random r = new Random();
        tutulanSayi=1+r.nextInt(20);

        arttir.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        gosterilenSayi++;
        sayi.setText(gosterilenSayi +"");

    }
});
    azalt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gosterilenSayi--;
            sayi.setText(gosterilenSayi+"");

        }
    });

    deneBakalim.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(tutulanSayi==gosterilenSayi){
                para.setText(kazanilanPara+50+"$");
              // para.setTextColor('#FF99D514');
               // para.setTextColor(FF99D514);

                kazanilanPara+=50;
                Random r = new Random();
                tutulanSayi=1+r.nextInt(20);
                yonlendirme.setText("TEBRİKLER DOĞRU TAHMİN");
            }
            else if (tutulanSayi>gosterilenSayi)
            {
                yonlendirme.setText("↑ SAYINIZI ARTTIRIN ↑");

                para.setText(kazanilanPara-5+"$");
                kazanilanPara-=5;
            }
            else if (tutulanSayi<gosterilenSayi)
            {
                yonlendirme.setText("↓ SAYINIZI AZALTIN ↓");

                para.setText(kazanilanPara-5+"$");
                kazanilanPara-=5;
            }

        }
    });




    }
}
