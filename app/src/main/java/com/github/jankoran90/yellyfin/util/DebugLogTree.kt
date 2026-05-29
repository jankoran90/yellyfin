package com.github.jankoran90.yellyfin.util

import android.util.Log
import com.github.jankoran90.yellyfin.BuildConfig
import timber.log.Timber

/**
 * Enable debug logging via [Timber] if enabled in the app settings
 */
class DebugLogTree private constructor() : Timber.Tree() {
    // Only add logging for below INFO, production logger in YellyfinApplication logs >=INFO
    override fun isLoggable(
        tag: String?,
        priority: Int,
    ): Boolean = priority < Log.INFO && !BuildConfig.DEBUG

    override fun log(
        priority: Int,
        tag: String?,
        message: String,
        t: Throwable?,
    ) {
        Log.println(priority, tag ?: "Yellyfin", message)
    }

    var enabled: Boolean
        get() = Timber.forest().contains(this)
        set(value) {
            synchronized(this) {
                if (value) {
                    if (!Timber.forest().contains(this)) {
                        Timber.plant(this)
                    }
                } else {
                    if (Timber.forest().contains(this)) {
                        Timber.uproot(this)
                    }
                }
            }
        }

    companion object {
        val INSTANCE = DebugLogTree()
    }
}
