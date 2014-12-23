package com.borja.proyectodeportes.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.borja.proyectodeportes.R;
import com.borja.proyectodeportes.utils.Constantes;

public class DetalleContentxMenu extends Activity  {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_detalle);

		Bundle extras = getIntent().getExtras();
		
		TextView extEquipo = (TextView)findViewById(R.id.text_frg_equipo);		
		extEquipo.setText(extras.getString(Constantes.STR_EQUIPO));
		
		TextView txtEstadio = (TextView)findViewById(R.id.text_frg_estadio);		
		txtEstadio.setText(extras.getString(Constantes.STR_ESTADIO));
		
		TextView txtAnio = (TextView)findViewById(R.id.text_frg_anio);		
		txtAnio.setText(extras.getString(Constantes.STR_ANIO));
		
		TextView txtPresidente = (TextView)findViewById(R.id.text_frg_presidente);		
		txtPresidente.setText(extras.getString(Constantes.STR_PRESIDENTE));
		
		ImageView imgEscudo = (ImageView)findViewById(R.id.img_frg_escudo);		
		int escudo = getResources().getIdentifier(extras.getString(Constantes.STR_ESCUDO), null, getPackageName());
		imgEscudo.setImageResource(escudo);
		
	}
}
