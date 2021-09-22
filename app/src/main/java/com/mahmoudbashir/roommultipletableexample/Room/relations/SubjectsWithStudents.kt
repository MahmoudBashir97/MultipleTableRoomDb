package com.mahmoudbashir.roommultipletableexample.Room.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.mahmoudbashir.roommultipletableexample.Room.Student
import com.mahmoudbashir.roommultipletableexample.Room.Subject

data class SubjectsWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)
