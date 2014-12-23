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
					new Equipos("Uni�n Deportiva Almer�a", "1889", "Los Juegos Mediterr�neos", "drawable/almeria", "D. Alfonso Garc�a Gabarr�n"),
					new Equipos("Athletic Club de Futbol", "1898", "San Mam�s", "drawable/atheltic","D. Josu Urrutia Teller�a"),
					new Equipos("Club Atl�tico de Madrid", "1903", "Vicente Calder�n", "drawable/atletico","D. Enrique Cerezo Torres"),
					new Equipos("F�tbol Club Barcelona", "1899", "Camp Nou", "drawable/barcelona","D. Josep Maria Bartomeu i Floreta"),
					new Equipos("Real Club Celta de Vigo", "1923", "Municipal de Bala�dos","drawable/celta","D. Carlos Mouri�o Atanes"),				
					new Equipos("C�rdoba Club de F�tbol", "1951", "Nuevo Municipal El Arc�ngel", "drawable/cordoba","Carlos Gonz�lez"),
					new Equipos("Real Club Deportivo de La Coru�a", "1906", "Riazor", "drawable/deportivo","Tino Fern�ndez"),
					new Equipos("Sociedad Deportiva Eibar", "1940", "Municipal de Ipur�a", "drawable/eibar","�lex Aranzabal"),
					new Equipos("Elche Club de F�tbol", "1922", "Manuel Mart�nez Valero", "drawable/elche","Jos� Sepulcre Coves"),
					new Equipos("Deportivo Espanyol de Barcelona", "1902", "Power8 Stadium", "drawable/espanyol",""),
					new Equipos("Getafe Club de F�tbol", "1976", "Coliseum Alfonso P�rez", "drawable/getafe","�ngel Torres"),
					new Equipos("Granada Club de F�tbol", "1931", "Municipal Nuevo Los C�rmenes", "drawable/granada",""),
					new Equipos("Levante Uni�n Deportiva", "1908", "Ciutat de Val�ncia", "drawable/levante",""),
					new Equipos("M�laga Club de F�tbol", "1948", "La Rosaleda", "drawable/malaga",""),
					new Equipos("Rayo Vallecano de Madrid", "1924", "Campo de F�tbol de Vallecas", "drawable/rayo",""),				
					new Equipos("Real Madrid Club de F�tbol", "1899", "Estadio Santiago Bernabeu", "drawable/realmadrid",""),
					new Equipos("Real Sociedad de F�tbol", "1903", "Municipal de Anoeta", "drawable/realsociedad",""),
					new Equipos("Sevilla F�tbol Club", "1890", "Ram�n S�nchez Pizju�n", "drawable/sevilla",""),
					new Equipos("Valencia Club de F�tbol", "1919", "Mestalla", "drawable/valencia",""),
					new Equipos("Villarreal Club de F�tbol", "1944", "El Madrigal", "drawable/villareal",""),
			};
		}
		else if (opc.equals(Constantes.LIGA_ADELANTE)){
			equipos = new Equipos[]{
					
					new Equipos("Deportivo Alav�s", "1920", "Estadio de Mendizorroza", "drawable/alaves",""),
					new Equipos("Albacete Balompi�", "1940", "Carlos Belmonte", "drawable/albacete",""),
					new Equipos("Agrupaci�n Deportiva Alcorc�n", "1971", "Municipal Santo Domingo", "drawable/alcorcon",""),
					new Equipos("F�tbol Club Barcelona �B�", "1970", "Mini Estadi", "drawable/barcelonab",""),
					new Equipos("Girona Futbol Club", "1930", "Estadi Municipal de Montilivi", "drawable/girona",""),					
					new Equipos("Uni�n Deportiva Las Palmas", "1949", "Estadio de Gran Canaria", "drawable/laspalmas",""),
					new Equipos("Club Deportivo Legan�s", "1926", "Municipal de Butarque", "drawable/leganes",""),
					new Equipos("Uni� Esportiva Llagostera", "1947", "Municipal de Futbol Palam�s-Costa Brava", "drawable/llagostera",""),
					new Equipos("Club Deportivo Lugo", "1953", "Nuevo Estadio �ngel Carro", "drawable/lugo",""),
					new Equipos("Real Club Deportivo Mallorca", "1916", "Iberostar Estadi", "drawable/mallorca",""),					
					new Equipos("Club Deportivo Mirand�s", "1927", "Estadio Municipal de Anduva", "drawable/mirandes",""),
					new Equipos("Club Deportivo Numancia de Soria", "1945", "Nuevo Estadio Los Pajaritos", "drawable/numancia",""),
					new Equipos("Club Atl�tico Osasuna", "1919", "El Sadar", "drawable/osasuna",""),
					new Equipos("Sociedad Deportiva Ponferradina", "1921", "Municipal El Toral�n", "drawable/ponferradina",""),
					new Equipos("Real Betis Balompi�", "1907", "Benito Villamar�n", "drawable/realbetis",""),					
					new Equipos("Real Racing Club de Santander", "1913", "Campos de Sport de El Sardinero", "drawable/realracing",""),
					new Equipos("Real Sporting de Gij�n", "1905", "El Molin�n", "drawable/realsporting",""),
					new Equipos("Real Valladolid Club de F�tbol", "1928", "Nuevo Municipal Jos� Zorrilla", "drawable/realvalladolid",""),
					new Equipos("Real Zaragoza", "1932", "La Romareda", "drawable/realzaragoza",""),
					new Equipos("Real Club Recreativo de Huelva", "1889", "Nuevo Colombino", "drawable/recreativo",""),
					new Equipos("Centre d�Esports Sabadell Futbol Club", "1903", "Municipal de la Nova Creu Alta", "drawable/sabadell",""),
					new Equipos("Club Deportivo Tenerife", "1912", "Heliodoro Rodr�guez L�pez", "drawable/tenerife",""),		
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

