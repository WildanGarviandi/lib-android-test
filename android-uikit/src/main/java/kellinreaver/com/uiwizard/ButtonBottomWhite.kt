package kellinreaver.com.uiwizard

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class ButtonBottomWhite : RelativeLayout {

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        View.inflate(context, R.layout.button_login_white, this)
        isClickable = false
    }

    fun setComponentText(title: String, desc: String) {
        val titleText = findViewById<TextView>(R.id.title_view_button)
        val descText = findViewById<TextView>(R.id.desc_view_button)

        titleText.text = title
        descText.text = desc
    }

    fun setOnClickButtonSeeMore(listener: OnClickListener) {
        val btnSee = findViewById<Button>(R.id.cv_button_loggin_white)
        btnSee.setOnClickListener({ view -> listener.onClick(view) })
    }
}
