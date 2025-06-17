let name = {
    firstName:"renga",
    lastName:"Nathan",
    
    
}

let printFullName=function (text) {
        console.log(this.firstName + " " + this.lastName + "," + text);
    }

printFullName.call(name);
let name2 = {
    firstName:"satish",
    lastName:"Nathan",
}

printFullName.apply(name2)

Function.prototype.myBind = function(...args){
    let obj = this;
    parms = args.slice(1);
    return function(...arg2){
        obj.apply(args[0],[...parms,...arg2]);
    }
}

const printing = printFullName.myBind(name2,"hello");
printing();