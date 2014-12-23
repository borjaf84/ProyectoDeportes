package com.borja.proyectodeportes.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.borja.proyectodeportes.R;
import com.borja.proyectodeportes.adapters.AdaptadorEquipos;
import com.borja.proyectodeportes.adapters.Equipos;
import com.borja.proyectodeportes.toast.CustomToastEquipos;
import com.borja.proyectodeportes.utils.Constantes;

public class EquiposFutbolActivity extends Activity{

	ListView listaEquipos;
	Equipos[] equipos;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.equipos_futbol);
		
		listaEquipos = (ListView) findViewById(R.id.listaEquipos);		
		String opc = getIntent().getExtras().getString(Constantes.OPCION);
		
		if (opc.equals(Constantes.LIGA_BBVA)){
			equipos = new Equipos[]{
					new Equipos("Unión Deportiva Almería", "1889", "Los Juegos Mediterráneos", "drawable/almeria", "D. Alfonso García Gabarrón"),
					new Equipos("Athletic Club de Futbol", "1898", "San Mamés", "drawable/atheltic","D. Josu Urrutia Tellería"),
					new Equipos("Club Atlético de Madrid", "1903", "Vicente Calderón", "drawable/atletico","D. Enrique Cerezo Torres"),
					new Equipos("Fútbol Club Barcelona", "1899", "Camp Nou", "drawable/barcelona","D. Josep Maria Bartomeu i Floreta"),
					new Equipos("Real Club Celta de Vigo", "1923", "Municipal de Balaídos","drawable/celta","D. Carlos Mouriño Atanes"),				
					new Equipos("Córdoba Club de Fútbol", "1951", "Nuevo Municipal El Arcángel", "drawable/cordoba","Carlos González"),
					new Equipos("Real Club Deportivo de La Coruña", "1906", "Riazor", "drawable/deportivo","Tino Fernández"),
					new Equipos("Sociedad Deportiva Eibar", "1940", "Municipal de Ipurúa", "drawable/eibar","Álex Aranzabal"),
					new Equipos("Elche Club de Fútbol", "1922", "Manuel Martínez Valero", "drawable/elche","José Sepulcre Coves"),
					new Equipos("Deportivo Espanyol de Barcelona", "1902", "Power8 Stadium", "drawable/espanyol",""),
					new Equipos("Getafe Club de Fútbol", "1976", "Coliseum Alfonso Pérez", "drawable/getafe","Ángel Torres"),
					new Equipos("Granada Club de Fútbol", "1931", "Municipal Nuevo Los Cármenes", "drawable/granada",""),
					new Equipos("Levante Unión Deportiva", "1908", "Ciutat de València", "drawable/levante",""),
					new Equipos("Málaga Club de Fútbol", "1948", "La Rosaleda", "drawable/malaga",""),
					new Equipos("Rayo Vallecano de Madrid", "1924", "Campo de Fútbol de Vallecas", "drawable/rayo",""),				
					new Equipos("Real Madrid Club de Fútbol", "1899", "Estadio Santiago Bernabeu", "drawable/realmadrid",""),
					new Equipos("Real Sociedad de Fútbol", "1903", "Municipal de Anoeta", "drawable/realsociedad",""),
					new Equipos("Sevilla Fútbol Club", "1890", "Ramón Sánchez Pizjuán", "drawable/sevilla",""),
					new Equipos("Valencia Club de Fútbol", "1919", "Mestalla", "drawable/valencia",""),
					new Equipos("Villarreal Club de Fútbol", "1944", "El Madrigal", "drawable/villareal",""),
			};
		}
		else if (opc.equals(Constantes.LIGA_ADELANTE)){
			equipos = new Equipos[]{
					
					new Equipos("Deportivo Alavés", "1920", "Estadio de Mendizorroza", "drawable/alaves",""),
					new Equipos("Albacete Balompié", "1940", "Carlos Belmonte", "drawable/albacete",""),
					new Equipos("Agrupación Deportiva Alcorcón", "1971", "Municipal Santo Domingo", "drawable/alcorcon",""),
					new Equipos("Fútbol Club Barcelona “B”", "1970", "Mini Estadi", "drawable/barcelonab",""),
					new Equipos("Girona Futbol Club", "1930", "Estadi Municipal de Montilivi", "drawable/girona",""),					
					new Equipos("Unión Deportiva Las Palmas", "1949", "Estadio de Gran Canaria", "drawable/laspalmas",""),
					new Equipos("Club Deportivo Leganés", "1926", "Municipal de Butarque", "drawable/leganes",""),
					new Equipos("Unió Esportiva Llagostera", "1947", "Municipal de Futbol Palamós-Costa Brava", "drawable/llagostera",""),
					new Equipos("Club Deportivo Lugo", "1953", "Nuevo Estadio Ángel Carro", "drawable/lugo",""),
					new Equipos("Real Club Deportivo Mallorca", "1916", "Iberostar Estadi", "drawable/mallorca",""),					
					new Equipos("Club Deportivo Mirandés", "1927", "Estadio Municipal de Anduva", "drawable/mirandes",""),
					new Equipos("Club Deportivo Numancia de Soria", "1945", "Nuevo Estadio Los Pajaritos", "drawable/numancia",""),
					new Equipos("Club Atlético Osasuna", "1919", "El Sadar", "drawable/osasuna",""),
					new Equipos("Sociedad Deportiva Ponferradina", "1921", "Municipal El Toralín", "drawable/ponferradina",""),
					new Equipos("Real Betis Balompié", "1907", "Benito Villamarín", "drawable/realbetis",""),					
					new Equipos("Real Racing Club de Santander", "1913", "Campos de Sport de El Sardinero", "drawable/realracing",""),
					new Equipos("Real Sporting de Gijón", "1905", "El Molinón", "drawable/realsporting",""),
					new Equipos("Real Valladolid Club de Fútbol", "1928", "Nuevo Municipal José Zorrilla", "drawable/realvalladolid",""),
					new Equipos("Real Zaragoza", "1932", "La Romareda", "drawable/realzaragoza",""),
					new Equipos("Real Club Recreativo de Huelva", "1889", "Nuevo Colombino", "drawable/recreativo",""),
					new Equipos("Centre d’Esports Sabadell Futbol Club", "1903", "Municipal de la Nova Creu Alta", "drawable/sabadell",""),
					new Equipos("Club Deportivo Tenerife", "1912", "Heliodoro Rodríguez López", "drawable/tenerife",""),		
			};
		}
		AdaptadorEquipos adaptador = null;

		adaptador = new AdaptadorEquipos(this, equipos);
		
		listaEquipos.setAdapter(adaptador);
		registerForContextMenu(listaEquipos);
		listaEquipos.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View arg1, int position ,long id) {

				String equipoSeleccionado = ((Equipos) a.getAdapter().getItem(position)).getEquipo();
				String estadio = ((Equipos) a.getAdapter().getItem(position)).getEstadio();
				String anio = ((Equipos) a.getAdapter().getItem(position)).getAnioFundacion();
				String presidente = ((Equipos) a.getAdapter().getItem(position)).getPresidente();
				String imgId = ((Equipos) a.getAdapter().getItem(position)).getEscudo();				
				int escudo = getResources().getIdentifier(imgId, null, getPackageName());
				CustomToastEquipos miToast = new CustomToastEquipos(getApplicationContext(), Toast.LENGTH_SHORT);
				miToast.show(equipoSeleccionado, estadio, anio,escudo, presidente);
			}
		});

	}
	
	
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
    	if (v.getId()==R.id.listaEquipos) {
    	    AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)menuInfo;
    		menu.setHeaderTitle(equipos[info.position].getEquipo());
    		String[] menuItems = getResources().getStringArray(R.array.menu); 
    		for (int i = 0; i<menuItems.length; i++) {
    			menu.add(Menu.NONE, i, i, menuItems[i]);
			}
    	}
    }
    
    //Para hacer algo al seleccionar un elemento del menu contextual
    @Override
    public boolean onContextItemSelected(MenuItem item) {
	    AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
	    int menuItemIndex = item.getItemId();
		String[] menuItems = getResources().getStringArray(R.array.menu);
		String menuItemName = menuItems[menuItemIndex];
	    String listItemName = equipos[info.position].getEquipo();
	    
		Intent i = new Intent(this, DetalleContentxMenu.class);
		i.putExtra(Constantes.STR_EQUIPO, equipos[info.position].getEquipo());
		i.putExtra(Constantes.STR_ESTADIO, equipos[info.position].getEstadio());		
		i.putExtra(Constantes.STR_ANIO, equipos[info.position].getAnioFundacion());
		i.putExtra(Constantes.STR_ESCUDO, equipos[info.position].getEscudo());
		i.putExtra(Constantes.STR_PRESIDENTE, equipos[info.position].getPresidente());
		startActivity(i);
	    
	    
	    
    	return true;
    }
	
}

