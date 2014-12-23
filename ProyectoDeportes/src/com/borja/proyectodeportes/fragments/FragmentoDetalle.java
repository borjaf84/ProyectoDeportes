package com.borja.proyectodeportes.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.borja.proyectodeportes.R;

public class FragmentoDetalle  extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_detalle, container, false);
	}
	
	public void mostrarDetalle(String equipo, String estadio, String anio, int escudo, String presidente) {
		TextView extEquipo = (TextView)getView().findViewById(R.id.text_frg_equipo);		
		extEquipo.setText(equipo);
		
		TextView txtEstadio = (TextView)getView().findViewById(R.id.text_frg_estadio);		
		txtEstadio.setText(estadio);
		
		TextView txtAnio = (TextView)getView().findViewById(R.id.text_frg_anio);		
		txtAnio.setText(anio);
		
		TextView txtPresidente = (TextView)getView().findViewById(R.id.text_frg_presidente);		
		txtPresidente.setText(presidente);
		
		ImageView imgEscudo = (ImageView)getView().findViewById(R.id.img_frg_escudo);		
		imgEscudo.setImageResource(escudo);
	}
}
