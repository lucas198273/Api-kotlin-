package com.apibiblioteca.gerenciador.extencoes

import com.apibiblioteca.gerenciador.controller.requisicao.LivroModelPost
import com.apibiblioteca.gerenciador.controller.requisicao.LivroModelPut
import com.apibiblioteca.gerenciador.modelos.LivroModel


fun LivroModelPost.CovenverterClassePostParaModelo(): LivroModel {
    return LivroModel(
        nomeLivro = this.nomeLivro,
        numeroDeFolhas = this.numeroDeFolhas,
        tema = this.tema,
        livroEmprestado = this.livroEmprestado
    )
}
fun LivroModelPut.CovenverterClassePostParaModelo(id: Int): LivroModel {
    return LivroModel(

            nomeLivro = this.nomeLivro,
            numeroDeFolhas = this.numeroDeFolhas,
            tema = this.tema,
            livroEmprestado = this.livroEmprestado
        )
    }

