package com.mahmoudbashir.roommultipletableexample.Room.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.mahmoudbashir.roommultipletableexample.Room.Director
import com.mahmoudbashir.roommultipletableexample.Room.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)
