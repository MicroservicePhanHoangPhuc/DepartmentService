package com.example.microservice_crud_khoa.service;

import com.example.microservice_crud_khoa.entity.Department;
import com.example.microservice_crud_khoa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

//    public Department findDepartment() {
//        return List<Department> departmentRepository.findAll();
//    }
}
