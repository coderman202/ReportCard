package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ReportCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card);

        Module history = new Module(1987435, "History");
        Module geography = new Module(1987465, "Geography");
        Module maths = new Module(1986435, "Maths");
        Module psychology = new Module(1887435, "Psychology");
        Module french = new Module(1987415, "French");
        Module spanish = new Module(1987635, "Spanish");
        Module statistics = new Module(1095435, "Statistics");
        Module java = new Module(1987222, "Java");

        ArrayList<Module> modulesList = new ArrayList<Module>();
        modulesList.add(history);
        modulesList.add(geography);
        modulesList.add(maths);
        modulesList.add(psychology);
        modulesList.add(french);
        modulesList.add(spanish);
        modulesList.add(statistics);
        modulesList.add(java);


        Student student = new Student(4579834, "John Green", modulesList);

        ArrayList<Grade> gradesList = new ArrayList<>();

        Random rand = new Random();

        for(Module module:modulesList){
            gradesList.add(new Grade(student, module, rand.nextInt(101)));
        }

        ReportCard reportCard = new ReportCard(student, gradesList);

        TextView reportCardView = (TextView) findViewById(R.id.report_card);
        reportCardView.setText(reportCard.toString());
    }



}
