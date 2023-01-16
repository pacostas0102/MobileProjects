package com.sigmotoa.rym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.sigmotoa.rym.databinding.ActivityMainBinding
import java.text.FieldPosition

class MainActivity : AppCompatActivity(), onClickListener {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(getCharacters(), listener = this)
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getCharacters():MutableList<User>
    {val users= mutableListOf<User>()
        val rachel=User(1,"Rachel", R.drawable.rachel)
        val courtney=User(2,"Courtney", R.drawable.courtney)
        val joey=User(3,"Joey", R.drawable.joey)

        users.add(rachel)
        users.add(courtney)
        users.add(joey)
        users.add(rachel)
        users.add(courtney)
        users.add(joey)
        users.add(rachel)
        users.add(courtney)
        users.add(joey)
        users.add(rachel)
        users.add(courtney)
        users.add(joey)


        return users
    }

    override fun onClick(user: User, position: Int) {
        Toast.makeText(this, "$position: ${user.getFullName()}" ,
            Toast.LENGTH_SHORT).show()
    }
}