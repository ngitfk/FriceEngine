package org.frice.game.obj.button

import org.frice.game.event.OnMouseEvent
import org.frice.game.obj.AbstractObject
import org.frice.game.resource.graphics.ColorResource

/**
 * Created by ice1000 on 2016/8/18.
 * @author ice1000
 * @since v0.3.2
 */

interface FButton : AbstractObject {
	var text: String

	fun onClick(e: OnMouseEvent)

	fun getColor(): ColorResource
}