/*
Em uma eleição sindical, concorreram ao cargo de presidente três candidatos (A, B e C). 
Durante a apuração dos votos, foram computados votos nulos e votos em branco, 
além dos votos válidos para cada candidato. Deve ser criado um programa de computador 
que efetue a leitura da quantidade de votos válidos para cada candidato, além de efetuar 
também a leitura da quantidade de votos nulos e em branco; o percentual correspondente 
de votos válidos em relação à quantidade de eleitores; o percentual correspondente de 
votos válidos do candidato A em relação à quantidade de eleitores; o percentual 
correspondente de votos válidos do candidato B em relação à quantidade de eleitores; 
o percentual correspondente de votos válidos do candidato C em relação à quantidade 
de eleitores; o percentual correspondente de votos nulos em relação à quantidade de 
eleitores e, por último, o percentual correspondente de votos em branco em relação 
à quantidade de eleitores.
*/

const votesA = 100
const votesB = 50
const votesC = 200
const voidVotes = 50
const blankVotes = 70

const totalVotes = votesA + votesB + votesC + voidVotes + blankVotes
const validVotes = votesA + votesB + votesC
const validVotesPercent = (validVotes * 100) / totalVotes
const votesAPercent = (votesA * 100) / totalVotes
const votesBPercent = (votesB * 100) / totalVotes
const votesCPercent = (votesC * 100) / totalVotes
const voidVotesPercent = (voidVotes * 100) / totalVotes
const blankVotesPercent = (blankVotes * 100) / totalVotes

console.log(totalVotes)
console.log(validVotes)
console.log(validVotesPercent.toFixed(1))
console.log(votesAPercent.toFixed(1))
console.log(votesBPercent.toFixed(1))
console.log(votesCPercent.toFixed(1))
console.log(voidVotesPercent.toFixed(1))
console.log(blankVotesPercent.toFixed(1))