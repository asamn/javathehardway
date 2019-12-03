import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

class Student
{
    String name;
    int credits;
    double gpa;
}
public class StudentDatabase
{
    public static void main (String[] args) throws Exception
    {

        File studentText = new File ("StudentDatabase.txt");
        Scanner readFile = new Scanner(studentText);
        int studentCount = 0;
        Student[] studentArray;
        Student[] tempArray;
        Student[] orderedArray;
        Student[] orderedCreditArray;
        Student[] orderedNameArray;

        while(readFile.hasNext())
        {
            if (readFile.next().equals("-"))
            {
                studentCount++;
            }
        }
        readFile.close();//to read from file again

        studentArray = new Student[studentCount];
        tempArray = new Student[studentArray.length];
        orderedArray = new Student[studentArray.length];
        orderedCreditArray = new Student[studentArray.length];
        orderedNameArray = new Student[studentArray.length];

        readFile = new Scanner(studentText);//resets scanner position
        while (readFile.hasNext())
        {
            for (int i = 0; i < studentCount; i++)
            {
                studentArray[i] = new Student();
                studentArray[i].name = readFile.next();//zzzzzzzzzzzzzz
                studentArray[i].gpa = readFile.nextDouble();
                studentArray[i].credits = readFile.nextInt();
                readFile.next();//skip over "-" indicator

                tempArray[i] = new Student();//tempArray uses studentArray as default, for sorting
                tempArray[i].name = studentArray[i].name;
                tempArray[i].gpa =  studentArray[i].gpa;
                tempArray[i].credits = studentArray[i].credits;;
            }
        }


        orderedArray = orderGPA(tempArray, orderedArray);
        resetTemp(tempArray, studentArray);

        out.println("Sorted by GPA ");
        for (int i = 0; i < studentArray.length; i++)//(int i = studentArray.length-1; i > -1; i--) for descending.
        {
            out.println(orderedArray[i].name + " - " + orderedArray[i].gpa + " GPA, " + orderedArray[i].credits + " Credits ");
        }
        out.println();


        orderedCreditArray = orderCredit(tempArray, orderedCreditArray);
        resetTemp(tempArray, studentArray);

        out.println("Sorted by Credits ");
        for (int i = 0; i < studentArray.length; i++)
        {
            out.println(orderedCreditArray[i].name + " - " + orderedCreditArray[i].gpa + " GPA, " + orderedCreditArray[i].credits + " Credits ");
        }
        out.println();

        orderedNameArray = orderName(tempArray, orderedNameArray);
        resetTemp(tempArray, studentArray);

        out.println("Sorted by Name ");
        for (int i = 0; i < studentArray.length; i++)
        {
            out.println(orderedNameArray[i].name);
        }
        out.println();

    }



    public static Student[] orderGPA (Student[] tempArray, Student[] orderedArray)
    {

        int lowestArray = 0;
        int x = 0;
        do
        {
            orderedArray[x] = new Student(); //important to create new when using class
            double lowest = 999;//resets lowest
            for (int i = 0; i < tempArray.length; i++)
            {
                if (tempArray[i].gpa < lowest)
                {
                    lowest = tempArray[i].gpa;//lowest is used to compare
                    lowestArray = i;
                }

            }
            orderedArray[x].gpa = tempArray[lowestArray].gpa;
            orderedArray[x].name = tempArray[lowestArray].name;
            orderedArray[x].credits = tempArray[lowestArray].credits;
            tempArray[lowestArray].gpa = 9999;
            x++;
        }
        while(x < tempArray.length);
        return orderedArray;
    }


    public static Student[] orderCredit (Student[] tempArray, Student[] orderedCreditArray)
    {
        int lowestArray = 0;
        int x = 0;
        do
        {
            orderedCreditArray[x] = new Student(); //important to create new when using class
            double lowest = 999;//resets lowest
            for (int i = 0; i < tempArray.length; i++)
            {
                if (tempArray[i].credits < lowest)
                {
                    lowest = tempArray[i].credits;//lowest is used to compare
                    lowestArray = i;
                }

            }
            orderedCreditArray[x].gpa = tempArray[lowestArray].gpa;
            orderedCreditArray[x].name = tempArray[lowestArray].name;
            orderedCreditArray[x].credits = tempArray[lowestArray].credits;
            tempArray[lowestArray].credits = 9999;
            x++;
        }
        while(x < tempArray.length);
        return orderedCreditArray;
    }


    public static Student[] orderName (Student[] tempArray, Student[] orderedNameArray)
    {
        int lowestArray = 0;


            String largest;

            for (int i = 0; i < tempArray.length; i++)
            {
                for (int j = i + 1; j < tempArray.length; j++)//scans all strings after i
                {
                    if (tempArray[i].name.compareTo(tempArray[j].name)>0)//compare to next strings in array
                    {
                        largest = tempArray[i].name;
                        tempArray[i].name = tempArray[j].name;//puts the firstest to the beginning of array
                        tempArray[j].name = largest; //sets the string that was replaced to be dealt with later
                    }
                    tempArray[i].gpa = tempArray[j].gpa;
                }


            }

            for (int i = 0; i < tempArray.length; i++)
            {
                orderedNameArray[i] = new Student();
                orderedNameArray[i].name = tempArray[i].name;
            }



        return orderedNameArray;

    }





    public static Student[] resetTemp(Student[] tempArray, Student[] studentArray)
    {
        for (int i = 0; i < studentArray.length; i++) //reset tempArray back to default
        {
            tempArray[i].gpa = studentArray[i].gpa;
            tempArray[i].name = studentArray[i].name;
            tempArray[i].credits = studentArray[i].credits;;
        }

        return tempArray;
    }














}




















/*
studentArray[0] = new Student();
        studentArray[0].name = "Esteban";
        studentArray[0].credits = 43;
        studentArray[0].gpa = 2.9;

        studentArray[1] = new Student();
        studentArray[1].name = "Dave";
        studentArray[1].credits = 15;
        studentArray[1].gpa = 4.0;

        studentArray[2] = new Student();
        studentArray[2].name = "Michelle";
        studentArray[2].credits = 132;
        studentArray[2].gpa = 3.72;
        */