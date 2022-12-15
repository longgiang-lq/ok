package com.example.employeemanagementwebapp.repository;

import com.example.employeemanagementwebapp.dto.*;
import com.example.employeemanagementwebapp.model.Employee;
import com.example.employeemanagementwebapp.model.EmployeeKey;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeKey> , JpaSpecificationExecutor<Employee> {

    @Query(
            "SELECT new com.example.employeemanagementwebapp.dto.DanhSachDaXem(ep.MaCoPhieu,ep.DinhGia)" +
                    "FROM Employee ep WHERE ep.MaCoPhieu ='TSV' OR ep.MaCoPhieu =:macophieu"
    )
    DanhSachDaXem DanhSachDaXem(String macophieu);

    @Query(
            "SELECT new com.example.employeemanagementwebapp.dto.DoanhThu(ep.DTQ1,ep.DTQ2,ep.DTQ3,ep.DTQ4,ep.DTKehoach) " +
                    "FROM Employee ep WHERE ep.MaCoPhieu =:macophieu"
    )
    List<DoanhThu> Doanhthu(String macophieu);

    @Query(
            "SELECT new com.example.employeemanagementwebapp.dto.LoiNhuan(ep.LNQ1,ep.LNQ2,ep.LNQ3,ep.LNQ4,ep.LNKehoach) " +
                    "FROM Employee ep WHERE ep.MaCoPhieu =:macophieu"
    )
    List<LoiNhuan> LoiNhuan(String macophieu);

    @Query(
            "SELECT new com.example.employeemanagementwebapp.dto.VonHoa(ep.EPS,ep.PE,ep.ROE,ep.VCSH,ep.SLCP,ep.Bookvalue,ep.PB,ep.ROA,ep.BienLoiNhuan) " +
                    "FROM Employee ep WHERE ep.MaCoPhieu =:macophieu"
    )
    List<VonHoa> VonHoa(String macophieu);

    @Query(
            "SELECT new com.example.employeemanagementwebapp.dto.TongHop(ep.CoTuc,ep.TienMat,ep.CoPhieu) " +
                    "FROM Employee ep WHERE ep.MaCoPhieu = :macophieu"
    )
    List<TongHop> Tonghop(String macophieu);




}
