package com.example.dodgelnstentedge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var bottomSheetBehavior: BottomSheetBehavior<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomSheetBehavior=BottomSheetBehavior.from(botton_sheet)

        fab.setOnClickListener {v ->
            Snackbar.make(v,"This is snakebar mister Gevim",Snackbar.LENGTH_LONG).show()

        }

        bottom.setOnClickListener {

            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HALF_EXPANDED)

        }
    }
}
