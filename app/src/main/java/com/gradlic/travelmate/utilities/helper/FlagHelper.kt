package com.gradlic.travelmate.utilities.helper

import com.blongho.country_data.World

class FlagHelper {
    companion object {
        fun retrieveFlagDrawable(country: String) : Int {
            return World.getCountryFrom(country).flagResource
        }
    }
}