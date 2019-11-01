package com.example.primenumexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i,m=0,flag=0;
        int n=20;//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){//m=9
                if(n%i==0){
                    System.out.println(n+" is not prime number");
               flag=1;

                    break;
                }
            }
            if(flag==0)  {
                System.out.println(n+" is prime number");
            }
        }//end of else
    }
}

