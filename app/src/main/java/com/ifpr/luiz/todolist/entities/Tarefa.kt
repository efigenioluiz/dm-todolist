package com.ifpr.luiz.todolist.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_tarefa")
data class Tarefa(
        @ColumnInfo(name = "title")
        var title: String,

        @ColumnInfo(name = "descricao")
        var descricao: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int= 0

}