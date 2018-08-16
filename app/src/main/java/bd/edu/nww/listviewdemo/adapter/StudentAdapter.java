package bd.edu.nww.listviewdemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import bd.edu.nww.listviewdemo.R;
import bd.edu.nww.listviewdemo.model.Student;

public class StudentAdapter extends BaseAdapter {
    private List<Student> studentList;
    private Context mContext;

    public StudentAdapter(List<Student> studentList, Context context) {
        this.studentList = studentList;
        mContext = context;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_student, viewGroup,false);
        TextView studentName = itemView.findViewById(R.id.textView_studentName);
        TextView studentRollNo = itemView.findViewById(R.id.textView_studentRollNo);

        final Student student = studentList.get(position);
        studentName.setText(student.getStudentName());
        studentRollNo.setText(student.getStudentRollNo());

       /* studentName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, );
                intent.putExtra("Student_name", student.getStudentName());



            }
        });*/
        return itemView;
    }
}
