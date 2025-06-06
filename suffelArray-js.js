function shuffleArray(array) {
    let shuffled = [];
    let copy = [...array]; 

    while (copy.length > 0) {
        let randomIndex = Math.floor(Math.random() * copy.length);
        shuffled.push(copy.splice(randomIndex,1)[0]);
    }

    return shuffled;
}
const myArray = [1, 2, 3, 4, 5, 6];
const shuffled = shuffleArray(myArray);

console.log(shuffled);