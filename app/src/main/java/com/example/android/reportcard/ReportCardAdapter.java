package com.example.android.reportcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A custom adapter to take in a ReportCard object and display the list of grades in a ListView
 */

class ReportCardAdapter extends ArrayAdapter<ReportCard.Grade> {

    ReportCardAdapter(Context context, ReportCard reportCard){
        super(context, 0, reportCard.getmGrades());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view_item_row, parent, false);
        }

        ReportCard.Grade currentGrade = getItem(position);

        TextView moduleTextView = (TextView) listItemView.findViewById(R.id.module_item);
        TextView markTextView = (TextView) listItemView.findViewById(R.id.mark_item);
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_item);


        moduleTextView.setText(currentGrade.getmModule().getmModuleName());
        markTextView.setText(String.valueOf(currentGrade.getmFinalGrade()));
        gradeTextView.setText(currentGrade.getmLetterGrade().toString());

        return listItemView;
    }
}
