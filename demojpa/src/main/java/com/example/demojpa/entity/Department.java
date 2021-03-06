package com.example.demojpa.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
/*
 * 
     * @ClassName: Department
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月18日
     *
 */
@Entity
@Table(name = "tbl_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 主键ID

    private String name; // 部门名称
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    /**
     * joinColumns 用来指定中间表中关联自己ID的字段 inverseJoinColumns 用来指定中间表中关联对方ID的字段
     */
    // @JoinTable(name = "tbl_employee_department", joinColumns = {
    // 		@JoinColumn(name = "department_id") }, inverseJoinColumns = { @JoinColumn(name = "employee_id") })
    private List<Employee> employees; // 部门员工

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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
