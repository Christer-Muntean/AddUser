package com.example.objects

class UserData(
    var firstName: String,
    var lastName: String,
    var email: String,
    private var password: String
) {
    companion object {
        fun isPasswordValid(password: String) : Boolean{
            if (password.length > 5) {
                return true
            } else {
                return false
            }
        }
    }
}