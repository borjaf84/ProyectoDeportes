package com.borja.proyectodeportes.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.borja.proyectodeportes.R;
import com.borja.proyectodeportes.adapters.AdaptadorEquipos;
import com.borja.proyectodeportes.adapters.Equipos;

public class FragmentoListado extends Fragment{
	
	
	Equipos[] equipos = new Equipos[]{			
			new Equipos("Arsenal", "1886", "Emirates Stadium", "drawable/arsenal","Peter Hill-Wood"),
			new Equipos("Chelsea", "1905", "Stamford Bridge", "drawable/chelsea","Bruce Buck"),
			new Equipos("Manchester City", "1880", "Etihad Stadium", "drawable/mancity","Khaldoon Al Mubarak"),
			new Equipos("Everton", "1878", "Goodison Park", "drawable/everton","Bill Kenwright"),
			new Equipos("Manchester United", "1878", "Old Trafford", "drawable/manunited","Joel Glazer Y Avram Glazer"),
			new Equipos("Newcastle United", "1892", "St. James' Park", "drawable/newcastle","Derek Llambias"),				
			new Equipos("Tottenham Hotspur", "1882", "White Hart Lane", "drawable/tottenham","Daniel Levy"),
			new Equipos("Liverpool", "1892", "Anfield", "drawable/liverpool","Martin Broughton"),
			new Equipos("West Ham", "1895", "Boleyn Ground", "drawable/westham","Eggert Magnusson"),
			new Equipos("Stoke City", "1868", "Britannia Stadium", "drawable/stokecity","Peter Coates"),
	};

	private ListView lstListado;
	
	private EquiposListener listener;
	
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_listado, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle state) {
		super.onActivityCreated(state);
		lstListado = (ListView)getView().findViewById(R.id.lista_List_Fragmento);
		lstListado.setAdapter(new AdaptadorEquipos(this, equipos));
		lstListado.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> list, View view, int pos, long id) {
				if (listener!=null) {
					listener.onEquipoSeleccionado(
							(Equipos)lstListado.getAdapter().getItem(pos));
				}
			}
		});
	}

	
	public interface EquiposListener {
		void onEquipoSeleccionado(Equipos c);
	}
	
	public void setEquiposListener(EquiposListener listener) {
		this.listener=listener;
	}
}
