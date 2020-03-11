package android.latihan.resep_jawa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*

class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartedThisActivity = getIntent()

        part_foto.setImageResource(getIntent().getStringExtra("foto").toInt())
        part_title.text = getIntent().getStringExtra("resepNama")
        entire_resep.text = getIntent().getStringExtra("desc")
    }
}