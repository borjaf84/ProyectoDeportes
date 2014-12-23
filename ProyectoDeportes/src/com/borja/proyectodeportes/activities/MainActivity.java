package com.borja.proyectodeportes.activities;

import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

import com.borja.proyectodeportes.R;
import com.borja.proyectodeportes.adapters.Equipos;
import com.borja.proyectodeportes.utils.Constantes;

public class MainActivity extends Activity {

	private Spinner listaSpinner;
	String[] datos = {"Seleccione una opción", Constantes.LIGA_BBVA, Constantes.LIGA_ADELANTE,  Constantes.PREMIER_LEAGUE};
    ArrayList<String> items=new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		prepararTabs();
		
		leerXML("primera");
		
		listaSpinner = (Spinner) findViewById(R.id.lista1);
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
		listaSpinner.setAdapter(adaptador);
		
		listaSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
	
		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			switch (position) {
			case 1:

				Intent ie =  new Intent(MainActivity.this, EquiposFutbolActivity.class);
				ie.putExtra(Constantes.OPCION, datos[position]);
				startActivity(ie);
				break;
			case 2: 
				Intent i =  new Intent(MainActivity.this, EquiposFutbolActivity.class);
				i.putExtra(Constantes.OPCION, datos[position]);
				startActivity(i);
				break;
			
		case 3: 
			Intent iee =  new Intent(MainActivity.this, FragmentsListadoActivity.class);
			iee.putExtra(Constantes.OPCION, datos[position]);
			startActivity(iee);
			break;
		}	
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub
			
		}
	});
	}
	
	
	private void prepararTabs(){
		Resources res = getResources();
		
        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();
		
        TabHost.TabSpec spec=tabs.newTabSpec(Constantes.TAB_FUTBOL);
        spec.setContent(R.id.tabFutbol);
        spec.setIndicator("", res.getDrawable(R.drawable.ic_futbol));
        tabs.addTab(spec);
        
        spec=tabs.newTabSpec(Constantes.TAB_TENIS);
        spec.setContent(R.id.tabTenis);
        spec.setIndicator("", res.getDrawable(R.drawable.ic_tenis));
        tabs.addTab(spec);
        
        spec=tabs.newTabSpec(Constantes.TAB_BALONCESTO);
        spec.setContent(R.id.tabBaloncesto);
        spec.setIndicator("", res.getDrawable(R.drawable.ic_baloncesto));
        tabs.addTab(spec);
        
        tabs.setCurrentTab(0);
        
        tabs.setOnTabChangedListener(new OnTabChangeListener() {
			public void onTabChanged(String tabId) {
				//Log.i("AndroidTabsDemo", "Pulsada pestaña: " + tabId);
			}
		});
	}
	
	
	
	
	
	
	
	
	
	public void leerXML(String division){
		
		List<Equipos> equipos = new ArrayList<Equipos>();
		
		Equipos equipoActual = null;
		
		XmlPullParser parser = getResources().getXml(R.xml.futbol);
		StringBuilder stringBuilder = new StringBuilder();
		try {
			while (parser.next() != XmlPullParser.END_DOCUMENT) {
				String name = parser.getName();
				String position = null;
				String brand = null;
				if((name != null)) {
					//if (esDivision(division, parser)){}

					if (name.equals("equipo"))
						equipoActual = new Equipos();
					else{
						
						int size = parser.getAttributeCount();
						for(int i = 0; i < size; i++) {
							String attrName = parser.getAttributeName(i);
							String attrValue = parser.getAttributeValue(i);
						
						
					}
					
					
					}
					
					
					
//					int size = parser.getAttributeCount();
//					for(int i = 0; i < size; i++) {
//						String attrName = parser.getAttributeName(i);
//						String attrValue = parser.getAttributeValue(i);
//						if((attrName != null) && attrName.equals("position")) {
//							position = attrValue;
//						} else if ((attrName != null) && attrName.equals("brand")) {
//							brand = attrValue;
//						}
//					}
//					if((position != null) && (brand != null)) {
//						stringBuilder.append(position + ", " + brand + "\n");
//					}
				}
			}
		}catch(Exception e) {
			
		}
		
	}
	
	
	
	
	private boolean esDivision(String divFiltro, XmlPullParser parser){
		if (parser.getName().equals("equipo")){
			String attrName = parser.getAttributeName(0);
			String attrValue = parser.getAttributeValue(0);
			if (attrName.equals(Constantes.STR_DIVISION) && attrValue.equals(divFiltro))
					return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}