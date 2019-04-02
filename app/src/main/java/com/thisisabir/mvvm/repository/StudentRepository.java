package com.thisisabir.mvvm.repository;

import com.thisisabir.mvvm.model.Student;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.MutableLiveData;

public class StudentRepository {

    private static StudentRepository instant;
    private List<Student> data = new ArrayList<>();

    public static StudentRepository getInstance()
    {
        if (instant == null)
        {
            instant = new StudentRepository();
        }
        return instant;
    }

    public MutableLiveData<List<Student>> getStudentdata()
    {
        setStudentdata();
        MutableLiveData<List<Student>> mdata = new MutableLiveData<>();
        mdata.setValue(data);
        return mdata;

    }

    private void setStudentdata() {
        data.add(new Student("CBIU Programming Club", "http://www.coxtunes.com/client_mobile_app_project/education/cbiu/api/gallery/cbiupc.jpg"));
        data.add(new Student("CBIU Book Fair", "http://www.coxtunes.com/client_mobile_app_project/education/cbiu/api/gallery/bookfair.jpg"));
        data.add(new Student("CBIU Compitition", "http://www.coxtunes.com/client_mobile_app_project/education/cbiu/api/gallery/compitition.jpg"));
    }
}
