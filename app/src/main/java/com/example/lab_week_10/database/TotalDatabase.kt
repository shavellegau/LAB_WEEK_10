package com.example.lab_week_10.database

import androidx.room.Database
import androidx.room.RoomDatabase

// Create a RoomDatabase
@Database(entities = [Total::class], version = 1)
abstract class TotalDatabase : RoomDatabase() {

    // Expose the DAO
    abstract fun totalDao(): TotalDao
}