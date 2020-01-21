package app.myfirstproject.zohoreducationalcenter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TeacherDescription extends AppCompatActivity {

    String TeacherNames[]={"Arif Naweed","Zahir Sultani","Abdull Ahmad"};
    int photos[]={R.drawable.ic_launcher_background,R.drawable.logo,R.drawable.photo};
    String TeacherDetails[]={"details1","details2","details3"};

    RecyclerView rvteacherdesc;
    //it shows our data vertically
    LinearLayoutManager manager;
    TeachersAdapter TeacherAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_description);

        rvteacherdesc=findViewById(R.id.rvteacherdesc);
        manager=new LinearLayoutManager(TeacherDescription.this,LinearLayoutManager.VERTICAL,false);
        rvteacherdesc.setLayoutManager(manager);


        TeacherAdapter=new TeachersAdapter(TeacherNames,photos,TeacherDetails);
        rvteacherdesc.setAdapter(TeacherAdapter);
    }
}
