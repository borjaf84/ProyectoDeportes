package com.borja.proyectodeportes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.borja.proyectodeportes.R;
import com.borja.proyectodeportes.adapters.Equipos;
import com.borja.proyectodeportes.fragments.FragmentoDetalle;
import com.borja.proyectodeportes.fragments.FragmentoListado;
import com.borja.proyectodeportes.fragments.FragmentoListado.EquiposListener;
import com.borja.proyectodeportes.utils.Constantes;

public class FragmentsListadoActivity extends FragmentActivity implements EquiposListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragmento_activity);		
		FragmentoListado frgListado=(FragmentoListado)getSupportFragmentManager().findFragmentById(R.id.FrgListado);		
		frgListado.setEquiposListener(this);
	}

	@Override
	public void onEquipoSeleccionado(Equipos c) {
		boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);
		int imgId = getResources().getIdentifier(c.getEscudo(), null, getPackageName());
		if(hayDetalle) {			
			((FragmentoDetalle)getSupportFragmentManager()
				.findFragmentById(R.id.FrgDetalle)).mostrarDetalle(c.getEquipo(), c.getEstadio(), c.getAnioFundacion(), imgId, c.getPresidente());
		}
		else {
			Intent i = new Intent(this, FragmentsDetalleActivity.class);
			i.putExtra(Constantes.STR_EQUIPO, c.getEquipo());
			i.putExtra(Constantes.STR_ESTADIO, c.getEstadio());
			i.putExtra(Constantes.STR_ANIO, c.getAnioFundacion());
			i.putExtra(Constantes.STR_ESCUDO, imgId);
			i.putExtra(Constantes.STR_PRESIDENTE, c.getPresidente());
			startActivity(i);
		}
	}
}
