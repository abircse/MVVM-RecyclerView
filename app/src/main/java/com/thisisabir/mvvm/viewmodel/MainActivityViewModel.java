package com.thisisabir.mvvm.viewmodel;

import com.thisisabir.mvvm.model.Student;
import com.thisisabir.mvvm.repository.StudentRepository;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<Student>> students;
    private StudentRepository repository;

    public void init()
    {
        if (students != null)
        {
            return;
        }
        repository = StudentRepository.getInstance();
        students = repository.getStudentdata();

    }
    public LiveData<List<Student>> getstudentdata(){
        return students;
    }
}
