package org.example.lesson_2

fun main() {
    val countOfWorkers: Float = 50f   //Число работников
    val countOfInterns: Float = 30f //Число стажеров
    val countOfAll: Float = countOfWorkers + countOfInterns
    val workerSalary: Float = 30000f
    val internSalary: Float = 20000f
    val allWorkersSalary: Float = countOfWorkers * workerSalary //Общая зп работников
    val allInternsSalary: Float = countOfInterns * internSalary //Общая зп стажеров
    val allSalary: Float = allWorkersSalary + allInternsSalary  //Общая ЗП сотрудников
    val averageSalary: Float = allSalary/countOfAll
    println("Расходы на выплату зарплаты постоянным сотрудникам составляют $allWorkersSalary руб.")
    println("Общие расходы по зарплате по выходу стажеров составляют $allSalary руб.")
    println("Средняя зарплата одного сотрудника составляет $averageSalary руб.")
}