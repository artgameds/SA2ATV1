package sp.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity implements Runnable{

    Thread Thread;
    Handler handler;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        Thread = new Thread(this);
        Thread.start();

            }
        @Override
    public void run(){
         i = 1;

         try{
             while(i<100){
             Thread.sleep(15);
                 handler.post(new Runnable() {
                 @Override
                 public void run() {
                     i++;
                 }
             });
             }
         }catch(Exception e){

            }
            finish();
            startActivity(new Intent(this,cadastroActivity.class));
        }
        }













