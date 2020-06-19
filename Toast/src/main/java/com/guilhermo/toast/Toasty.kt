package com.guilhermo.toast

import android.content.Context
import android.widget.Toast

class Toasty {

    companion object {
        fun showToast(context: Context, message: String, duration: Int = Toast.LENGTH_LONG) {
            Toast.makeText(context, message, duration).show()
        }
    }

}