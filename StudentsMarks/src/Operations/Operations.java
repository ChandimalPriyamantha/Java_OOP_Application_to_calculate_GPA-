package Operations;

import ConnectionDB.OperationDB;
import Marks.Marks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

public class Operations extends Marks {

    public void getAverageOfBestThreeQuizzes(){
        Operations op = new Operations();
        List<Marks> list = op.list();

        for(Marks ms : list){

            String id = ms.getRegNo();
            double quiz_01 = ms.getQuiz01();
            double quiz_02 = ms.getQuiz02();
            double quiz_03 = ms.getQuiz03();
            double quiz_04 = ms.getQuiz04();

            double [] m = {quiz_01,quiz_02,quiz_03,quiz_04};

            Arrays.sort(m);
            int n = m.length;

            double[] maxThreeMarks = Arrays.copyOfRange(m, n - 3, n);

            //System.out.println(id + ":" + Arrays.toString(maxThreeMarks));
            double sum = 0;
            int count = maxThreeMarks.length;

            // Calculate the sum of all numbers
            for (int i = 0; i < count; i++) {
                sum += maxThreeMarks[i];
            }

            // Calculate the average
            double average = sum / count;

            System.out.println(id + ":" + average);

        }
    }

    public void calculateAverageTenPresentFromBestTreeQuizzes(){

        Operations op = new Operations();
        List<Marks> list = op.list();

        for(Marks ms : list){

            String id = ms.getRegNo();
            double quiz_01 = ms.getQuiz01();
            double quiz_02 = ms.getQuiz02();
            double quiz_03 = ms.getQuiz03();
            double quiz_04 = ms.getQuiz04();

            double [] m = {quiz_01,quiz_02,quiz_03,quiz_04};

            Arrays.sort(m);
            int n = m.length;

            double[] maxThreeMarks = Arrays.copyOfRange(m, n - 3, n);

            //System.out.println(id + ":" + Arrays.toString(maxThreeMarks));
            double sum = 0;
            int count = maxThreeMarks.length;

            // Calculate the sum of all numbers
            for (int i = 0; i < count; i++) {
                sum += maxThreeMarks[i];
            }

            // Calculate the average
            double average = (sum / count)*(10.0/100.0);

            System.out.println(id + ":" + average);

        }


    }

    public  void calculateTenPresentFromAssignmentOne(){

        Operations op = new Operations();
        List<Marks> list = op.list();

        for(Marks ms : list){

            String id = ms.getRegNo();
            double assignment01 = ms.getAssignment01();

            double result = assignment01*(10.0/100.0);

            System.out.println(id + ":" + result);



        }

    }

    public void calculateTwentyPresentFromAssignmentTwo(){

        Operations op = new Operations();
        List<Marks> list = op.list();

        for(Marks ms : list){

            String id = ms.getRegNo();
            double assignment02 = ms.getAssignment02();

            double result = assignment02*(20.0/100.0);

            System.out.println(id + ":" + result);



        }

    }

    public void calculateThirtyPresentFromPractical(){
        Operations op = new Operations();
        List<Marks> list = op.list();

        for(Marks ms : list){

            String id = ms.getRegNo();
            double practical = ms.getPractical();

            double result = practical*(30.0/100.0);

            System.out.println(id + ":" + result);



        }

    }

    public void calculateTotalMarksForGivenStudent(){




    }



}
