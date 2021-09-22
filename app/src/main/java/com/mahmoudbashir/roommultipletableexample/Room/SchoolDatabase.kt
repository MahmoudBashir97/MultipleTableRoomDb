package com.mahmoudbashir.roommultipletableexample.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mahmoudbashir.roommultipletableexample.Room.relations.StudentSubjectCrossRef

@Database(
    entities = [
        School::class,
        Student::class,
        Director::class,
        Subject::class,
        StudentSubjectCrossRef::class
    ],
    version = 1
)
abstract class SchoolDatabase :RoomDatabase(){

    abstract fun dao():SchoolDao

    companion object{
        @Volatile
        private var INSTANCE:SchoolDatabase?=null

        fun getInstance(context:Context):SchoolDatabase{
            //this done in Single thread
            synchronized(this){
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}