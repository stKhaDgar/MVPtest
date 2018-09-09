package com.example.stmak.mvptest

interface MainActivityContract {
    interface IView{
        fun displayToastMessage() = Unit
    }

    interface IPresenter{
        fun clickedToastButton() = Unit
    }
}