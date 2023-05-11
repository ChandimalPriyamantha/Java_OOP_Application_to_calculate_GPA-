package Marks;

import ConnectionDB.OperationDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Marks {

    private String RegNo;
    private double Quiz01;

    private double Quiz02;

    private double Quiz03;

    private double Quiz04;

    private double Assignment01;

    private double Assignment02;

    private double Practical;
    private double Theory;

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        RegNo = regNo;
    }

    public double getQuiz01() {
        return Quiz01;
    }

    public void setQuiz01(double quiz01) {
        Quiz01 = quiz01;
    }

    public double getQuiz02() {
        return Quiz02;
    }

    public void setQuiz02(double quiz02) {
        Quiz02 = quiz02;
    }

    public double getQuiz03() {
        return Quiz03;
    }

    public void setQuiz03(double quiz03) {
        Quiz03 = quiz03;
    }

    public double getQuiz04() {
        return Quiz04;
    }

    public void setQuiz04(double quiz04) {
        Quiz04 = quiz04;
    }

    public double getAssignment01() {
        return Assignment01;
    }

    public void setAssignment01(double assignment01) {
        Assignment01 = assignment01;
    }

    public double getAssignment02() {
        return Assignment02;
    }

    public void setAssignment02(double assignment02) {
        Assignment02 = assignment02;
    }

    public double getPractical() {
        return Practical;
    }

    public void setPractical(double practical) {
        Practical = practical;
    }

    public double getTheory() {
        return Theory;
    }

    public void setTheory(double theory) {
        Theory = theory;
    }

    public List<Marks> list(){

        List<Marks> list = new ArrayList<Marks>();

        try{
            Connection con = OperationDB.getConnection();
            String sql = "SELECT * FROM  marks";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                Marks marks = new Marks();

                marks.setRegNo(rs.getString("RegNo"));
                marks.setQuiz01(rs.getDouble("Quiz_01"));
                marks.setQuiz02(rs.getDouble("Quiz_02"));
                marks.setQuiz03(rs.getDouble("Quiz_03"));
                marks.setQuiz04(rs.getDouble("Quiz_04"));
                marks.setAssignment01(rs.getDouble("Assesment_01"));
                marks.setAssignment02(rs.getDouble("Assesment_02"));
                marks.setPractical(rs.getDouble("Practical"));
                marks.setTheory(rs.getDouble("Theory"));

                list.add(marks);
            }

        } catch(Exception e){

            System.out.println(e);
        }
        return list;
    }
}
