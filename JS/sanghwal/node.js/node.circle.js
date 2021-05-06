var PI = Math.PI;

exports.area = function(r){
    return PI * r * r;
}//넓이

exports.circumference = function(r){
    return 2 * PI * r;
}//둘레