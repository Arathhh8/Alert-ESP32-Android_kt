package com.example.connecttofirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    var tvInfo : TextView ?= null
    var btnOnOff : Button ?= null
    var animationAlert : LottieAnimationView ?= null

    private val database = FirebaseDatabase.getInstance()
    private val referenceIn = database.getReference("btnOnOff")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvInfo = findViewById(R.id.tvInfo)
        btnOnOff = findViewById(R.id.btnOnOff)
        animationAlert = findViewById(R.id.animationAlert)
        //referenceIn.addValueEventListener()
    }

}

//private fun DatabaseReference.addValueEventListener() {
  //  var statusButton1:String = DataSnapshot.child("Valor").getValue().toString()
   // if(statusButton1.equals("true")){
     //   tvInfo.setBackground(getResources().getDrawable(R.drawable.buttonused))
// }
  //  tvInfo.setOnClickListener(new View.OnclickListener())

