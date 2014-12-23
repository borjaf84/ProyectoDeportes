package com.borja.proyectodeportes.adapters;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.borja.proyectodeportes.R;

public class AdaptadorEquipos extends ArrayAdapter{

	Activity content;
	static Equipos[] equipos;
	
	public AdaptadorEquipos(Fragment context, Equipos[] equiposFrag) {
		super(context.getActivity(),R.layout.adaptador_equipos, equiposFrag);
		this.content = context.getActivity();
		this.equipos = equiposFrag;
	}
	
	public AdaptadorEquipos(Activity context, Equipos[] equipos) {
		super(context,R.layout.adaptador_equipos, equipos);
		this.equipos = equipos;
		this.content = context;
	}

	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View item = convertView;
		ViewHolder holder;
		
		if (item == null){
			LayoutInflater inflater = content.getLayoutInflater();
			item = inflater.inflate(R.layout.adaptador_equipos, null);
			
			holder = new ViewHolder();
			holder.equipo = (TextView) item.findViewById(R.id.equipo);
			holder.anioFundacion = (TextView)item.findViewById(R.id.anioFundacion);
			holder.estadio = (TextView)item.findViewById(R.id.estadio);
			holder.escudo = (ImageView) item.findViewById(R.id.escudo);
			
			item.setTag(holder);
		}
		else{
			holder = (ViewHolder) item.getTag();
		}
		
		holder.anioFundacion.setText(equipos[position].getAnioFundacion());
		holder.equipo.setText(equipos[position].getEquipo());
		holder.estadio.setText(equipos[position].getEstadio());
		int imgId = content.getResources().getIdentifier(equipos[position].getEscudo(), null, content.getPackageName());
		holder.escudo.setImageResource(imgId);
		return item;
	}
	
	public class ViewHolder {
		private TextView equipo;
		private TextView anioFundacion;
		private TextView estadio;
		private ImageView escudo;
	}
}

