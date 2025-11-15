package com.example.lab_week_10

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.lab_week_10.viewmodels.TotalViewModel

class MainActivity : AppCompatActivity() {

    // ViewModel dengan lazy
    private val viewModel by lazy {
        ViewModelProvider(this)[TotalViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prepareViewModel()
    }

    // Update tampilan text_total
    private fun updateText(total: Int) {
        val textTotal = findViewById<TextView>(R.id.text_total)
        textTotal.text = getString(R.string.text_total, total)
    }

    // Menghubungkan ViewModel dengan UI (versi modul)
    private fun prepareViewModel() {

        // Observe LiveData (versi modul)
        viewModel.total.observe(this) { totalValue ->
            updateText(totalValue)
        }

        // Button increment
        findViewById<Button>(R.id.button_increment).setOnClickListener {
            viewModel.incrementTotal()
        }
    }
}
