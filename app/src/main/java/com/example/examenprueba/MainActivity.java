package com.example.examenprueba;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    ListViewAdapter adapter;
    ListView lista;
    String[] Restaurante = new String[]{
            "Pollo a la Brasa $12.00",
            "Aji de Gallina $8.00",
            "Anticuchos $6.00",
            "Ceviche $10.00",
            "Cuy Frito $22.00",
            "Lomo Saltado $15.00"
    };
    int[] imagenes = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listView1);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Restaurante);

        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {

                switch (posicion) {
                    case 0 :
                        Intent aa = new Intent(getApplicationContext(), img1.class);
                        startActivity(aa);
                        break;
                    case 1 :
                        Intent aaa = new Intent(getApplicationContext(), img2.class);
                        startActivity(aaa);

                        break;
                    case 2:
                        Intent aaaa = new Intent(getApplicationContext(), img3.class);
                        startActivity(aaaa);

                        break;
                    case 3 :
                        Intent aaaaa = new Intent(getApplicationContext(), img4.class);
                        startActivity(aaaaa);

                        break;
                    case 4 :
                        Intent aaaaaa = new Intent(getApplicationContext(), img5.class);
                        startActivity(aaaaaa);

                        break;
                    case 5 :
                        Intent aaaaaaa = new Intent(getApplicationContext(), img6.class);
                        startActivity(aaaaaaa);

                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapter = new ListViewAdapter(this, Restaurante, imagenes);
        lista.setAdapter(adapter);


        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Inicio");
        Toast cl = Toast.makeText(getApplicationContext(), "bienvenido a inicio", Toast.LENGTH_SHORT);
        cl.show();
        tabs.addTab(spec);


        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Platos1");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Platos2");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        switch (id) {
            case R.id.configuracion:
                return true;
            //
            case R.id.reportes:
                return true;
            //
            case R.id.cliente:
                Toast cl = Toast.makeText(getApplicationContext(), "bienvenido a cliente", Toast.LENGTH_SHORT);
                cl.show();
                return true;
                //
            case R.id.producto:
                Toast pr = Toast.makeText(getApplicationContext(), "bienvenido a producto", Toast.LENGTH_SHORT);
                pr.show();
                return true;

            case R.id.categoria:
                Toast cat = Toast.makeText(getApplicationContext(), "bienvenido a categoria", Toast.LENGTH_SHORT);
                cat.show();
                return true;
            case R.id.vendedor:
                Toast ven = Toast.makeText(getApplicationContext(), "bienvenido a vendedor", Toast.LENGTH_SHORT);
                ven.show();
                return true;
            case R.id.repProducto:
                Toast rppro = Toast.makeText(getApplicationContext(), "bienvenido a reporteProducto", Toast.LENGTH_SHORT);
                rppro.show();
                return true;

            case R.id.repVenta:
                Toast rpvent = Toast.makeText(getApplicationContext(), "bienvenido a reporteVenta", Toast.LENGTH_SHORT);
                rpvent.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
    public void img1 (View view) {
        startActivity(new Intent(this, img1.class));
    }
    public void img2 (View view) {
        startActivity(new Intent(this, img2.class));
    }
    public void img3 (View view) {
        startActivity(new Intent(this, img3.class));
    }
    public void img4 (View view) {
        startActivity(new Intent(this, img4.class));
    }
    public void img5 (View view) {
        startActivity(new Intent(this, img5.class));
    }
    public void img6 (View view) {
        startActivity(new Intent(this, img6.class));
    }


}
