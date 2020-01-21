package app.myfirstproject.zohoreducationalcenter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        textView1=findViewById(R.id.textView1);

        textView1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(homepage.this,history.class);
                startActivity(intent);
            }
        });



        textView2=findViewById(R.id.textView2);

        textView2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(homepage.this,TestResult.class);
                startActivity(intent);
            }
        });


        textView3=findViewById(R.id.textView3);

        textView3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(homepage.this,TeacherDescription.class);
                startActivity(intent);
            }
        });


        textView4=findViewById(R.id.textView4);

        textView4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(homepage.this,TimeTable.class);
                startActivity(intent);
            }
        });


        textView5=findViewById(R.id.textView5);

        textView5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(homepage.this,ContactUs.class);
                startActivity(intent);
            }
        });
    }

}
