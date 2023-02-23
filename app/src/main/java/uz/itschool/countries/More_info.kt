package uz.itschool.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.countries.databinding.ActivityMainBinding
import uz.itschool.countries.databinding.ActivityMoreInfoBinding

class More_info : AppCompatActivity() {
    private lateinit var binding: ActivityMoreInfoBinding
    private var list = mutableListOf<User>()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_info)
        binding = ActivityMoreInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = Adapter(this, list)





    }
}