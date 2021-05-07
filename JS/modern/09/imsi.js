function F(){};
console.log(F.prototype);

function Cricle(center, radius){
    this.center = center;
    this.radius = radius;
}
Cricle.prototype.area = function(){
    return Math.PI * this.radius * this.radius
};
var c1 = new Cricle({x:0,y:0},2.0);
var c2 = new Cricle({x:0,y:1},3.0);
var c3 = new Cricle({x:1,y:0},1.0);
console.log("넓이 : "+c1.area());