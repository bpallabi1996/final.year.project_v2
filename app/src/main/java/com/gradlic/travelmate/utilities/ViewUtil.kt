@file:JvmName("ViewUtil")

package com.gradlic.travelmate.utilities

import android.view.View

inline fun View.gone() { this.visibility = View.GONE }
inline fun View.visible() { this.visibility = View.VISIBLE }
inline fun View.invisible() { this.visibility = View.INVISIBLE }