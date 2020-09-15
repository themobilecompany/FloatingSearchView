/*
 *     tom5079/FloatingSearchView was ported from arimorty/FloatingSearchView
 *
 *     Copyright 2015 Ari C.
 *     Copyright 2020 tom5079
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package xyz.quaver.floatingsearchview.util.adapter

import android.view.GestureDetector
import android.view.MotionEvent

abstract class GestureDetectorListenerAdapter : GestureDetector.OnGestureListener {

    override fun onShowPress(e: MotionEvent?) {}
    override fun onLongPress(e: MotionEvent?) {}
    override fun onDown(e: MotionEvent?): Boolean = false
    override fun onSingleTapUp(e: MotionEvent?): Boolean = false
    override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, x: Float, y: Float): Boolean = false
    override fun onFling(e1: MotionEvent?, e2: MotionEvent?, x: Float, y: Float): Boolean = false

}