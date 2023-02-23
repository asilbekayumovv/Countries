package uz.itschool.countries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import uz.itschool.countries.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = mutableListOf<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createUser()

        var adapter = Adapter(this, list)
        binding.main.adapter = adapter

        binding.main.setOnItemClickListener { _, _, i, _ ->
            var user = list[i]
            var intent = Intent(this, More_info::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        }


    }

    private fun createUser() {
        list.add(
            User(
                "Uzbekistan",
                "38,93 mln",
                "652,860 km²",
                R.drawable.uzbekistan,
            
            )
        )
        list.add(
            User(
                "Spain",
                "2,87 mln",
                "27,400 km²",
                R.drawable.spain
           
            )
        )

        list.add(
            User(
                "Argentina",
                "43,85 mln",
                "2,38 mln km²",
                R.drawable.argentina
        ))
        list.add(
            User(
                "kazakhstan",
                "77 265",
                "470 km²",
                R.drawable.kazak
        ))
        list.add(
            User(
                "Portugal",
                "32,86 mln",
                "1,24 mln km²",
                R.drawable.portugal
       
        ))
        list.add(
            User(
                "Italy",
                "45,19 mln",
                "2,73 mln km²",
                R.drawable.italy
            
            )
        )
        list.add(
            User(
                "Russia",
                "2,96 mln",
                "28,470 km²",
                R.drawable.russia
       
            )
        )
        list.add(
            User(
                "Australia",
                "25,49 mln",
                "7,68 mln km²",
                R.drawable.australia            )
        )
        list.add(
            User(
                "Azerbaijan",
                "10,13 mln",
                "82,658 km²",
                R.drawable.azerbajian
            )
        )
        list.add(
            User(
                "Brazil",
                "212,55 mln",
                "8,35 mln km²",
                R.drawable.brazil
            )
        )
        list.add(
            User(
                "China",
                "1,43 bln",
                "9,38 mln km²",
                R.drawable.china)
        )
        list.add(
            User(
                "Canada",
                "37,74 mln",
                "9,09 mln km²",
                R.drawable.canada         )
        )
        list.add(
            User(
                "England",
                "5,09 mln",
                "51,060 km²",
                R.drawable.england)
        )
        list.add(
            User(
                "Croatia",
                "4,10 mln",
                "55,960 km²",
                R.drawable.croatia)
        )


        list.add(
            User(
                "Turkmenistan",
                "59.39 mln",
                "1.22 mln km²",
                R.drawable.turkmenistan )
        )
    }
}