/*
 * Copyright 2023 The Android Open Source Project
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.google.samples.apps.nowinandroid.core.ui.screenshottest

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * A custom [PreviewParameterProvider] that provides a sequence of [T]s, each with a name.
 * If the name is null, the preview will be ignored for Screenshot tests.
 */
abstract class NamedPreviewParameterProvider<T> : PreviewParameterProvider<T> {
    abstract val nameToValue: Sequence<Pair<String?, T>>
    final override val values: Sequence<T>
        get() = nameToValue.map { it.second }
}
