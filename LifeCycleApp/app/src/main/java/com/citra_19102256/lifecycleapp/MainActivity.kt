package com.citra_19102256.lifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity: AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPageActivity: Button = findViewById(R.id.btnPage)
        btnPageActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnPage->{
                val intent = Intent (this@MainActivity, HalamanDuaActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun printState(msg: String){
        Log.d("ActivityState",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }
    override fun onStart(){
        super.onStart()
        printState("Halaman satu On Start")
    }
    override fun onResume(){
        super.onResume()
        printState("Halaman satu On Resume")
    }
    override fun onPause(){
        super.onPause()
        printState("Halaman satu On Pause")
    }
    override fun onStop(){
        super.onStop()
        printState("Halaman satu On Stop")
    }
    override fun onRestart(){
        super.onRestart()
        printState("Halaman satu On Restart")
    }
    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman satu On Destroy")
    }

}