package app.myfirstproject.zohoreducationalcenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class TeachersAdapter extends RecyclerView.Adapter<TeachersAdapter.TeachersDescHolder>{

    String TeacherName[];
    int Photos[];
    String TeacherDetails[];

    public TeachersAdapter(String[] teacherName, int[] photos, String[] teacherDetails) {
        TeacherName = teacherName;
        Photos = photos;
        TeacherDetails = teacherDetails;
    }

    @NonNull
    @Override
    public TeachersDescHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflator change xml   view  to java
        //parent.getContext it mean in each page which i am in
        View TeacherView= LayoutInflater.from(parent.getContext()).inflate(R.layout.showteacherdesc,parent,false);
        return new TeachersDescHolder(TeacherView);
    }

    @Override
    public void onBindViewHolder(@NonNull TeachersDescHolder holder, int position) {


        holder.tvTeacherName.setText(TeacherName[position]);
        holder.tvTeacherDetails.setText(TeacherDetails[position]);
        holder.ivteacherprofile.setImageResource(Photos[position]);
    }

    @Override
    public int getItemCount() {
        return Photos.length;
    }

    public class TeachersDescHolder extends RecyclerView.ViewHolder{


        CircleImageView ivteacherprofile;
        TextView tvTeacherName;
        TextView tvTeacherDetails;
        public TeachersDescHolder(@NonNull View itemView) {
            super(itemView);

            ivteacherprofile=itemView.findViewById(R.id.ivteacherprofile);
            tvTeacherName=itemView.findViewById(R.id.tvTeacherName);
            tvTeacherDetails=itemView.findViewById(R.id.tvTeacherDetails);

        }
    }
}
