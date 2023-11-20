package es.iesoretania.ejemplolistenerkotlin

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

fun Context?.toast(text: CharSequence, duration: Int = Toast.LENGTH_LONG)
    = this?.let { Toast.makeText(it, text, duration).show() }
fun Context?.toast(@StringRes textId: Int, duration: Int = Toast.LENGTH_LONG)
    = this?.let { Toast.makeText(it, textId, duration).show() }