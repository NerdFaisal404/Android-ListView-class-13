package bd.edu.nww.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bd.edu.nww.listviewdemo.adapter.StudentAdapter;
import bd.edu.nww.listviewdemo.model.Student;

public class MainActivity extends AppCompatActivity {

    private String[] student;
    private ListView mListViewStudent;
    //private List<Student> studentList;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListViewStudent = findViewById(R.id.listView_student);
       /* student = new String[5];
        student[0] = "Messine";
        student[1] = "Raju";
        student[2] = "Tariqul";
        student[3] = "Mamun";
        student[4] = "Rayhan";*/

      /*  Student studentModel = new Student("Faisal", "1210305900");
        studentList.add(studentModel);

        StudentAdapter studentAdapter = new StudentAdapter(studentList);*/

       /* ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, student);
        mListViewStudent.setAdapter(arrayAdapter);

        mListViewStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String studentName = mListViewStudent.getItemAtPosition(position).toString();
                //String studentName2 = adapterView.getItemAtPosition(position).toString();


                Toast.makeText(MainActivity.this, studentName, Toast.LENGTH_SHORT).show();

            }
        });*/

        studentList = new ArrayList<>();
        studentList.add(new Student("Raj", "20151103"));
        studentList.add(new Student("Raj2", "20151104"));
        studentList.add(new Student("Raj3", "20151105"));
        studentList.add(new Student("Raj4", "20151106"));
        studentList.add(new Student("Raj5", "20151107"));
        studentList.add(new Student("Raj6", "20151108"));

        StudentAdapter studentAdapter = new StudentAdapter(studentList, this);
        mListViewStudent.setAdapter(studentAdapter);


    }
}
