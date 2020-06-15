package com.example.viewmodelwithlivedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val model: UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model.currentName.observe(this, Observer<String> { newName ->
            tv_name.text = newName
        })

        val phoneNumObserver = Observer<String> { newPhoneNum ->
            tv_phone.text = newPhoneNum
        }
        model.currentPhoneNum.observe(this, phoneNumObserver)

        btn_main.setOnClickListener {
            val name = "Jiyong"
            val phoneNum = "01012345678"
            model.currentName.setValue(name)
            model.currentPhoneNum.setValue(phoneNum)
        }
    }

}