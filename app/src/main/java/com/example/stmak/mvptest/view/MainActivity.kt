package com.example.stmak.mvptest.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.stmak.mvptest.MainActivityContract
import com.example.stmak.mvptest.R
import com.example.stmak.mvptest.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityContract.IView {
    lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenter(this)

        bt_find.setOnClickListener {
            presenter.clickedButton()
        }
    }

    override fun insertImage(image: String) {
        Toast.makeText(this, image, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}
