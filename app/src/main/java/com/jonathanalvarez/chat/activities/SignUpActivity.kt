package com.jonathanalvarez.chat.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.jonathanalvarez.chat.R
import com.google.firebase.auth.FirebaseUser



class SignUpActivity : AppCompatActivity() {


    private val mAuth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = mAuth.currentUser
        if(currentUser == null) {
            Toast.makeText(this," User is not logged in",Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this," User is logged in",Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)



    }


}
