package repository

import model.Possible
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PossibleRepository: ReactiveMongoRepository<Possible,String>{

}