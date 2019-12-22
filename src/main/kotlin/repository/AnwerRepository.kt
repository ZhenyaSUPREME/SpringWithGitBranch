package repository

import model.Anwer
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface AnwerRepository:ReactiveMongoRepository<Anwer,String> {



}