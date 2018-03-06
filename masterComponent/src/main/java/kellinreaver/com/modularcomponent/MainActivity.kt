package kellinreaver.com.modularcomponent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kellinreaver.com.uiwizard.ButtonBottomWhite

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customButtonView = findViewById<ButtonBottomWhite>(R.id.custom_button_white)
        setupButton(customButtonView)
    }

    private fun setupButton(customButtonView : ButtonBottomWhite) {
        customButtonView.setComponentText("Title haha", "desc aja lah ..")
        customButtonView.setOnClickButtonSeeMore(View.OnClickListener {
            Toast.makeText(this, "toast from button", Toast.LENGTH_LONG).show()
        })
    }
}
