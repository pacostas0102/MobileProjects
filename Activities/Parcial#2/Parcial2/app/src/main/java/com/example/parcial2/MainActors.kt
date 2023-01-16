package com.example.parcial2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime.now
import java.time.ZonedDateTime
import java.util.*
import java.util.Calendar.DATE

class MainActors : AppCompatActivity() {
    var first_name: String = ""
    var last_name: String = ""
    var born_day: Int = 0
    var born_month: Int = 0
    var born_year: Int = 0
    var edad: Int = 0
    var añoActual=Calendar.getInstance().get(Calendar.YEAR)
    var mes_actual: Int = 0
    var dia_actual: Int = 0
    var awards: String = ""
    var movies: String = ""
    var website: String = ""
    var instagram: String = ""

    var actualDate= Date (System.currentTimeMillis())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_actors)
        setSupportActionBar(findViewById(R.id.toolbar))

        val firstActor: ImageButton = findViewById(R.id.firstActor)
        val secondActor: ImageButton = findViewById(R.id.secondActor)
        val thirdActor: ImageButton = findViewById(R.id.thirdActor)
        val fourthActor: ImageButton = findViewById(R.id.fourthActor)
        val fifthActor: ImageButton = findViewById(R.id.fifthActor)
        val sixthActor: ImageButton = findViewById(R.id.sixthActor)
        val seventhActor: ImageButton = findViewById(R.id.seventhActor)
        val eighthActor: ImageButton = findViewById(R.id.eighthActor)
        val ninthActor: ImageButton = findViewById(R.id.ninthActor)

        val imageActor: ImageView = findViewById(R.id.imageActor)

        val actorNombre: TextView = findViewById(R.id.actorNombre)
        val actorFechaNacimiento: TextView = findViewById(R.id.actorFechaNacimiento)
        val actorPremios: TextView = findViewById(R.id.actorPremios)
        val actorPeliculas: TextView = findViewById(R.id.actorPeliculas)
        val actorWebSite: TextView = findViewById(R.id.actorWebSite)
        val actorInstagram: TextView = findViewById(R.id.actorInstagram)
        val actorEdad:  TextView = findViewById(R.id.actorEdad)

        val checkNombre: CheckBox = findViewById(R.id.checkNombre)
        val checkFecha: CheckBox = findViewById(R.id.checkFecha)
        val checkPremios: CheckBox = findViewById(R.id.checkPremios)
        val checkPeliculas: CheckBox = findViewById(R.id.checkPeliculas)
        val checkWebSite: CheckBox = findViewById(R.id.checkWebSite)
        val checkInstagram: CheckBox = findViewById(R.id.checkInstagram)

        val characterButton: Button = findViewById(R.id.characterButton)

        DefaultFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram,checkNombre,checkFecha,checkPremios,checkPeliculas,checkWebSite,checkInstagram)
        characterButton.setOnClickListener {
            Toast.makeText(this, "Seleccione un actor", Toast.LENGTH_SHORT).show()
        }
        firstActor.setOnClickListener{
            if(firstActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram,checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.markwatney)
                first_name = "Matt"
                last_name = "Damon"
                born_day = 8
                born_month = 10
                born_year = 1970
                awards = "Damon ha sido recononido con diversos premios, algunos de estos son: Galardón al mejor guión original, 2 globos de oro a mejor guión, globo de oro a mejor actor de comedia o musical, dos premios de la critica cinematografica por actor revelación y mejor guión original, estrella en el paseo de la fama de Hollywood. "
                movies = "Algunas de las peliculas principales en las cuales este actor ha participado son: School Ties, Good Will Hunting, Saving Private Ryan, Dogma, Ocean's Eleven, saga de Jason Bourne, Invictus, The Martian. "
                website = "No disponible"
                instagram = "@mattdamonteam"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }
        secondActor.setOnClickListener{
            if(secondActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.lewis)
                first_name = "Jessica"
                last_name = "Chastain"
                born_day = 24
                born_month = 3
                born_year = 1977
                awards = "Jessica ha sido recononida con diversos premios, algunos de estos son: Premio Óscar en la categoría de Mejor Actriz, Premio del Seattle International Film Festival a la mejor actriz, Premio a la actriz revelación del Hollywood Film Festival, Georgia Film Critics Association Award a la mejor actriz de reparto, Kansas City Film Critics Circle Award a la mejor actriz, LAFCA Award a la mejor actriz de reparto, National Society of Film Critics Award a la mejor actriz de reparto, New York Film Critics Circle Award a la mejor actriz de reparto, Premios de la Sociedad de Críticos de Cine Online a la mejor actriz de reparto, Satellite a la mejor actriz de reparto - drama, Vancouver Film Critics Circle Award a la mejor actriz de reparto."
                movies = "Algunas de las peliculas principales en las cuales esta actriz ha participado son: Romeo y Julieta, The Debt, Take Shelter, Madagascar 3, Interstellar, Mama, The Martian, Dark Phoenix, Ava, Miss Sloane."
                website = "No disponible"
                instagram = "@jessicachastain"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }
        thirdActor.setOnClickListener{
            if(thirdActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.venkat)
                first_name = "Chiwetel"
                last_name = "Ejiofor"
                born_day = 10
                born_month = 7
                born_year = 1977
                awards = "Chiwetel ha sido recononido con diversos premios, algunos de estos son: Mejor actor teatral, Premio Jack Tinker, BAFTA-Mejor Actor, Premio Independent Spirit al mejor actor de reparto, Comendador de la Orden del Imperio británico, Premio Laurence Olivier."
                movies = "Algunas de las peliculas principales en las cuales este actor ha participado son: Deadly Voyage, Amistad,  G:MT Greenwich Mean Time, It Was an Accident, Mind Games, My Friend Soweto, Murder in Mind,  Negocios ocultos, Tsunami: The Aftermath, Talk to Me, Endgame, 2012, 12 años de esclavitud, The Martian, Doctor Strange, El rey león, Infinite, Doctor Strange in the Multiverse of Madness, Maleficent: Mistress of Evil, Infinite."
                website = "No disponible"
                instagram = "@chiwetelejiofor"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento, actorEdad, actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }
        fourthActor.setOnClickListener{
            if(fourthActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.mindy)
                first_name = "Mackenzie"
                last_name = "Davis"
                born_day = 1
                born_month = 4
                born_year = 1987
                awards = "Mackenzie ha sido recononida con diversos premios, algunos de estos son: Monster Fest Award for her work in Best Performance in a Feature Film (Female), Tribeca Film Festival for her work in Best Actress in a U.S. Narrative Feature, Napa Valley Film Festival Award for her work in Special Jury Award – Best Breakout Performance, Tacoma Film Festival Award for her work in Best Performance, Critics' Choice Super Awards for her work in Best Actress in a Science Fiction/Fantasy Series."
                movies = "Algunas de las peliculas principales en las cuales esta actriz ha participado son: Smashed, What If, That Awkward Moment, Freaks of Nature, The Martian, Blade Runner 2049, The Turning."
                website = "No disponible"
                instagram = "@tmackenziedavis"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento,actorEdad,  actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }
        fifthActor.setOnClickListener{
            if(fifthActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.mitch)
                first_name = "Sean"
                last_name = "Bean"
                born_day = 17
                born_month = 4
                born_year = 1959
                awards = "Sean ha sido recononido con diversos premios, algunos de estos son: Phoenix Film Critics Society Award for his work in Best Acting Ensemble, Online Film Critics Society Award for his work in Best Ensemble, Phoenix Film Critics Society Award for his work in Best Acting Ensemble, Screen Actors Guild Award for his work in Outstanding Performance by a Cast in a Motion Picture, BAFTA Award for his work in Leading Actor, Royal Television Society Awards for his work in Best Actor."
                movies = "Algunas de las peliculas principales en las cuales este actor ha participado son: The Field, Patriot Games, Black Beauty, The Lord of the Rings: The Fellowship of the Ring, Don't Say a Word, The Lord of the Rings: The Two Towers, Troy, Silent Hill, Percy Jackson & the Olympians: The Lightning Thief, The Martian."
                website = "No disponible"
                instagram = "@tmackenziedavis"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento, actorEdad, actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }
        sixthActor.setOnClickListener{
            if(sixthActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.teddy)
                first_name = "Jeff"
                last_name = "Daniels"
                born_day = 19
                born_month = 2
                born_year = 1955
                awards = "Jeff ha sido recononido con diversos premios, algunos de estos son: Emmy a Mejor actor - Serie dramática, Emmy a Mejor actor de reparto - Miniserie o telefilme."
                movies = "Algunas de las peliculas principales en las cuales este actor ha participado son: Ragtime, Terms of Endearment, Aracnofobia, Gettysburg, Speed, 101 Dalmatians, Fly Away Home, The Lookout, Infamous, Steve Jobs, The Martian."
                website = "https://www.jeffdaniels.com/"
                instagram = "@jeffdanielsofficial"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento,actorEdad,  actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }
        seventhActor.setOnClickListener{
            if(seventhActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.vogel)
                first_name = "Aksel"
                last_name = "Hennie"
                born_day = 29
                born_month = 10
                born_year = 1975
                awards = "Aksel ha sido recononido con diversos premios, algunos de estos son: Amanda Award for his work in Best Actor"
                movies = "Algunas de las peliculas principales en las cuales este actor ha participado son: 1732 Høtten, Hawaii, Oslo, Terkel in Trouble, Max Manus: Man of War, Headhunters, Hércules, The Martian, The Cloverfield Paradox."
                website = "No disponible"
                instagram = "@akselhennie"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento, actorEdad, actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }
        eighthActor.setOnClickListener{
            if(eighthActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.guoming)
                first_name = "Eddy"
                last_name = "Ko"
                born_day = 30
                born_month = 11
                born_year = 1936
                awards = "No Disponible"
                movies = "Algunas de las peliculas principales en las cuales este actor ha participado son: The Invincible Iron Palm, The Notorious Ones, Mad Mad 83, Lone Ninja Warrior, Lethal Weapon 4, The Martian, Son of the Dragon."
                website = "No disponible"
                instagram = "@eddiik"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento,actorEdad,  actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }
        ninthActor.setOnClickListener{
            if(ninthActor.isClickable){
                ActiveFields(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)
                imageActor.setImageResource(R.drawable.reporter)
                first_name = "Nikolett"
                last_name = "Barabas"
                born_day = 4
                born_month = 8
                born_year = 1979
                awards = "No Disponible"
                movies = "Algunas de las peliculas principales en las cuales esta actriz ha participado son: Curtiz, L'Idéal, The Martian, Magic Boys."
                website = "No disponible"
                instagram = "@nikolett_barabas"
                edad= show_age()
                setActorFields(actorNombre, actorFechaNacimiento, actorEdad, actorPremios,actorPeliculas, actorWebSite, actorInstagram )
                characterButton.setOnClickListener {
                    val intent = Intent(this, Character_Info::class.java)
                    intent.putExtra("firstName", "${first_name} ${last_name}")
                    startActivity(intent)
                }
            }
        }

    }
    private fun DefaultFields(actorNombre: TextView, actorFechaNacimiento: TextView,actorEdad: TextView, actorPremios: TextView, actorPeliculas: TextView,actorWebSite: TextView,actorInstagram: TextView, checkNombre: CheckBox,checkFecha : CheckBox,checkPremios : CheckBox, checkPeliculas : CheckBox,checkWebSite: CheckBox,checkInstagram: CheckBox ){
        actorNombre.setVisibility(View.GONE)
        actorFechaNacimiento.setVisibility(View.GONE)
        actorPremios.setVisibility(View.GONE)
        actorPeliculas.setVisibility(View.GONE)
        actorWebSite.setVisibility(View.GONE)
        actorInstagram.setVisibility(View.GONE)
        actorEdad.setVisibility(View.GONE)
        checkNombre.setEnabled(false)
        checkFecha.setEnabled(false)
        checkPeliculas.setEnabled(false)
        checkPremios.setEnabled(false)
        checkWebSite.setEnabled(false)
        checkInstagram.setEnabled(false)
    }
    private fun DefaultFieldsTextViews(actorNombre: TextView, actorFechaNacimiento: TextView,actorEdad: TextView,actorPremios: TextView, actorPeliculas: TextView,actorWebSite: TextView,actorInstagram: TextView, checkNombre: CheckBox,checkFecha : CheckBox,checkPremios : CheckBox, checkPeliculas : CheckBox,checkWebSite: CheckBox,checkInstagram: CheckBox){
        actorNombre.setVisibility(View.GONE)
        actorFechaNacimiento.setVisibility(View.GONE)
        actorPremios.setVisibility(View.GONE)
        actorPeliculas.setVisibility(View.GONE)
        actorWebSite.setVisibility(View.GONE)
        actorInstagram.setVisibility(View.GONE)
        actorEdad.setVisibility(View.GONE)

        checkNombre.setChecked(false)
        checkFecha.setChecked(false)
        checkPeliculas.setChecked(false)
        checkPremios.setChecked(false)
        checkWebSite.setChecked(false)
        checkInstagram.setChecked(false)
    }
    private fun ActiveFields(actorNombre: TextView, actorFechaNacimiento: TextView,actorEdad: TextView, actorPremios: TextView, actorPeliculas: TextView,actorWebSite: TextView,actorInstagram: TextView, checkNombre: CheckBox,checkFecha : CheckBox,checkPremios : CheckBox, checkPeliculas : CheckBox,checkWebSite: CheckBox,checkInstagram: CheckBox) {

        checkNombre.setEnabled(true)
        checkFecha.setEnabled(true)
        checkPremios.setEnabled(true)
        checkPeliculas.setEnabled(true)
        checkWebSite.setEnabled(true)
        checkInstagram.setEnabled(true)

        DefaultFieldsTextViews(actorNombre, actorFechaNacimiento,actorEdad, actorPremios, actorPeliculas,actorWebSite,actorInstagram, checkNombre,checkFecha,checkPremios, checkPeliculas,checkWebSite,checkInstagram)

        checkNombre.setOnClickListener {
            if (checkNombre.isChecked) {
                actorNombre.setVisibility(View.VISIBLE)
            }else {
                actorNombre.setVisibility(View.GONE)
            }
        }
        checkFecha.setOnClickListener {
            if (checkFecha.isChecked) {
                actorFechaNacimiento.setVisibility(View.VISIBLE)
                actorEdad.setVisibility(View.VISIBLE)
            } else {
                actorFechaNacimiento.setVisibility(View.GONE)
                actorEdad.setVisibility(View.GONE)
            }
        }
        checkPremios.setOnClickListener {
            if (checkPremios.isChecked) {
                actorPremios.setVisibility(View.VISIBLE)
            } else {
                actorPremios.setVisibility(View.GONE)
            }
        }
        checkPeliculas.setOnClickListener {
            if (checkPeliculas.isChecked) {
                actorPeliculas.setVisibility(View.VISIBLE)
            } else {
                actorPeliculas.setVisibility(View.GONE)
            }
        }
        checkWebSite.setOnClickListener {
            if (checkWebSite.isChecked) {
                actorWebSite.setVisibility(View.VISIBLE)
            } else {
                actorWebSite.setVisibility(View.GONE)
            }
        }
        checkInstagram.setOnClickListener {
            if (checkInstagram.isChecked) {
                actorInstagram.setVisibility(View.VISIBLE)
            } else {
                actorInstagram.setVisibility(View.GONE)
            }
        }
    }
    private fun setActorFields(actorNombre: TextView, actorFechaNacimiento: TextView,actorEdad: TextView, actorPremios: TextView, actorPeliculas: TextView, actorWebSite: TextView, actorInstagram: TextView ){
        actorNombre.setText("${first_name} ${last_name}")
        actorFechaNacimiento.setText("${born_day}/${born_month}/${born_year}")
        actorPremios.setText("${awards}")
        actorPeliculas.setText("${movies}")
        actorWebSite.setText("${website}")
        actorInstagram.setText("${instagram}")
        actorEdad.setText("${edad} años")

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.info ->{
            msg("Developers Information")
            startActivity(Intent(this, Info_Dev::class.java))
            true
        }
        R.id.home ->{
            msg("Home")
            startActivity(Intent(this, MainActivity::class.java))
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    fun msg (msg: String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun show_age(): Int{
       // var current = LocalDate.now()
        var dateContact: Date = SimpleDateFormat("dd/MM/yyyy").parse("${born_day}/${born_month}/${born_year}")
        var diferenciaFechas = actualDate.getTime() - dateContact.getTime()
        var segundos = diferenciaFechas / 1000
        var minutos = segundos/60
        var horas = minutos/60
        var dias = horas /24
        var edad = dias /365
            return edad.toInt()
    }
}