package com.mahmoudbashir.roommultipletableexample.Room.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.mahmoudbashir.roommultipletableexample.Room.School
import com.mahmoudbashir.roommultipletableexample.Room.Student


data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students:List<Student>
)
