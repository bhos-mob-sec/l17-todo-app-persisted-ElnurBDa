package az.edu.bhos.l14todoapp.data

import az.edu.bhos.l14todoapp.data.dto.TodoLocalDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

interface TodoLocalData {
    fun observeItems(): Flow<List<TodoLocalDto>>
    suspend fun save(data: List<TodoLocalDto>)
}

class TodoLocalDataImpl(
    private val todoDao: TodoDao
) : TodoLocalData {

    override fun observeItems(): Flow<List<TodoLocalDto>> {
        return todoDao.getAllTodosOrderedByWeekday()
    }

    override suspend fun save(data: List<TodoLocalDto>) {
        todoDao.insertTodos(data)
    }
}
