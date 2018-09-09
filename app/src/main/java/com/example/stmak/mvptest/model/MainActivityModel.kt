package com.example.stmak.mvptest.model
import android.content.Context
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import com.example.stmak.mvptest.MainActivityContract
import org.json.JSONObject

class MainActivityModel(context: Context, private var callback: MainActivityContract.ICallback) : MainActivityContract.IModel {

    init {
        AndroidNetworking.initialize(context)
    }

    override fun loadImage(): String {
        var image = ""

        AndroidNetworking.get("https://api.unsplash.com/photos/random")
                .addQueryParameter("client_id", "dd867c1e011d5e088cba40b30db92299c48256a424fba6fa19fa931388bc0817")
                .setPriority(Priority.HIGH)
                .build()
                .getAsJSONObject(object : JSONObjectRequestListener {
                    override fun onResponse(response: JSONObject) {
                        image = response.getJSONObject("urls").getString("thumb")
                        callback.callingBack(image)
                    }

                    override fun onError(error: ANError) {
                        Log.e("ErrorTask", error.errorDetail)
                    }
                })

        return image
    }
}