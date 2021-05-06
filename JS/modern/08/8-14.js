function memorize(f) {
    var cache = {};
    return function(x){
        if (cache[x] == undefined)cache[x] = f(x);
        return cache[x];
    };
}

function isPrime(n){
    // n이 2보다 크면 false
    if(n<2) return false;
    var m = Math.sqrt(n);
    // i = 2~ m까지 반복
    for(var i=2; i<=m; i++){
        if(n%i == 0) return false; // n이 i로 나누어 떨어지면 멈춤
    }
    return true;
}
var isPrime_memo = memorize(isPrime);
var N = 100;
for(var i=2; i<=N; i++) isPrime_memo(i);

for(var i=2; i+2<=N; i++){
    if(isPrime_memo(i) && isPrime_memo(i+2)) console.log(`${i},${i+2}`);
}