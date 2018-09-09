package com.example.stmak.mvptest.presenter
import com.example.stmak.mvptest.MainActivityContract

class MainActivityPresenter(var view: MainActivityContract.IView) : MainActivityContract.IPresenter {

    override fun clickedToastButton() {
        view.displayToastMessage()
    }
}