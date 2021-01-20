package cl.eme.pruebasuperheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
Instrucciones Generales

1.[X] Crear un proyecto para Kotlin y definir el nombre de la app.
2.[X] Agregar el permiso de Internet al manifiesto.

HITO 1:
Persistencia de Datos con ROOM

3.[X] Agregar ROOM como dependencia.
4.[X] Definir la Data Class de nombre SuperheroCharacter que va a servir como entidad de la DB.
Esta misma clase puede ser utilizada para procesar la respuesta de la API dada la naturaleza del problema.
5.[X] Definir la interfaz Dao para obtener y guardar los personajes.
6.[X] Agregar la clase que extiende de RoomDatabase y que será construida por Room.databaseBuilder.
7.[X] Crear la función getDatabase que permita obtener una instancia única de la BD. Una forma de hacerlo es usando el patrón Singleton, por ejemplo:...

Consumo de API

8.[X] Agregar Retrofit como dependencia. Para convertir JSON una alternativa es utilizar Gson  agregando la dependencia (implementation 'com.squareup.retrofit2:converter-gson:2.6.0').
9.[X] Crear la interfaz para consumir la API REST que tiene los superhéroes. El endpoint que se va a utilizar es /all.json  para obtener la lista completa de superhéroes.
10.[X] Crear la implementación para utilizar Retrofit. La forma recomendada es utilizar un factory que devuelve la instancia del servicio a utilizar. Por ejemplo:

Repository

11.[ ] Crear el repositorio (la clase que implementa el patrón Repository) que permite acceder y actualizar los datos. Para esto se debe:
[ ] Exponer la información de la DB usando DAO y LiveData.
[ ] Una función que permita actualizar la lista de superheroes desde la API.

HITO 2
MVVM

1.[ ] Crear el ViewModel extendiendo desde AndroidViewModel.
2.[ ] El ViewModel accede a la información usando Repository,por lo que debe contener una instancia del repositorio.
3.[ ] Al inicializarse el ViewModel debe llamar al repositorio para obtener la lista de superhéroes.
4.[ ] El ViewModel guarda la lista de superhéroes que recupera desde el repositorio para ser consumida por la vista usando LiveData.

View
5.[ ] Crear el layout para el ítem de la lista.
6.[ ] Adaptar el layout principal agregando el RecyclerView.
7.[ ] Crear el adaptador a utilizar en el RecyclerView (Adapter + ViewHolder) y asignarlo al RecyclerView.
8.[ ] Usando el ViewModel, observar los cambios en la lista de superhéroes y actualizar el adaptador con la nueva información.

Opcionales

1.[ ] Al hacer click sobre un ítem de la lista desplegar el detalle del superhéroe.
2.[ ] Agregar una imagen a cada ítem, modificando la clase SuperheroCharacter para que pueda leer de la API y almacenar en la DB las url de las imágenes.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}