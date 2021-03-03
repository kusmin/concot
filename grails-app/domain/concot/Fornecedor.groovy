package concot

class Fornecedor {

    String nome
    static constraints = {
        nome nullable:false, unique:true, maxSixe:128, blank:false
    }

}
