package com.amhp.digiapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


data class ModelHome(val slider : List<Slider> , val slider_mini : List<SliderMini> , val status : String)

data class Slider(val date : String , val idslider : String , val iduser : String , val layer : String , val name : String , val pic : String , val type : String , val `val` : String)


data class SliderMini(val date : String , val idslider : String , val iduser : String , val layer : String , val name : String , val pic : String , val type : String , val `val` : String)