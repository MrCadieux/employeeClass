
//Construct the employee object
class employee constructor(var employeeName: String?,
                           var employeeNumber: Int?,
                           var employeeShift: Int?){

    //default message on employee creation
    init{
        println("New Employee Added: $employeeName")
    }

    //Print all information of employee
    fun printEmployee(){
        println("Name: $employeeName\nNumber: $employeeNumber\nShift: $employeeShift\n")


    }

}