/*
Ler o valor correspondente ao salário mensal (variável SM) 
de um trabalhador e também o valor percentual de reajuste (variável PR) 
a ser atribuído. Apresentar o valor do novo salário (variável NS).
*/

const newSalary = (salary, raise) => {
    return salary + (salary * (raise / 100))
}

console.log(newSalary(2000, 4).toFixed(2))
console.log(newSalary(2500, 10).toFixed(2))
console.log(newSalary(1000, 5).toFixed(2))