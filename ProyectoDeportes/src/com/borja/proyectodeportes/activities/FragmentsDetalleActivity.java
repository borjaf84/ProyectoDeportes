package com.borja.proyectodeportes.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.borja.proyectodeportes.R;
import com.borja.proyectodeportes.fragments.FragmentoDetalle;
import com.borja.proyectodeportes.utils.Constantes;

public class FragmentsDetalleActivity  extends FragmentActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragmento_detalle_activity);	
		FragmentoDetalle detalle = (FragmentoDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);	
		Bundle extras = getIntent().getExtras();
		detalle.mostrarDetalle(extras.getString(Constantes.STR_EQUIPO),extras.getString(Constantes.STR_ESTADIO),
				extras.getString(Constantes.STR_ANIO),extras.getInt(Constantes.STR_ESCUDO),
				extras.getString(Constantes.STR_PRESIDENTE));
	}
}
