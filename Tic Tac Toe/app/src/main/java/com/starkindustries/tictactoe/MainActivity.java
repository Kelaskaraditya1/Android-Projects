package com.starkindustries.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int activeplayer=0;
    int gameState[]={2,2,2,2,2,2,2,2,2};
    int[][] winPositions ={{0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}};
    boolean gameActive=true;
    public void gameReset(View view)
    {
        gameActive=true;
        activeplayer=0;
        for(int i=0;i<gameState.length;i++)
        {
            gameState[i]=2;
        }
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView9)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView10)).setImageResource(0);
    }
    public void playertap(View view)
    {
        ImageView img = (ImageView) view;
        int tappedImage=Integer.parseInt(img.getTag().toString());
        if(!gameActive) {
            gameReset(view);
        }
        if(gameState[tappedImage]==2&&gameActive)
        {
            gameState[tappedImage] = activeplayer;
            img.setTranslationY(-1000f);
            if (activeplayer == 0) {
                img.setImageResource(R.drawable.x);
                activeplayer = 1;
                TextView statusbar=findViewById(R.id.statusbar);
                statusbar.setText("O's Turn - Tap to Play");
            } else {
                img.setImageResource(R.drawable.o2);
                activeplayer = 0;
                TextView statusbar=findViewById(R.id.statusbar);
                statusbar.setText("X's Turn - Tap to Play");
            }
            img.animate().translationYBy(1000f).setDuration(300);
        }
        for(int [] winPosition: winPositions)
        {
            if((gameState[winPosition[0]]==gameState[winPosition[1]])&&(gameState[winPosition[1]]==gameState[winPosition[2]])&&gameState[winPosition[0]]!=2)
            {
                String winner;
                gameActive=false;
                if(gameState[winPosition[0]]==0)
                    winner="X has Won";
                else
                    winner="O has Won";
                TextView statusbar=findViewById(R.id.statusbar);
                statusbar.setText(winner);
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}