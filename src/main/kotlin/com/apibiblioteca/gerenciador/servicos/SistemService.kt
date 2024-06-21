package com.apibiblioteca.gerenciador.servicos

import com.apibiblioteca.gerenciador.modelos.LivroModel
import com.apibiblioteca.gerenciador.repositorio.RepositorioLivros
import org.springframework.stereotype.Service

@Service
class SistemService (

    val livros: RepositorioLivros
){
    fun getNome(nomeLivro: String?): List<LivroModel> {
        nomeLivro?.let {
            return livros.filtrarPorNome(nomeLivro)
        }
        return  livros.findAll().toList()
    }
    fun getListaLivros(): List<LivroModel> {
        println("Obtendo lista de livros")
        return  livros.findAll().toList()
    }
    fun getId(id: Int): LivroModel {
        return livros.findById(id).get()
    }
    fun atualizar(livroModel: LivroModel) {
        if(!livros.existsById(livroModel.id!!)){
            throw  Exception()
        }
        livros.save(livroModel)
    }
    fun criar(livroModel: LivroModel) {
        livros.save(livroModel)
        println("Livro criado: $livroModel")
    }


    fun deletar(id: Int) {
        if(!livros.existsById(id)){
            throw  Exception()
        }
        livros.deleteById(id)
    }





}