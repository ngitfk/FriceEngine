package org.frice.game.anim.scale

import org.frice.game.anim.FAnim

/**
 * Created by ice1000 on 2016/8/15.
 * @author ice1000
 * @since v0.2.2
 */
abstract class ScaleAnim : FAnim() {
	abstract fun getAfter(): Pair<Double, Double>
}