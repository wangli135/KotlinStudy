package com.xingfeng_coder.enum

/**
 * Created by Xingfeng on 2017-06-27.
 */
enum class ProtocoloState {

    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocoloState

}