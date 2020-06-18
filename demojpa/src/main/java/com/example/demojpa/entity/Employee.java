package com.example.demojpa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
/*
 * 
     * @ClassName: Employee
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月18日
     *
 */
@Entity
@Table(name = "tbl_employee") // 指定关联的数据库的表名
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // 主键ID

    private String name; // 姓名

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday; // 生日
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    // @PrimaryKeyJoinColumn(name = "employee_id", referencedColumnName = "address_id")
    private Address address; // 地址

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Department department; // 部门

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "tbl_employee_role", joinColumns = {@JoinColumn(name = "employee_id")}, inverseJoinColumns = {
            @JoinColumn(name = "role_id")})
    private List<Role> roles; // 角色

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                ", department=" + department +
                ", roles=" + roles +
                '}';
    }
}