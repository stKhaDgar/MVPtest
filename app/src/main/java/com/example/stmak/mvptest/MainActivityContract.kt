package com.example.stmak.mvptest

interface MainActivityContract {
    interface IView{
        fun insertImage(image: String)
    }

    interface IPresenter{
        fun clickedButton()
        fun onDestroy()
    }

    interface IModel{
        fun loadImage() : String
    }
}