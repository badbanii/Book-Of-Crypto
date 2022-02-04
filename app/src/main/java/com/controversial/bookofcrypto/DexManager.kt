package com.controversial.bookofcrypto

import android.content.Context
import androidx.multidex.MultiDex

import androidx.multidex.MultiDexApplication

class DexManager: MultiDexApplication() {
    override fun attachBaseContext(base: Context)
    {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}