package com.xjt.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/15 16:16
 */
@Component("student1")
public class Student implements Serializable {
    @Value("01")
    private String id;
    private String name;
    private Date birth;
    @Value("#{data1.size}")
    private String sex;
    @Autowired
    @Qualifier("data1")
    private Data1 data1;
    private Map list;
    @Value("#{data2}")
    private Data2 data2;
    public Student() {
    }

    public Student(String id, String name, Date birth, String sex) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }


    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Data1 getData1() {
        return data1;
    }

    public void setData1(Data1 data1) {
        this.data1 = data1;
    }

    public Map getList() {
        return list;
    }

    public void setList(Map list) {
        this.list = list;
    }

    public Data2 getData2() {
        return data2;
    }

    public void setData2(Data2 data2) {
        this.data2 = data2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", sex='" + sex + '\'' +
                ", data1='" + data1 + '\'' +
                ", list='" + list + '\'' +
                ", data2='" + data2 + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("init............");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("cleanUp................");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-beans.xml");
        Student student = (Student) applicationContext.getBean("student1");
        System.out.println(student);
        applicationContext.close();
        // jdbc
//        Connection con = dataSource.getConnection();
//        String sql = "update student set id = ? , sex = ? where name = ?";
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setString(1, "09");
//        ps.setString(2, "man");
//        ps.setString(3, "Maxsu");
//        int i = ps.executeUpdate();
//        if (i > 0 ){
//            System.out.println("successed!");
//        }
//        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
//        SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(dataSource);
//        String sql = "insert into student(id,name,birth,sex) values(?,?,?,?)";
//        List<Object[]> list = new ArrayList<>();
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("1", "tom1", new Date(), "male"));
//        students.add(new Student("2", "tom2", new Date(), "male"));
//        students.add(new Student("3", "tom3", new Date(), "male"));
//        for (Student student : students) {
//            list.add(new Object[]{student.getId(), student.getName(), student.getBirth(), student.getSex()});
//        }
//        jdbcTemplate.batchUpdate(sql, list);


       /* ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppMain.class);
        Object data1 = applicationContext.getBean("data1");
        Object data2 = applicationContext.getBean("data2");
        System.out.println(data1+","+data2);*/

    }

}
