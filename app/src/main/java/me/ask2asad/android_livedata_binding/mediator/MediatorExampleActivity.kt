package me.ask2asad.android_livedata_binding.mediator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import me.ask2asad.android_livedata_binding.R
import me.ask2asad.android_livedata_binding.databinding.ActivityMediatorBinding

class MediatorExampleActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this).get(MediatorViewModel::class.java)

        DataBindingUtil.setContentView<ActivityMediatorBinding>(this, R.layout.activity_mediator).let {
            it.setLifecycleOwner(this)
            it.viewModel = viewModel
        }
    }
}