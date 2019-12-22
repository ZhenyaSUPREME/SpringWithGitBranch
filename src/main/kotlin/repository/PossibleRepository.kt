package repository

import controller.Possible
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PossibleRepository: ReactiveMongoRepository<Possible,String>{

}