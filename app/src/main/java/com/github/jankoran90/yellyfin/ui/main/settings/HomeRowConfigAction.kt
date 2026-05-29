package com.github.jankoran90.yellyfin.ui.main.settings

sealed interface HomeRowConfigAction {
    data object Combine : HomeRowConfigAction

    data object Split : HomeRowConfigAction
}
