package com.example.stmak.mvptest.presenter
import com.example.stmak.mvptest.MainActivityContract
import com.example.stmak.mvptest.model.MainActivityModel

class MainActivityPresenter(private var view: MainActivityContract.IView) : MainActivityContract.IPresenter {
    private var model: MainActivityContract.IModel = MainActivityModel()
    private lateinit var image: String

    override fun clickedButton() {
        image = model.loadImage()
        view.insertImage(image)
    }

    override fun onDestroy() {

    }
}