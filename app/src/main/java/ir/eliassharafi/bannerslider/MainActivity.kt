package ir.eliassharafi.bannerslider


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ir.eliassharafi.bannersliderlibrary.BannerLayout
import ir.eliassharafi.bannersliderlibrary.BaseBannerAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val banner: BannerLayout = findViewById<View>(R.id.Banner) as BannerLayout

        val urls: MutableList<String> = ArrayList()
        urls.add("http://szzljy.com/images/mountain/mountain4.jpg")
        urls.add("http://szzljy.com/images/mountain/mountain4.jpg")
        urls.add("http://www.visitgreece.gr/deployedFiles/StaticFiles/Photos/Generic%20Contents/Forests/mountains_2_560.jpg")
        urls.add("http://szzljy.com/images/mountain/mountain4.jpg")
        urls.add("http://www.visitgreece.gr/deployedFiles/StaticFiles/Photos/Generic%20Contents/Forests/mountains_2_560.jpg")
        urls.add("http://szzljy.com/images/mountain/mountain4.jpg")


        val webBannerAdapter = BaseBannerAdapter(this, urls)
        webBannerAdapter.setOnBannerItemClickListener {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        }
        banner.setAdapter(webBannerAdapter)

    }
}