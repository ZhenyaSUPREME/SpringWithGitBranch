package controller

import org.springframework.data.mongodb.core.mapping.Document


@Document
data class Possible (var id:String,var age :Int){

}