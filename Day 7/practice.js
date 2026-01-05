// var a=10;
// let b=20;
// const c=30;
// console.log(a,b,c);

let name = "Tejas";     // string
let age = 22;          // number
let isActive = true;   // boolean
let x = null;          // null
let y;                 // undefined
let obj = {};          // object
let arr = [];          // array

console.log(typeof name);
console.log(typeof age);
console.log(typeof x);
console.log(typeof y);
console.log(typeof obj);
console.log(typeof arr);


let a = 10;
let b = 3;

console.log(a + b);  // addition
console.log(a - b);
console.log(a * b);
console.log(a / b);
console.log(a % b);  // remainder


let marks = 75;

if (marks >= 60) {
    console.log("First Class");
} else if (marks >= 40) {
    console.log("Pass");
} else {
    console.log("Fail");
}


// for loop
for (let i = 1; i <= 5; i++) {
    console.log(i);
}


// while loop
let i = 1;
while (i <= 5) {
    console.log(i);
    i++;
}

// do whilw
let j=0;
do{
    console.log(j);
    j++;

}while(j<=3);


// functions
function add(a,b){
    return a+b;

}
console.log(add(5,3));

// arrow function

const multiply=(a,b)=> a*b;
console.log(multiply(4,5));

//Arrays
// let fruits=[];
// let n=prompt("enteer the number of fruits:");
// for(let i=0; i<n; i++){
//     let fruit=prompt("enter the fruit" + (i+1));
//     fruits.push(fruit);
// }
// console.log("fruits", fruits);


