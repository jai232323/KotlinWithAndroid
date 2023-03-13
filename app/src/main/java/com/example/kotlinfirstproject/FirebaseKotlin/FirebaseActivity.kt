package com.example.kotlinfirstproject.FirebaseKotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.kotlinfirstproject.R
import com.example.kotlinfirstproject.databinding.ActivityFirebaseBinding
import com.google.firebase.database.*

class FirebaseActivity : AppCompatActivity() {


    private lateinit var reference: DatabaseReference

    private lateinit var binding : ActivityFirebaseBinding

    private lateinit var userList: MutableList<User1>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFirebaseBinding.inflate(layoutInflater)

        setContentView(binding.root)

        getData()


        reference = FirebaseDatabase.getInstance().getReference("Users")

        binding.btnSave.setOnClickListener {


            val id = reference.push().key.toString()
            val userName = binding.etName.text.toString()
            val userAge = binding.etAge.text.toString()

            if (userName.isEmpty())
            {
                binding.etName.setError("Required Name")
                binding.etName.requestFocus()
            }else if (userAge.isEmpty())
            {
                binding.etAge.setError("Required Age")
                binding.etAge.requestFocus()
            }else{
                val users = Users(id,userName,userAge)

                reference.child(id).setValue(users).addOnCompleteListener {

                    Toast.makeText(this,"Added Successfully",Toast.LENGTH_SHORT).show()

                }.addOnFailureListener {
                    Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
                }

            }

        }



    }

    private fun getData() {

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        userList = arrayListOf<User1>()

        reference = FirebaseDatabase.getInstance().getReference("Users")
        reference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                userList.clear()

                if (snapshot.exists())
                {
                    for (userSnapshot in snapshot.children)
                    {
                        val user = userSnapshot.getValue(User1::class.java)



                        userList.add(user!!)


                    }

                    binding.recyclerView.adapter = UserAdapter(userList,this@FirebaseActivity)
                }


            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })


    }
}

private fun Any.postDelayed(runnable: Runnable) {

}
