package com.example.stmak.mvptest.presenter
import com.example.stmak.mvptest.MainActivityContract

class MainActivityPresenter(var view: MainActivityContract.view) : MainActivityContract.presenter {

    override fun clickedToastButton() {
        view.displayToastMessage()
    }
}