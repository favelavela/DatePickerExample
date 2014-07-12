package com.example.datepickerexample;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.DatePicker;

public class MainActivity extends Activity {

	int anio, mes, dia;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 final Calendar c = Calendar.getInstance();
		 
         anio = c.get(Calendar.YEAR);
         mes = c.get(Calendar.MONTH);
         dia = c.get(Calendar.DAY_OF_MONTH);

         DatePickerDialog dpd = new DatePickerDialog(this,
                 new DatePickerDialog.OnDateSetListener() {

                     @Override
                     public void onDateSet(DatePicker view, int year,
                             int monthOfYear, int dayOfMonth) {
                    	 
                     }

                 }, anio, mes, dia);
         dpd.show();
	}
}
