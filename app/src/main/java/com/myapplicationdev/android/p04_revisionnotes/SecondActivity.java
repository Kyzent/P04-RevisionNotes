package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

	ArrayList<Note> Notes;
	ListView lv;
	ArrayAdapter aa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//TODO implement the Custom ListView

		lv = (ListView) this.findViewById(R.id.lv);

		DBHelper db = new DBHelper(SecondActivity.this);
		Notes = db.getAllNotes();
		db.close();

		aa = new RevisionNotesArrayAdapter(this, R.layout.row, Notes);
		lv.setAdapter(aa);
	}


}
