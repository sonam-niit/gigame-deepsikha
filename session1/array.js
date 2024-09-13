const array=[1,2,3,4,5,6,7];
const data= ['A','B','C','D','E','F','G'];

console.log(array);
console.log(data);
//access perticular element
console.log(array[4]);
//access entire array using loop
for(let i=0;i<array.length;i++){
    console.log(array[i]);
}
//enhanced for of loop
for(let d of data){
    console.log(d);
}
//handler function
const callback=function(value){
    console.log(value);
}
//forEach function //pass handler here
data.forEach(callback)