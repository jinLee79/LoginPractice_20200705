package kr.co.tjoeun.loginpractice_20200705

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            val email = emailEdt.text.toString()
            val pwd = pwdEdt.text.toString()

            if (email == "admin@test.com" && pwd =="qwer1234"){  // JAVA:equals | Kotlin:==
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인실패", Toast.LENGTH_SHORT).show()
            }
        }
    }

}