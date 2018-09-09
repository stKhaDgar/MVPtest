package com.example.stmak.mvptest

interface MainActivityContract {
    interface view{
        fun displayToastMessage() = Unit
    }

    interface presenter{
        fun clickedToastButton() = Unit
    }
}