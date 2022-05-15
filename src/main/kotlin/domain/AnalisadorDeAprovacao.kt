package domain

import domain.criterios.Basico
import domain.criterios.CriterioDeAprovacao
import domain.criterios.Intermediario
import domain.criterios.Rigoroso
import domain Boletim
import domain BoletimFechado

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

    //Definir criterio
    private lateinit var aprovCriterio: AnalisadorDeAprovacao

    //Definir método para definir e redefinir o criterio
    fun defineCriterio(criterio: CriterioDeAprovacao){
        this.aprovCriterio = criterio
    }

    //Definir função para fechar um boletim
    fun fechaBoletim(boletim : Boletim) : BoletimFechado{
        return BoletimFechado(
            medEPs = boletim.mediaEPs,
            medMini = boletim.mediaMiniEPs,
            mediaFim = aprovCriterio.mediaFinal(boletim),
            estaAprovado = aprovCriterio.foiAprovado(boletim))


    }

}
