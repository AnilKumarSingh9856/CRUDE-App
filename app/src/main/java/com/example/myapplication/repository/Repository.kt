package com.example.myapplication.repository

import com.example.myapplication.room.BookDB
import com.example.myapplication.room.BookEntity

class Repository(val bookDB: BookDB) {

    suspend fun addBookToRoom(bookEntity: BookEntity){
        bookDB.bookDao().addBook(bookEntity)
    }

    fun getAllBooks() = bookDB.bookDao().getAllBooks()

    suspend fun deleteBookFromRoom(bookEntity: BookEntity){
        bookDB.bookDao().deleteBook((bookEntity = bookEntity))
    }

    suspend fun updateBook(bookEntity: BookEntity){
        bookDB.bookDao().updateBook(bookEntity)
    }
}