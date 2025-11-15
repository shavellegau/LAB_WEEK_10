package com.example.lab_week_10.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

// Declare a Dao with the @Dao annotation
@Dao
interface TotalDao {

    // Insert a row into the total table
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(total: Total)

    // Update an existing row
    @Update
    fun update(total: Total)

    // Delete an existing row
    @Delete
    fun delete(total: Total)

    // Custom Query to get the total by ID (returns list)
    @Query("SELECT * FROM total WHERE id = :id")
    fun getTotal(id: Long): List<Total>

}