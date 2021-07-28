package com.github.solayw.dense

abstract class Output {
    abstract fun writeInt(value: Int)
    abstract fun writeByte(value: Int)
    abstract fun writeByteArray(value: ByteArray)

}