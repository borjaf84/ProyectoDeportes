package com.borja.proyectodeportes.toast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.borja.proyectodeportes.R;

public class CustomToastEquipos extends Toast {

	private Context context;

	
	/**
	* constructor que recibe el contexto y la duración del Toast y
	* que se lo pasamos al método setDuracion de la clase de la que hereda
	 * @return 
	*/

	
	public CustomToastEquipos(Context cont, int duration) {
			super(cont);
			 context = cont;
			 this.setDuration(duration);
		}


	/**
	* método donde inflamos nuestro layout personalizado y le asignamos
	* el texto que recibirá cuando instanciemos el objeto.
	* Además llamamos al método show de la clase de la que hereda para que se muestre por pantalla
	*/
	 public void show(String equipo, String estadio, String anio, int escudo, String presidente) {
		 LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		 View vi = (View) li.inflate(R.layout.toast_custom_equipos, null);
		
		TextView tv_equipo = (TextView) vi.findViewById(R.id.text_toast_equipo);
		this.setView(vi);
		tv_equipo.setText(equipo);
		
		TextView tv_estadio = (TextView) vi.findViewById(R.id.text_toast_estadio);
		this.setView(vi);
		tv_estadio.setText(estadio);
		
		TextView tv_anio = (TextView) vi.findViewById(R.id.text_toast_anio);
		this.setView(vi);
		tv_anio.setText(anio);
		
		ImageView tv_escudo = (ImageView) vi.findViewById(R.id.img_toas_escudo);
		this.setView(vi);
		tv_escudo.setImageResource(escudo);
		
		TextView tv_presidente = (TextView) vi.findViewById(R.id.text_toast_presidente);
		this.setView(vi);
		tv_presidente.setText(presidente);
		
		super.show();
	 }
}
