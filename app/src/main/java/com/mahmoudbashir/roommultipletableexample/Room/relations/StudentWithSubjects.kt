package com.mahmoudbashir.roommultipletableexample.Room.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.mahmoudbashir.roommultipletableexample.Room.Student
import com.mahmoudbashir.roommultipletableexample.Room.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)
