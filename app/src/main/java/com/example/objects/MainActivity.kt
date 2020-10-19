package com.example.objects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = mutableListOf<UserData>()

        addUser_button.setOnClickListener {

            if(UserData.isPasswordValid(password_editText.text.toString())){
                val userData = UserData(
                        firstName_editText.text.toString(),
                        lastName_editText.text.toString(),
                        email_editText.text.toString(),
                        password_editText.text.toString()
                )

                users.add(userData)

                status_textView.text = ""
                for (user in users){
                    status_textView.append("${user.firstName} ${user.lastName}\n${user.email}\n\n")
                }
            }else {
                status_textView.append("ikke langt nok passord")
            }
        }
    }
}