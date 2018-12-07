package com.sesikova.android.marvel;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HeroActivity extends AppCompatActivity {

    TextView textView;
    Button moveButton;
    HeroView heroView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        ConstraintLayout conLayoyt;
        conLayoyt = (ConstraintLayout) findViewById(R.id.hero_layout);



        heroView = new HeroView(this);
        conLayoyt.addView(heroView);



         moveButton= (Button) findViewById(R.id.heroButton);


        //View.OnClickListener moveButtonClickListener = new View.OnClickListener() {
        //    @Override
         //   public void onClick(View v) {


          //  }
        //};
        //moveButton.setOnClickListener(moveButtonClickListener);


    }


    public void heroButtonClick(View view) {
        //moveButton.setText("Все ок)");
         heroView.changeIndex();




    }

    public void maxButtonClick(View view) {
        heroView.maxSize(2);
    }

    public void minButtonClick(View view) {
        heroView.minSize(2);
    }

}




