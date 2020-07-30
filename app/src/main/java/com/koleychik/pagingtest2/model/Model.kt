package com.koleychik.pagingtest2.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Model(val name : String) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}