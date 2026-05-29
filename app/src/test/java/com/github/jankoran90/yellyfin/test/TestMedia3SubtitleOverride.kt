package com.github.jankoran90.yellyfin.test

import com.github.jankoran90.yellyfin.util.Media3SubtitleOverride
import org.junit.Assert
import org.junit.Test

class TestMedia3SubtitleOverride {
    @Test
    fun test() {
        // This tests whether the class and field names exist
        Media3SubtitleOverride(2f)
        Assert.assertTrue(Media3SubtitleOverride.Companion.initialized)
    }
}
