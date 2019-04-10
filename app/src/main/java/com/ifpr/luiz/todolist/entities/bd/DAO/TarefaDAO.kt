package com.ifpr.luiz.todolist.entities.bd.DAO

import androidx.room.*
import com.ifpr.luiz.todolist.entities.Tarefa

@Dao
interface TarefaDAO {
    @Query("SELECT *FROM  tb_tarefa")
    fun getAll(): List<Tarefa>

    @Insert
    fun insert(tarefa:Tarefa): Long

    @Update
    fun update(tarefa: Tarefa)

    @Delete
    fun remove(tarefa: Tarefa)

    @Query("SELECT * FROM tb_tarefa where id = :id LIMIT 1")
    fun findById(id: Int): Tarefa?
}