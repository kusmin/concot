package concot

class Categoria {

    String nome

    static constraints = {
        nome nullable:false, blank:false, maxSixe:128, unique:true
    }

}
