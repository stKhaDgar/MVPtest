package com.example.stmak.mvptest.model

import com.example.stmak.mvptest.MainActivityContract

class MainActivityModel : MainActivityContract.IModel {
    override fun loadImage(): String {
        return "Hello, world!"
    }
}