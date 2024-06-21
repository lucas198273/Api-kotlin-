package com.apibiblioteca.gerenciador.repositorio

import com.apibiblioteca.gerenciador.modelos.LivroModel
import org.springframework.data.repository.CrudRepository

interface RepositorioLivros: CrudRepository<LivroModel,Int>{
    fun filtrarPorNome(nomeLivro: String): List<LivroModel>
}
