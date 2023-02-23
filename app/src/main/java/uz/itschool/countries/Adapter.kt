package uz.itschool.countries

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import uz.itschool.countries.databinding.ActivityItemUserBinding


class Adapter(context: Context, var users: MutableList<User>)
    :

    ArrayAdapter<User>(context, R.layout.activity_item_user, users) {

    override fun getCount(): Int {
        return users.size
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var binding: ActivityItemUserBinding
        if (convertView == null) {
            binding = ActivityItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        }else{
            binding= ActivityItemUserBinding.bind(convertView)
        }
        val user = users.get(position)
        binding.img.setImageResource(user.img)
        binding.name.text = user.name
        binding.population.text = user.population
        binding.area.text = user.area

        return binding.root
    }
}