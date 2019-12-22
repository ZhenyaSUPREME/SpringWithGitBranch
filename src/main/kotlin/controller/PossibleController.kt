package controller

import model.Possible
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import repository.PossibleRepository
@RestController
@RequestMapping("/api/possible")
class PossibleController (var possibleRepository: PossibleRepository){
    @GetMapping
    fun getAllPossible(): Flux<Possible> {
        return possibleRepository.findAll()
    }
    @PostMapping
    fun createOneList(@RequestBody possible: Possible): Mono<Possible> {
        return possibleRepository.save(possible)
    }
}