package com.sigmotoa.rym

data class User(val id: Long, var name: String, var url:Int)
{
    fun getFullName():String = "$name"
}
