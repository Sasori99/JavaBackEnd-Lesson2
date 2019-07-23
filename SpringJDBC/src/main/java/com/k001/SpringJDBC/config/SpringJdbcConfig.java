//package com.k001.SpringJDBC.config;
//
//import javax.persistence.Basic;
//import javax.sql.DataSource;
//
//import com.k001.SpringJDBC.Employee;
//import com.k001.SpringJDBC.EmployeeDAO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@ComponentScan("com.k00.SpringJDBC.config")
//public class SpringJdbcConfig {
//
//    @Autowired
//    public EmployeeDAO employeeDAO = new EmployeeDAO();
//
//    @Bean
//    public DataSource mysqlDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
//        dataSource.setUsername("guest_user");
//        dataSource.setPassword("guest_password");
//        return dataSource;
//    }
//    @Bean
//    public void add(){
//        employeeDAO.setDataSource(mysqlDataSource());
//        employeeDAO.addEmplyee(1);
//    };
//}
