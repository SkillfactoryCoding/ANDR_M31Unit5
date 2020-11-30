package com.skill_factory.unit5

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.skill_factory.unit5.Stock

class User(private val _cash: Int, val stockList: ArrayList<Stock>) : BaseObservable() {
    @get:Bindable
    var cash: Int = _cash
    set(value) {
        field = value
        notifyPropertyChanged(BR.cash)
    }
}