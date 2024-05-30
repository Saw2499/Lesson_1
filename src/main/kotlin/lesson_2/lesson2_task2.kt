package org.example.lesson_2

fun main() {
    val countOfWorkers: Byte = 50   //Число работников
    val countOfInterns: Byte = 30 //Число стажеров
    val countOfAll: Int = countOfWorkers + countOfInterns
    val workerSalary: Short = 30000
    val internSalary: Short = 20000
    val allWorkersSalary: Int = countOfWorkers * workerSalary //Общая зп работников
    val allInternsSalary: Int = countOfInterns * internSalary //Общая зп стажеров
    val allSalary: Int = allWorkersSalary + allInternsSalary  //Общая ЗП сотрудников
    val averageSalary: Int = allSalary/countOfAll
    println("Расходы на выплату зарплаты постоянным сотрудникам составляют $allWorkersSalary руб.")
    println("Общие расходы по зарплате по выходу стажеров составляют $allSalary руб.")
    println("Средняя зарплата одного сотрудника составляет $averageSalary руб.")
}