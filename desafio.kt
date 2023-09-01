// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(
    val nome: String?,
    val nivel: Nivel?
)

data class ConteudoEducacional(var nome: String, var duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Nome:${usuario.nome} \nFormação:$nome \nConteudo Educacional: $conteudos. \nNível:${usuario.nivel}\n")
    }
}

fun main() {

    val usuario1 = Usuario(nome = "Marcelo", nivel = Nivel.AVANCADO )
    val usuario2 = Usuario(nome = "Marcos", nivel = Nivel.BASICO )
    val usuario3 = Usuario(nome = "Maria", nivel = Nivel.INTERMEDIARIO )

    val formacao = Formacao(
        nome = "Formaçao Android",
        conteudos = listOf(
            ConteudoEducacional(nome = "Conhecendo Kotlin e sua Documentação Oficial", duracao = 1),
            ConteudoEducacional(nome = "Introdução Prática à Linguagem de Programação Kotlin", duracao = 2),
            ConteudoEducacional(nome = "Estruturas de Controle de Fluxo e Coleções em Kotlin", duracao = 2)
        )
    )

    val formacao1 = Formacao(
        nome = "Formaçao React",
        conteudos = listOf(
            ConteudoEducacional(nome = "Introdução ao Typescript", duracao = 3),
            ConteudoEducacional(nome = "POO com Typescript", duracao = 2),
            ConteudoEducacional(nome = "Fundamentos deo Typescript", duracao = 1)
        )
    )

    val formacao2 = Formacao(
        nome = "Formaçao React",
        conteudos = listOf(
            ConteudoEducacional(nome = "Introdução ao Typescript", duracao = 3),
            ConteudoEducacional(nome = "POO com Typescript", duracao = 2),
            ConteudoEducacional(nome = "Fundamentos deo Typescript", duracao = 1)
        )
    )

    formacao.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao2.matricular(usuario3)
}
