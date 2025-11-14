const slider = document.getElementById("slider");

let size = 12;

let i = -1;

const img = document.createElement("img");
img.id = "sliderImg";
const prefix = "./images/";

const postfix = ".jpg";
// img.src = prefix + i + postfix;


slider.append(img);



function start() {
    return setInterval(() => {
        img.src = prefix + ++i + postfix;
        console.log(img.src)
        if (i == 11)
            i = -1;
    }, 1000);
}


const infiniteSlider = start();


function stop() {
    clearInterval(infiniteSlider);
}