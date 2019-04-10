package com.ifpr.luiz.todolist.entities.bd

import androidx.room.Database
import com.ifpr.luiz.todolist.entities.Tarefa
import com.ifpr.luiz.todolist.entities.bd.DAO.TarefaDAO

@Database(entities = arrayOf(Tarefa::class), version = 1)
abstract class AppDataBase {
    abstract fun TarefaDAO(): TarefaDAO
}