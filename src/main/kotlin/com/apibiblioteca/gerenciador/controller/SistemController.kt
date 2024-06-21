package com.apibiblioteca.gerenciador.controller



import com.apibiblioteca.gerenciador.controller.requisicao.LivroModelPost
import com.apibiblioteca.gerenciador.controller.requisicao.LivroModelPut
import com.apibiblioteca.gerenciador.extencoes.CovenverterClassePostParaModelo
import com.apibiblioteca.gerenciador.modelos.LivroModel
import com.apibiblioteca.gerenciador.servicos.SistemService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sistemcontroller")
class SistemController(
    val sistemService: SistemService
) {
    @GetMapping("/buscar")
    fun getNome(@RequestParam nome: String?): List<LivroModel> {
        return sistemService.getNome(nome)
    }
    @GetMapping
    fun getListaLivros(): List<LivroModel> {
        println("Obtendo lista de livros")
        return sistemService.getListaLivros()
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun criar(@RequestBody livroModelPost: LivroModelPost) {
        sistemService.criar(livroModelPost.CovenverterClassePostParaModelo())
    }
    @GetMapping("/{id}")
    fun getLivro(@PathVariable id: Int): LivroModel {
        return sistemService.getId(id)
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun atualizar(@PathVariable id: Int, @RequestBody livroModel: LivroModelPut) {
        return sistemService.atualizar(livroModel.CovenverterClassePostParaModelo(id))
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletar(@PathVariable id: Int) {
        sistemService.deletar(id)
    }
}
