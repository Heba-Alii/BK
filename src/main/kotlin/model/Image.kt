package model

import interfaces.Listener

class Image {
  private var listener: Listener? = null
    fun setOnTouch(listener: Listener) {
        this.listener = listener
    }
}