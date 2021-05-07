// var obj = {};
// var s = Symbol('heart');
// obj[s] = 3;
// console.log(obj);

Array.prototype[Symbol.for('shuffle')] = function () {
    var a = this;
    var m = a.length, t, i;
    while(m){
        // m미만의 인덱스 i를 무작위로 골라 하나씩 삭제
        i = Math.floor(Math.random()*m--); 
        // i와 m을 교환
        t = a[m];a[m] = a[i];a[i] = t;
    }
    return this;
};

var array = [0,1,2,3,4,5,6,7,8,9];
console.log(array[Symbol.for('shuffle')]());