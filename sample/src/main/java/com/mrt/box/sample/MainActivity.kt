package com.mrt.box.sample

import androidx.lifecycle.ViewModelProviders
import com.mrt.box.android.BoxActivity
import com.mrt.box.android.BoxRenderer
import com.mrt.box.android.BoxViewInitializer
import com.mrt.box.core.Box

class MainActivity : BoxActivity<MainState, MainEvent, MainSideEffect>() {

    init {
        Box.enableLog()
    }

    override val renderer: BoxRenderer<MainState, MainEvent>? = MainRenderer
    override val viewInitializer: BoxViewInitializer<MainState, MainEvent>?
        get() = MainInitView
    override val layout: Int
        get() = R.layout.activity_main

    override val vm: MainVm by lazy {
        ViewModelProviders.of(this).get(MainVm::class.java)
    }
}
