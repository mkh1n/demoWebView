const body = document.querySelector(".window");
const prg = document.querySelector(".prg");

const hello = () => {
    prg.textContent = "CHANGED"!;
    alert("load complite!");
};


body.addEventListener("click", hello);
