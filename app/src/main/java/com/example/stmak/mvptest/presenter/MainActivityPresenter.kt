package com.example.stmak.mvptest.presenter
import android.content.Context
import android.util.Log
import com.example.stmak.mvptest.MainActivityContract
import com.example.stmak.mvptest.model.MainActivityModel

class MainActivityPresenter(private var view: MainActivityContract.IView, context: Context) : MainActivityContract.IPresenter, MainActivityContract.ICallback {
    private var model: MainActivityContract.IModel = MainActivityModel(context, this)
    private lateinit var image: String

    override fun clickedButton() {
        image = model.loadImage()
    }

    override fun callingBack(image: String) {
        view.insertImage(image)
        Log.e("ErrorTask", "complete callingback")
    }

    override fun onDestroy() {
    }
}