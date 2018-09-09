package com.example.stmak.mvptest.presenter
import android.content.Context
import com.example.stmak.mvptest.MainActivityContract
import com.example.stmak.mvptest.model.MainActivityModel

class MainActivityPresenter(private var view: MainActivityContract.IView, context: Context) : MainActivityContract.IPresenter, MainActivityContract.ICallback {
    private var model: MainActivityContract.IModel = MainActivityModel(context, this)

    override fun clickedButton() {
        model.loadImage()
    }

    override fun callingBack(image: String) {
        view.insertImage(image)
    }

    override fun onDestroy() {
    }
}