package me.ask2asad.android_livedata_binding.mutable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_mutable.*
import me.ask2asad.android_livedata_binding.R
import me.ask2asad.android_livedata_binding.databinding.ActivityMutableBinding
import me.ask2asad.android_livedata_binding.mediator.MediatorExampleActivity

class MutableExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this).get(MutableViewModel::class.java)

        DataBindingUtil.setContentView<ActivityMutableBinding>(this, R.layout.activity_mutable).let {
            it.setLifecycleOwner(this)
            it.viewModel = viewModel
        }

        bt_mediator_example.setOnClickListener {
            startActivity(Intent(this, MediatorExampleActivity::class.java))
        }
    }
}
