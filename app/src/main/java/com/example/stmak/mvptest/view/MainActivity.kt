package com.example.stmak.mvptest.view
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.stmak.mvptest.MainActivityContract
import com.example.stmak.mvptest.R
import com.example.stmak.mvptest.presenter.MainActivityPresenter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityContract.IView {
    private lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenter(this, this)

        bt_find.setOnClickListener {
            presenter.clickedButton()
        }
    }

    override fun insertImage(image: String) {
        Picasso.get().load(image).into(iv_image)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}
