package com.apibiblioteca.gerenciador.modelos

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "livro")
data class LivroModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = false)
    var nomeLivro: String,

    @Column(nullable = false)
    var numeroDeFolhas: Int,

    @Column(nullable = false)
    var tema: String,

    @Column(nullable = false)
    var livroEmprestado: Boolean = false
) {

}
