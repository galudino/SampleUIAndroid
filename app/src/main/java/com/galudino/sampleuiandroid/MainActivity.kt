/**
 * @file    MainActivity.kt
 * @brief   Encapsulates MainActivity class
 *
 * @author  Gemuele Aludino
 * @date    26 Sep 2021
 */

package com.galudino.sampleuiandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galudino.sampleuiandroid.databinding.ActivityMainBinding

/**
 * @class   MainActivity
 * @brief   First activity to run; encapsulates entry point of application.
 */
class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding

    /**
     * {@inheritDoc}
     *
     * Perform initialization of all fragments.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
    }
}