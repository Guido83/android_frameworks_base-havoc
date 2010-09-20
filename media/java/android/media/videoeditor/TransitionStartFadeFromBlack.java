/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.media.videoeditor;

/**
 * This transition fades from black using fade-in in a certain provided
 * duration. This transition is always applied at the beginning of the movie.
 * {@hide}
 */
public class TransitionStartFadeFromBlack extends Transition {
    /**
     * An object of this type cannot be instantiated by using the default
     * constructor
     */
    @SuppressWarnings("unused")
    private TransitionStartFadeFromBlack() {
        this(null, null, 0, Transition.BEHAVIOR_LINEAR);
    }

    /**
     * Constructor
     *
     * @param transitionId The transition id
     * @param beforeMediaItem The transition is applied to the beginning of
     *      this media item
     * @param durationMs The duration of the transition in milliseconds
     * @param behavior The transition behavior
     */
    public TransitionStartFadeFromBlack(String transitionId, MediaItem beforeMediaItem,
            long durationMs, int behavior) {
        super(transitionId, null, beforeMediaItem, durationMs, behavior);
    }

    /*
     * {@inheritDoc}
     */
    @Override
    public void generate() {
    }
}
