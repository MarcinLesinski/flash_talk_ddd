package com.example.module_way.citizen

//import com.example.ddd.aggregate.citizen.adapters.read.CitizenReadRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/citizens")
internal class CitizenController(
//    private val repository: CitizenReadRepository,
    private val service: CitizenService,
) {
//    @GetMapping("/")
//    fun getAll() = repository.all()
//
//    @GetMapping("/{id}")
//    fun get(@PathVariable id: Long) = repository.find(id)
//
//    @PutMapping("/{id}/mandates")
//    fun giveMandate(@PathVariable("id") citizenId: Long, @RequestParam mandateType: Long, @RequestParam mandateValue: Long) {
//        service.giveMandateToCitizen(citizenId, mandateType, mandateValue)
//    }
//
//    @DeleteMapping("/{id}/mandates")
//    fun giveMandate(@PathVariable("id") citizenId: Long) {
//        service.payMandate(citizenId)
//    }
}
