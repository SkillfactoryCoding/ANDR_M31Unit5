package com.skill_factory.unit5

import androidx.databinding.BaseObservable

data class Unit(var str: Int, var dex: Int, var wis: Int, var charPoint: Int) : BaseObservable() {
    fun reset(){
        charPoint += str + dex + wis;
        str = 0; dex = 0; wis = 0;
        //Has been changed all properties
        notifyChange()
    }
}
