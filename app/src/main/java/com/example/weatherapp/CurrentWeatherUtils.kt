package com.example.weatherapp

import androidx.annotation.DrawableRes

object CurrentWeatherUtils {
    @DrawableRes
    fun getWeatherIconResId(weatherConditionId:Int):Int {
        return when (weatherConditionId) {
            200, 201, 202, 210, 211, 212, 221, 230, 231, 232 -> R.drawable.ic_wi_thunderstorm
            300, 301, 302, 310, 311, 312, 313, 314, 321 -> R.drawable.ic_wi_sprinkle
            500, 501, 502, 503, 504, 511, 520, 521, 522, 531, 701 -> R.drawable.ic_wi_rain
            600, 601, 602, 611, 612, 613, 615, 616, 620, 621, 622 -> R.drawable.ic_wi_snow
            711 -> R.drawable.ic_wi_smoke
            721 -> R.drawable.ic_wi_day_haze
            731, 761, 762 -> R.drawable.ic_wi_dust
            741 -> R.drawable.ic_wi_fog
            771 -> R.drawable.ic_wi_cloudy_gusts
            781 -> R.drawable.ic_wi_tornado
            800 -> R.drawable.ic_wi_day_sunny
            801, 802, 803, 804 -> R.drawable.ic_wi_cloudy
            else -> R.drawable.ic_wi_alien
        }
    }
}