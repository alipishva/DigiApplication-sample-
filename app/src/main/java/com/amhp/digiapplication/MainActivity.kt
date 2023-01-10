package com.amhp.digiapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.amhp.digiapplication.databinding.ActivityMainBinding
import com.amhp.digiapplication.viewModel.MainViewModel

private const val TAG = "ali"

class MainActivity : FragmentActivity() {
    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]


        viewModel.getHome()

        viewModel.homeSliderLiveData.observe(this) {

            it.slider.forEach { slider ->
                Log.i(TAG , "---------Slider-----------> ${slider.pic} ")
            }

//            attach indicator to viewPager
//            binding.sliderIndicator.attachTo(binding.bannerSliderViewPager)

            it.slider_mini.forEach { sliderMini ->
                Log.i(TAG , "---------Slider Mini-----------> ${sliderMini.pic} ")
            }


        }

    }
}