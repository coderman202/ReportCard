package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ReportCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card);

        // Instantiate a new ReportCard object. Set attributes to null initially while using inner
        // classes to create the attributes of the ReportCard later.
        ReportCard reportCard = new ReportCard();

        /*
         * Create an ArrayList of modules, accessing the inner Module class from the newly
         * instantiated ReportCard object. Add new Modules using the pseudo constructor which
         * itself accessing the class constructor of the Module class.
         */
        ArrayList<ReportCard.Module> modulesList = new ArrayList<>();
        modulesList.add(reportCard.newModule(1987435, "History"));
        modulesList.add(reportCard.newModule(1987465, "Geography"));
        modulesList.add(reportCard.newModule(1986435, "Maths"));
        modulesList.add(reportCard.newModule(1887435, "Psychology"));
        modulesList.add(reportCard.newModule(1987415, "French"));
        modulesList.add(reportCard.newModule(1987635, "Spanish"));
        modulesList.add(reportCard.newModule(1095435, "Statistics"));
        modulesList.add(reportCard.newModule(1987222, "Java"));
        modulesList.add(reportCard.newModule(1989922, "Chemistry"));
        modulesList.add(reportCard.newModule(1230986, "Physics"));

        // Create a student passing in the ArrayList of Modules too.
        ReportCard.Student student = reportCard.newStudent(modulesList);

        // Create an ArrayList of Grade objects to store the grades the student got in each module.
        ArrayList<ReportCard.Grade> gradesList = new ArrayList<>();

        // Use a random number generator for the final mark the student got.
        Random rand = new Random();

        // Loop through the modules ArrayList and create a new grade at random, between 1 and 100,
        // for each module.
        for(ReportCard.Module module:modulesList){
            gradesList.add(reportCard.newGrade(student, module, rand.nextInt(101)));
        }

        // Now we have created the Student and Grades we can set the ReportCard objects attributes
        // to their true value.
        reportCard.setmStudent(student);
        reportCard.setmGrades(gradesList);

        TextView nameTextView = (TextView) findViewById(R.id.student_name);
        nameTextView.setText(student.getmStudentName());

        TextView idTextView = (TextView) findViewById(R.id.student_id);
        idTextView.setText(String.valueOf(student.getmStudentID()));

        ReportCardAdapter reportCardAdapter = new ReportCardAdapter(this, reportCard);

        // Find the {@link ListView} object from the view hierarchy of the {@link Activity} and use
        // the {@link ArrayAdapter} created above to populate the list.
        ListView reportCardList = (ListView) findViewById(R.id.report_card_list);
        reportCardList.setAdapter(reportCardAdapter);
    }



}
