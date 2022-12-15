package com.example.employeemanagementwebapp.service;

import com.example.employeemanagementwebapp.dto.*;
import com.example.employeemanagementwebapp.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
    DanhSachDaXem DanhSachDaXem(String macophieu);


    List<DoanhThu> Doanhthu(String macophieu);
    List<LoiNhuan> LoiNhuan(String macophieu);
    List<VonHoa> VonHoa(String macophieu);
    List<TongHop> Tonghop(String macophieu);



}
