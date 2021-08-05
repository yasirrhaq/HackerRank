
/**
 * @author: astidhiyaa on 04/08/21.
 */    
fun ArrayList<Int>.sumAllNum(): Int{
    var result: Int = 0
    this.forEach{            
        result += it
    }
    return result
}