function joinString(n,f) {
    var s = "";
    for (let i = 0; i < n; i++) {
        s += f(i);
    }
    return s;
}
var digits = joinString(10,function(i){return i;});

console.log(digits);

var randomChars = joinString(8,function (i) {
    return String.fromCharCode(Math.floor(Math.random()*26)+"a".charCodeAt(0));
});

console.log(randomChars);