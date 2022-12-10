package com.rajendra.cvbuilderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.rajendra.cvbuilderapp.enums.EnumParams

class LoginActivity : AppCompatActivity(), OnClickListener {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //init shared preference operations
        val sharedPref = getSharedPreferences(
            EnumParams.SHARED_PREF_NAME.value, 0
        )
        if (sharedPref.getBoolean(EnumParams.IS_LOGGED_IN.value, false)) {
            openMainActivity()
        } else {
            initSharedPreference()
        }

        //init views
        emailEditText = findViewById(R.id.email_edit_text)
        passwordEditText = findViewById(R.id.password_edit_text)
        loginButton = findViewById(R.id.login_button)

        loginButton.setOnClickListener(this)
    }

    private fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun initSharedPreference() {
        val sharedPref = getSharedPreferences(
            EnumParams.SHARED_PREF_NAME.value,
            0
        )
        val editor = sharedPref.edit()
        editor.putString(
            EnumParams.USER_EMAIL.value, "rajendramaharjan@miu.edu"
        )
        editor.putString(
            EnumParams.USER_PASSWORD.value, "rajendra"
        )
        editor.putString(
            EnumParams.USER_NAME.value, "Rajendra Maharjan"
        )
        editor.putBoolean(
            EnumParams.IS_LOGGED_IN.value, false
        )
        editor.apply()
    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.login_button -> {
                if (validateFields()) {
                    if (checkAuthorization()) {

                        //set login as true
                        val sharedPref = getSharedPreferences(
                            EnumParams.SHARED_PREF_NAME.value, 0
                        )
                        val editor = sharedPref.edit()
                        editor.putBoolean(
                            EnumParams.IS_LOGGED_IN.value, true
                        )

                        editor.putString(
                            EnumParams.SHARED_PREF_NAME.value, getString(R.string.name)
                        )
                        editor.apply()

                        openMainActivity()
                    } else {
                        Toast.makeText(
                            this, "Email or Password not match!", Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
        }
    }

    private fun checkAuthorization(): Boolean {
        val sharedPref = getSharedPreferences(
            EnumParams.SHARED_PREF_NAME.value, 0
        )
        val email = sharedPref.getString(
            EnumParams.USER_EMAIL.value, ""
        )
        val password = sharedPref.getString(
            EnumParams.USER_PASSWORD.value, ""
        )
        Log.v("LoginActivity", "$email : $password")
        if (emailEditText.text.toString().trim() != email
            || passwordEditText.text.toString().trim() != password
        ) {
            return false
        }
        return true
    }

    private fun validateFields(): Boolean {
        if (emailEditText.text.isEmpty()) {
            emailEditText.error = "Email can not be empty"
            emailEditText.requestFocus()
            return false
        } else if (passwordEditText.text.isEmpty()) {
            passwordEditText.error = "Password can not be empty"
            passwordEditText.requestFocus()
            return false;
        }

        return true
    }

}