package bd.edu.nww.listviewdemo.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import bd.edu.nww.listviewdemo.model.Student;

public class StudentAdapter extends BaseAdapter {
    List<Student> studentList;
    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
