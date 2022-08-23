package com.example.apppaintkotlin

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.apppaintkotlin.PaintView.Companion.colorList
import com.example.apppaintkotlin.PaintView.Companion.currentBrush
import com.example.apppaintkotlin.PaintView.Companion.pathList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        redColor.setOnClickListener {
            Toast.makeText(this, "Red", Toast.LENGTH_LONG).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        yellowColor.setOnClickListener {
            Toast.makeText(this, "Yellow", Toast.LENGTH_LONG).show()
            paintBrush.color = Color.YELLOW
            currentColor(paintBrush.color)
        }

        blackColor.setOnClickListener {
            Toast.makeText(this, "Black", Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        whiteColor.setOnClickListener {
            Toast.makeText(this, "Reset", Toast.LENGTH_LONG).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }

    private fun currentColor(color: Int) {
        currentBrush = color
        path = Path()
    }
}