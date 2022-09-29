package com.creartec.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.creartec.affirmations.adapter.ItemAdapter
import com.creartec.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

    }
}

/*6. Resumen
El widget de RecyclerView te ayuda a mostrar una lista de datos.
RecyclerView usa el patrón del adaptador para adaptar y mostrar los datos.
ViewHolder crea y contiene las vistas para RecyclerView.
RecyclerView incluye LayoutManagers. RecyclerView delega la distribución de los elementos a LayoutManagers.

Para implementar el adaptador, sigue estos pasos:

Crea una nueva clase para el adaptador, por ejemplo, ItemAdapter.
Crea una clase ViewHolder personalizada que represente una sola vista de elementos de lista.
Realiza la extensión desde la clase RecyclerView.ViewHolder.
Modifica la clase ItemAdapter para que se extienda desde la clase RecyclerView.Adapter con la
clase personalizada ViewHolder.
Implementa estos métodos dentro del adaptador:
getItemsCount(), onCreateViewHolder() y onBindViewHolder().*/